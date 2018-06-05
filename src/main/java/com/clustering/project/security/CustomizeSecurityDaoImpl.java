package com.clustering.project.security;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

public class CustomizeSecurityDaoImpl extends JdbcDaoImpl {

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		// get User List by usersByUsernameQuery
		List<UserDetails> users = loadUsersByUsername(username);

		if (users.size() == 0) {
			logger.debug("Query returned no results for user '" + username + "'");

			UsernameNotFoundException ue = new UsernameNotFoundException(
					messages.getMessage("JdbcDaoImpl.notFound",
							new Object[] { username }, "Username {0} not found"));
			throw ue;
		}

		MemberInfo user = (MemberInfo) users.get(0); // contains no
														// GrantedAuthority[]

		Set<GrantedAuthority> dbAuthsSet = new HashSet<GrantedAuthority>();

		// get authorities by authoritiesByUsernameQuery
		if (getEnableAuthorities()) {
			dbAuthsSet.addAll(loadUserAuthorities(user.getMemberSeq()));
		}

		// 
		if (getEnableGroups()) {
			dbAuthsSet.addAll(loadGroupAuthorities(user.getUsername()));
		}

		List<GrantedAuthority> dbAuths = new ArrayList<GrantedAuthority>(
				dbAuthsSet);
		user.setAuthorities(dbAuths);

		if (dbAuths.size() == 0) {
			logger.debug("User '" + username
					+ "' has no authorities and will be treated as 'not found'");

			UsernameNotFoundException ue = new UsernameNotFoundException(
					messages.getMessage("JdbcDaoImpl.noAuthority",
							new Object[] { username },
							"User {0} has no GrantedAuthority"));
			throw ue;
		}

		return user;
	}

	@Override
	protected List<UserDetails> loadUsersByUsername(String username) {
		return getJdbcTemplate().query(getUsersByUsernameQuery(),
				new String[] { username }, new RowMapper<UserDetails>() {
					@Override
					public UserDetails mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						String memberSeq = rs.getString("MEMBER_SEQ");
						String memberID = rs.getString("MEMBER_ID");
						String email = rs.getString("EMAIL");
						String password = rs.getString("PASSWORD");
						String memberName = rs.getString("NAME");
						return new MemberInfo(memberSeq, memberID, email, memberName,
								password, AuthorityUtils.NO_AUTHORITIES);
					}

				});
	}

	@Override
	protected List<GrantedAuthority> loadUserAuthorities(String username) {
		return getJdbcTemplate().query(getAuthoritiesByUsernameQuery(),
				new String[] { username }, new RowMapper<GrantedAuthority>() {
					@Override
					public GrantedAuthority mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						String roleName = getRolePrefix() + rs.getString(1);

						return new SimpleGrantedAuthority(roleName);
					}
				});
	}

	@Override
	protected List<GrantedAuthority> loadGroupAuthorities(String username) {
		return super.loadGroupAuthorities(username);
	}
}