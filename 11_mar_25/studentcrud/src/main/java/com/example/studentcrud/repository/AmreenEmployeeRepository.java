package com.example.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentcrud.controller.AmreenEmployeeController;
import com.example.studentcrud.model.Employee;

public interface AmreenEmployeeRepository extends JpaRepository<Employee, Long> {
    void save(AmreenEmployeeController emp);
}