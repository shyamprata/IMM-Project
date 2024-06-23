package com.inventory.SecuritConfig;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
@Configuration
public class Config {
	@Bean
 public UserDetailsService userDetailsService(){
	  UserDetails userDetails=User.builder()
			  .username("shyam")
			  .password("1234")
			  .roles("ADMIN")
			  .build();
			  
	return new InMemoryUserDetailsManager(userDetails);
	 
 }@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	/*
	 * public AuthenticationManager
	 * authenticationManager(AuthenticationConfiguration builder) throws Exception {
	 * return builder.getAuthenticationManager(); }
	 */
}
