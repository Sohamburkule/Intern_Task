package com.Employee.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Employee.Model.Employee;
import com.Employee.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/showAll")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/get/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}

	@PostMapping("/create")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	
	@GetMapping("/update/{id}")
	public Employee updateEmployee(@PathVariable Long id ,@RequestBody Employee employee) {
		return employeeService.updateEmployee(id, employee);		
	}

	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "Employee Deleted Successfully";
	}
}
