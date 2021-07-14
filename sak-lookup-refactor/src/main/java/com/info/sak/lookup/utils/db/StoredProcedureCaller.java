package com.info.sak.lookup.utils.db;

import java.io.Serializable;

public interface StoredProcedureCaller extends Serializable{

	void registerRequestReportPagesCount(Long requestId, Integer numberOfPages) throws Exception;

}
