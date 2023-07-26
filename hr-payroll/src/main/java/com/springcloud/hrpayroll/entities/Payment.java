package com.springcloud.hrpayroll.entities;

import java.io.Serializable;

public class Payment implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private Double dailyIncome;
	private Integer Day;
		
	public Payment() {}
	
	public Payment(String name, Double dailyIncome, Integer day) {
		this.name = name;
		this.dailyIncome = dailyIncome;
		Day = day;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getDailyIncome() {
		return dailyIncome;
	}
	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}
	public Integer getDay() {
		return Day;
	}
	public void setDay(Integer day) {
		Day = day;
	}
	
	
	
}
