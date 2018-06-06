package com.clustering.project.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDao{

	private JdbcTemplate jdbcTemplate;
    
	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
    public List<Object> getList(String sqlMapId, Object dataMap){
    	String query = "select * from CIP_MEMBER "
    			+ "where 1 = 1 "
    			+ "order by NAME" ;
    	return this.jdbcTemplate.queryForObject(query, List.class);
    }

	public Object getObject(String sqlMapId, Object dataMap) {
		String memberSeq = (String) ((Map)dataMap).get("MEMBER_SEQ");
    	String query = "select * from CIP_MEMBER "
    			+ " where MEMBER_SEQ = '" + memberSeq +"'";
    	return this.jdbcTemplate.queryForObject(query, Map.class);
	}

	public Object saveObject(String sqlMapId, Object dataMap) {
		Integer result = null;
		
		return result;
	}

	public Object deleteObject(String sqlMapId, Object dataMap) {
		
		Integer result = null;
		return result;
	}

}
