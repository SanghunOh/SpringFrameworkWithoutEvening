package com.clustering.project.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

public class RequestHeaderProcessingFilter extends AbstractAuthenticationProcessingFilter{

	private String usernameHeader = "j_username";
	private String passwordHeader = "j_password";
	private String signatureHeader = "j_signature";
	
	
	protected RequestHeaderProcessingFilter() {
	    super("/j_spring_security_filter");
//	    super("/login_direct");
	 }
	
	//getters and setters
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException, IOException, ServletException {
		String username = request.getHeader(usernameHeader);
		String password = request.getHeader(passwordHeader);
		String signature = request.getHeader(passwordHeader);
		
		SignedUsernamePasswordAuthenticationToken authRequest = new SignedUsernamePasswordAuthenticationToken(username, password, signature);
		
		return this.getAuthenticationManager().authenticate(authRequest); 
	}

	public String getUsernameHeader() {
		return usernameHeader;
	}

	public void setUsernameHeader(String usernameHeader) {
		this.usernameHeader = usernameHeader;
	}

	public String getPasswordHeader() {
		return passwordHeader;
	}

	public void setPasswordHeader(String passwordHeader) {
		this.passwordHeader = passwordHeader;
	}

	public String getSignatureHeader() {
		return signatureHeader;
	}

	public void setSignatureHeader(String signatureHeader) {
		this.signatureHeader = signatureHeader;
	}
}