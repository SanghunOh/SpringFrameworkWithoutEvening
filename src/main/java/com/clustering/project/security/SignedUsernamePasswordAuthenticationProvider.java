package com.clustering.project.security;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Used to authenticate against a given {@link SignedUsernamePasswordAuthenticationToken}.
 *  
 * @author 
 */
public class SignedUsernamePasswordAuthenticationProvider extends DaoAuthenticationProvider {
	/* (non-Javadoc)
	 * @see org.springframework.security.authentication.dao.AbstractUserDetailsAuthenticationProvider#supports(java.lang.Class)
	 */
	@Override
	public boolean supports(Class<? extends Object> authentication) {
        return (SignedUsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}	

	/* (non-Javadoc)
	 * @see org.springframework.security.authentication.dao.DaoAuthenticationProvider#additionalAuthenticationChecks(org.springframework.security.core.userdetails.UserDetails, org.springframework.security.authentication.UsernamePasswordAuthenticationToken)
	 */
	@Override
	protected void additionalAuthenticationChecks(UserDetails userDetails,
			UsernamePasswordAuthenticationToken authentication)
			throws AuthenticationException {
		super.additionalAuthenticationChecks(userDetails, authentication);
		
		SignedUsernamePasswordAuthenticationToken signedToken = 
			(SignedUsernamePasswordAuthenticationToken) authentication;
		
		if(signedToken.getRequestSignature() == null) {
			throw new BadCredentialsException(messages.getMessage(
                    "SignedUsernamePasswordAuthenticationProvider.missingSignature", "Missing request signature"),
                    null);
//                    isIncludeDetailsObject() ? userDetails : null);
		}
		
		// calculate expected signature
		if(!signedToken.getRequestSignature().equals(calculateExpectedSignature(signedToken))) {
			throw new BadCredentialsException(messages.getMessage(
                    "SignedUsernamePasswordAuthenticationProvider.badSignature", "Invalid request signature"),
                    null);
//          isIncludeDetailsObject() ? userDetails : null);
		}
	}

	/**
	 * Given a signed token, calculates the signature value expected to be suppliled.
	 * 
	 * @param signedToken the signed token to evaluate
	 * @return the expected signature
	 */
	private String calculateExpectedSignature(SignedUsernamePasswordAuthenticationToken signedToken) {
		return signedToken.getPrincipal() + "|+|" + signedToken.getCredentials();
	}
}