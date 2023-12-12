package com.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.Employee.Model.Employee;

@Service
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
