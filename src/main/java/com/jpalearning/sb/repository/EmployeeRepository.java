package com.jpalearning.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpalearning.sb.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
