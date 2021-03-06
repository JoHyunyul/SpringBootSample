package com.example.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Employee;

@Transactional
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}
