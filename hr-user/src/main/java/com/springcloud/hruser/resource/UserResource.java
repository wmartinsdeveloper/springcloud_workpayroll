package com.springcloud.hruser.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.hruser.entities.Users;
import com.springcloud.hruser.repository.UserRepository;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
		
	@Autowired
	private UserRepository repository;

	@GetMapping(value = "/{id}")
	public ResponseEntity<Users> findById(@PathVariable Long id) {
		Users obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}	

	@GetMapping(value = "/search")
	public ResponseEntity<Users> findByEmail(@RequestParam String email) {
		Users obj = repository.findByEmail(email);
		return ResponseEntity.ok(obj);
	}	
}



