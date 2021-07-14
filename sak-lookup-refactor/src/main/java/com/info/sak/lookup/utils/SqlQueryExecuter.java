package com.info.sak.lookup.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.LongType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Component
public class SqlQueryExecuter {

//	@Autowired
//	private SessionFactory sessionFactory;


	@Autowired
	private EntityManager entityManager;

	Session getSession() {
		return entityManager.unwrap(Session.class);
	}

	@Transactional
	public <T> List<T> listInNewTransactionIfNeeded(String sql){
		
//		Session session = getSession().getSession();
		Session session = getSession();
		List<T> list = session.createSQLQuery(sql).list();
		return list;
	}
	
	@Transactional
	public <T> List<T> listInNewTransactionIfNeeded(String sql, Class<T> clazz){
		
		Session session = getSession() ;
		List<T> list = session.createSQLQuery(sql).addEntity(clazz).list();
		return list;
	}
	
	@Transactional
	public long countInNewTransactionIfNeeded(String sql){
		
//		Session session = getSession().getSession();
		Session session = getSession();
		List<Long> list = session.createSQLQuery(sql).addScalar("count", LongType.INSTANCE).list();
		
		if(!list.isEmpty()){
			return list.get(0);
		}
		
		return 0;
	}
	

}
