package com.clustering.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clustering.project.dao.CommonCodeDao;

@Service
public class CommonCodeService {

	@Autowired
	private CommonCodeDao dao;
	
	public void setDao(CommonCodeDao commonCodeDao) {
		this.dao = commonCodeDao;
	}

	public List<Object> getList(String sqlMapId, Object dataMap) {
		List<Object> resultObject = dao.getList(sqlMapId, dataMap);
		return resultObject;
	}

	public Object getObject(String sqlMapId, Object dataMap) {
		Object resultObject = dao.getObject(sqlMapId, dataMap);
		return resultObject;
	}

	public Object saveObject(String sqlMapId, Object dataMap) {
		return null;
	}

	public Object deleteObject(String sqlMapId, Object dataMap) {
		return null;
	}
}
