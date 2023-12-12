package com.Employee.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Employee.Model.Employee;

@Service
public interface EmployeeService {

	List<Employee> getAllEmployees();

	Employee getEmployeeById(Long id);

	Employee createEmployee(Employee employee);

	Employee updateEmployee(Long id, Employee employee);

	String deleteEmployee(Long id);
}
