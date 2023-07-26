package com.springcloud.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcloud.hrpayroll.entities.Payment;
import com.springcloud.hrpayroll.entities.Worker;
import com.springcloud.hrpayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkerFeignClient workFeignClient;
	
	public Payment getPayment(Long workerId, int days) {
				
		Worker worker = workFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(),worker.getDailyIncome()*days, days);
	}
	
	
}
