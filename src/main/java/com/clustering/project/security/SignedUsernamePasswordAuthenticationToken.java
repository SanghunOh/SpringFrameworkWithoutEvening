package com.clustering.project.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.SpringSecurityCoreVersion;

public class SignedUsernamePasswordAuthenticationToken extends UsernamePasswordAuthenticationToken{

	private static final long serialVersionUID = SpringSecurityCoreVersion.SERIAL_VERSION_UID;
	
	private String requestSignature ;
	
	public SignedUsernamePasswordAuthenticationToken(Object principal, Object credentials, Object requestSignature) {
		super(principal, credentials);
		this.requestSignature = (String) requestSignature;
	}

	public String getRequestSignature() {
		return requestSignature;
	}

	public void setRequestSignature(Object requestSignature) {
		this.requestSignature = (String) requestSignature;
	}

}
