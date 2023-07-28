package com.springcloud.hruser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.hruser.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	
	Users findByEmail(String email);
	

}
