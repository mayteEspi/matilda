package com.meh.matilda.security.service;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.meh.matilda.security.model.MatildaUser;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserSecurityService implements UserDetailsService {
	
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@PostConstruct	
	protected void initialize() {
		new MatildaUser("administrador", "m4t1ld4", "ROLE_ADMIN");
		new MatildaUser("admin", "admin", "ROLE_ADMIN");
	}

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}



	

}
