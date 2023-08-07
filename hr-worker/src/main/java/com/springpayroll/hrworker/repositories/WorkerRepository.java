package com.springpayroll.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springpayroll.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
