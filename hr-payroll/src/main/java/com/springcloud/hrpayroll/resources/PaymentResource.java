package com.springcloud.hrpayroll.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.hrpayroll.entities.Payment;
import com.springcloud.hrpayroll.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {

	@Autowired
	private PaymentService service;
	
	@GetMapping(value = "/{WorkerId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long WorkerId, @PathVariable Integer days){
		Payment payment = service.getPayment(WorkerId, days);
		return ResponseEntity.ok(payment);
	}
	
}
