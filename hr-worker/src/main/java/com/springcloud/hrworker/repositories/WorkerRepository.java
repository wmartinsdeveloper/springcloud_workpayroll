package com.springcloud.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcloud.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
