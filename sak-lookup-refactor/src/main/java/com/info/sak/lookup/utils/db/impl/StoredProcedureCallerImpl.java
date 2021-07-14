package com.info.sak.lookup.utils.db.impl;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.info.sak.lookup.utils.db.StoredProcedureCaller;


@Repository
public class StoredProcedureCallerImpl implements StoredProcedureCaller {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7156822173198221948L;
	private static final Logger LOGGER = LogManager.getLogger(StoredProcedureCallerImpl.class);
	
//	@Autowired
//	private SessionFactory sessionFactory;

	@Autowired
	private EntityManager entityManager;

	Session getSession() {
		return entityManager.unwrap(Session.class);
	}


	@Override
	public void registerRequestReportPagesCount(Long requestId, Integer numberOfPages) throws Exception{
		
		if(LOGGER.isDebugEnabled()){
			LOGGER.debug("Executing INDEX_COUNT procedure with requestId : " + requestId + " and numberOfPages : " + numberOfPages);
		}
		
//		Session session = getSession().getSession();
		Session session = getSession();

		
		ProcedureCall call = session.createStoredProcedureCall("INDEX_COUNT");
		call.registerParameter("P_REQ_ID", Long.class, ParameterMode.IN).bindValue(requestId);
		call.registerParameter("P_PAPERS_CNT", Integer.class, ParameterMode.IN).bindValue(numberOfPages);
		
		call.getOutputs();
		
		if(LOGGER.isDebugEnabled()){
			LOGGER.debug("INDEX_COUNT procedure executed with requestId : " + requestId + " and numberOfPages : " + numberOfPages);
		}		
	}
}
