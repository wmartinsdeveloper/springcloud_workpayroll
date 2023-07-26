package com.springcloud.hrpayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springcloud.hrpayroll.entities.Payment;
import com.springcloud.hrpayroll.entities.Worker;

@Service
public class PaymentService {

	@Value("${hr-worker.hots}")
	private String workHost;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(Long workerId, int days) {
		
		Map<String, String> uriVariables = new HashMap<>();		
		uriVariables.put("id", ""+workerId);
		
		Worker worker = restTemplate.getForObject(workHost+"/worker/{id}", Worker.class,uriVariables);
		
		return new Payment(worker.getName(),worker.getDailyIncome()*days, days);
	}
	
	
}
