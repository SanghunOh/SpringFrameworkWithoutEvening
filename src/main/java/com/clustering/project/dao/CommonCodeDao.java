package com.clustering.project.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class CommonCodeDao {

	public List<Object> getList(String sqlMapId, Object dataMap) {
		
		ShareDaoImpl shareDaoImpl = new ShareDaoImpl();
		List<Object> resultObject = shareDaoImpl.getList(sqlMapId, dataMap);
		
		return resultObject;
	}

	public Object getObject(String sqlMapId, Object dataMap) {
		ShareDaoImpl shareDaoImpl = new ShareDaoImpl();
		Map<String, Object> resultObject = (Map<String, Object>) shareDaoImpl.getObject(sqlMapId, dataMap);
		
		return resultObject;
	}

}
