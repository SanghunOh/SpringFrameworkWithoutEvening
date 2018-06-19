package com.clustering.project.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.clustering.project.dao.ShareDao;

@Service("userDetailsService")
public class CustomizeUserDetailsService implements UserDetailsService {

	@Autowired
	private ShareDao dao;

	@Transactional(readOnly=true)
	@Override
	public MemberInfo loadUserByUsername(final String username) throws UsernameNotFoundException {

		Map<String, Object> dataMap = new HashMap<String, Object>(); 
		
		// get Member Information
		String sqlMapId = "member.read";

		dataMap.put("MEMBER_ID", username);
		
		dataMap = (Map<String, Object>) dao.getObject(sqlMapId, dataMap);

		// get Granted Authority
		sqlMapId = "authorityRmember.list";

		dataMap.put("MEMBER_SEQ", dataMap.get("MEMBER_SEQ"));
		
		List<Object> resultAuthorities = dao.getList(sqlMapId, dataMap);

		List<GrantedAuthority> authorities = buildUserAuthority(resultAuthorities);

		return new MemberInfo(dataMap, (Set<GrantedAuthority>) authorities);
		

	}

	private MemberInfo buildUserForAuthentication(Map<String, String> resultMember, List<GrantedAuthority> authorities) {
		return new MemberInfo(resultMember.get("MEMBER_SEQ"), resultMember.get("MEMBER_ID"), resultMember.get("EMAIL"), 
				resultMember.get("NAME"), resultMember.get("CRYPT_PASSWORD"), authorities);
	}

	private List<GrantedAuthority> buildUserAuthority(List<Object> resultAuthorities) {

		Set<GrantedAuthority> setAuths = new HashSet<GrantedAuthority>();

		 Iterator iterator = resultAuthorities.iterator();
	     while(iterator.hasNext()) {
	    	Map<String,String> element = (Map<String, String>) iterator.next();
			setAuths.add(new SimpleGrantedAuthority(element.get("AUTHORITY_ID")));
	     }
		
		List<GrantedAuthority> Result = new ArrayList<GrantedAuthority>(setAuths);

		return Result;
	}
}