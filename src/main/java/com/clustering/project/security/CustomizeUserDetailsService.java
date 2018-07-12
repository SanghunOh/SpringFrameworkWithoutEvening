package com.clustering.project.security;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.clustering.project.dao.ShareDao;

//@Service
public class CustomizeUserDetailsService implements UserDetailsService {

	@Autowired
	private ShareDao dao;

	@Override
	public MemberInfo loadUserByUsername(final String username) throws UsernameNotFoundException {

		Map<String, Object> dataMap = new HashMap<String, Object>(); 
		
		// get Member Information
		String sqlMapId = "member.read";
		dataMap.put("MEMBER_ID", username);

		Map<String, String> resultMember = (Map<String, String>) dao.getObject(sqlMapId, dataMap);
        if (resultMember == null) {
            throw new UsernameNotFoundException("User details not found with this username: " + username);
        }
        
		sqlMapId = "authorityRmember.list";

		List<Object> resultAuthorities = dao.getList(sqlMapId, resultMember);

		return new MemberInfo(resultMember, buildUserAuthority(resultAuthorities));
	}

	private Set<GrantedAuthority> buildUserAuthority(List<Object> resultAuthorities) {

		Set<GrantedAuthority> resultObject = new HashSet<GrantedAuthority>();

		 Iterator iterator = resultAuthorities.iterator();
	     while(iterator.hasNext()) {
	    	Map<String,String> element = (Map<String, String>) iterator.next();
	    	resultObject.add(new SimpleGrantedAuthority(element.get("AUTHORITY_ID")));
	     }
		
		return resultObject;
	}
}