package com.springcloud.oauth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springcloud.oauth.entities.Users;
import com.springcloud.oauth.feignclients.UserFeignClient;

@Service
public class UserService implements UserDetailsService {

	public static Logger logger = LoggerFactory.getLogger(UserService.class);
	

	@Autowired
	private UserFeignClient userFeignClient;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userFeignClient.findByEmail(username).getBody();
		if (user == null) {
			logger.error("Email not found: " + username);
			throw new UsernameNotFoundException("Email not found");
		}
		logger.info("Email found: " + username);
		return user;
	}
}
