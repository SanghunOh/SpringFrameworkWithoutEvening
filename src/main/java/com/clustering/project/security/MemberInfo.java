package com.clustering.project.security;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MemberInfo implements UserDetails {

	private static final long serialVersionUID = 1L;

	private String memberSeq; // Member Seq
	private String memberID; // Member ID
	private String email; // Member Email
	private String memberName; // Member Name
	private String password; // Password
	private Set<GrantedAuthority> authorities; // Roles by Member

	public void setAuthorities(Set<GrantedAuthority> authorities) {
		this.authorities = authorities;
	}
	public MemberInfo(Map<String, String> resultMember, Set<GrantedAuthority> authorities) {
		this.memberSeq = (String) resultMember.get("MEMBER_SEQ");
		this.memberID = (String) resultMember.get("MEMBER_ID");
		this.email = (String) resultMember.get("EMAIL");
		this.memberName = (String) resultMember.get("NAME");
		this.password = (String) resultMember.get("CRYPT_PASSWORD");
		this.authorities = authorities;
	}
	public MemberInfo(String memberSeq, String memberID, String email, String MemberName,
			String password, Collection<? extends GrantedAuthority> authorities) {
		this.memberSeq = memberSeq;
		this.memberID = memberID;
		this.email = email;
		this.memberName = MemberName;
		this.password = password;
		this.authorities = (Set<GrantedAuthority>) authorities;
	}

	public MemberInfo(String memberSeq, String memberID, String email, String MemberName,
			String password, Set<GrantedAuthority> authorities) {
		this.memberSeq = memberSeq;
		this.memberID = memberID;
		this.email = email;
		this.memberName = MemberName;
		this.password = password;
		this.authorities = authorities;
	}

	public String getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(String memberSeq) {
		this.memberSeq = memberSeq;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getUsername() {
		return memberID;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
}