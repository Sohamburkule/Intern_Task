package com.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Model.Employee;
import com.Employee.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployees() {
	
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		
		return employeeRepository.findById(id).orElse(null);
	}

	@Override
	public Employee createEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Long id,  Employee updatedEmployee) {
		 Employee existingEmployee = getEmployeeById(id);
	        if (existingEmployee != null) {
	            existingEmployee.setName(updatedEmployee.getName());
	            existingEmployee.setEmail(updatedEmployee.getEmail());
	            existingEmployee.setDesignation(updatedEmployee.getDesignation());
	            existingEmployee.setSalary(updatedEmployee.getSalary());
	            existingEmployee.setPhoneNo(updatedEmployee.getPhoneNo());
	            existingEmployee.setAddress(updatedEmployee.getAddress());
	            return employeeRepository.save(existingEmployee);
	        }
	        
	        return null;
	}

	@Override
	public String deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
		return null;
	}

}
