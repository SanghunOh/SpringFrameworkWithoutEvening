package com.clustering.project.security;

import java.io.IOException;
import java.util.List;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

public class IPRoleAuthenticationFilter extends OncePerRequestFilter {
	private String targetRole;
	private List<String> allowedIPAddresses;

	public String getTargetRole() {
		return targetRole;
	}

	public void setTargetRole(String targetRole) {
		this.targetRole = targetRole;
	}

	public List<String> getAllowedIPAddresses() {
		return allowedIPAddresses;
	}

	public void setAllowedIPAddresses(List<String> allowedIPAddresses) {
		this.allowedIPAddresses = allowedIPAddresses;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (authentication != null && targetRole != null) {
			boolean shouldCheck = false;
			for (GrantedAuthority authority : authentication.getAuthorities()) {
				if (authority.getAuthority().equals(targetRole)) {
					shouldCheck = true;
					break;
				}
			}
			if (shouldCheck && allowedIPAddresses.size() > 0) {
				boolean shouldAllow = false;
				for (String ipAddress : allowedIPAddresses) {
					if (request.getRemoteAddr().equals(ipAddress)) {
						shouldAllow = true;
						break;
					}
				}
				if (!shouldAllow) {
					throw new AccessDeniedException(
							"Access has been denied for your IP address: " + request.getRemoteAddr());
					
				}
				filterChain.doFilter(request, response);
			}else{
				filterChain.doFilter(request, response);
			}
		} else {
			filterChain.doFilter(request, response);
			
		}
	}

}