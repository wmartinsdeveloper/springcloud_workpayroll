package com.springcloud.oauth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.oauth.entities.Users;
import com.springcloud.oauth.feignclients.UserFeignClient;

@Service
public class UserService {

	public static Logger logger = LoggerFactory.getLogger(UserService.class);
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	public Users findByEmail(String email) {
		Users user = userFeignClient.findByEmail(email).getBody();
		if (user == null) {
			throw new IllegalArgumentException("Email not found.");		
		}
		
		return user;
	}
}
