package com.clustering.project.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier("userDetailsService")
	UserDetailsService userDetailsService;

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/organization/edit").access("hasAnyRole('ROLE_ADMIN','ROLE_GUEST')")
								.antMatchers("/member/*").access("hasAnyRole('ROLE_ADMIN','ROLE_GUEST')")
			.and()
			.formLogin().loginPage("/loginForm").loginProcessingUrl("/j_spring_security_check")
				.failureUrl("/loginForm?fail=true").usernameParameter("email").passwordParameter("password")
			.and()
			.logout().logoutSuccessUrl("/").logoutUrl("/j_spring_security_logout")
			.and()
			.exceptionHandling().accessDeniedPage("/exception/403")
			.and()
			.csrf().disable();

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}

}