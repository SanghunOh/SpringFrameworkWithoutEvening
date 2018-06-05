package com.clustering.project.service;

import java.util.List;

public interface ShareService {

	public List<Object> getList(String sqlMapId, Object dataMap);

	public Object getObject(String sqlMapId, Object dataMap);

	public Object saveObject(String sqlMapId, Object dataMap);

	public Object deleteObject(String sqlMapId, Object dataMap);
}
