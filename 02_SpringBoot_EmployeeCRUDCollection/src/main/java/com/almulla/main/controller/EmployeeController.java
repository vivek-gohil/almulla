package com.almulla.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.almulla.main.pojo.Employee;
import com.almulla.main.service.EmployeeServiceInterface;

@RestController
@RequestMapping("employeecrudapi")
public class EmployeeController {
	@Autowired
	private EmployeeServiceInterface employeeService;

	// List<Employee> employeeList = employeeService.getAllEmployees();

	@RequestMapping(value = "employeedetails/all", method = RequestMethod.GET)
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployees();
	}

	@RequestMapping(value = "employeedetails/new", method = RequestMethod.POST)
	public boolean addNewEmployee(@RequestBody Employee employee) {
		return employeeService.addNewEmployee(employee);
	}

	@RequestMapping(value = "employeedetails/{employeeId}", method = RequestMethod.DELETE)
	public boolean deleteEmployeeByEmployeeId(@PathVariable int employeeId) {
		return employeeService.deleteEmployeeByEmployeeId(employeeId);
	}

	@RequestMapping(value = "employeedetails/update", method = RequestMethod.PUT)
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeService.updateEmployee(employee);
	}

	@RequestMapping(value = "employeedetails/{employeeId}",
										method = RequestMethod.GET)
	public Employee getEmployeeByEmployeeId(@PathVariable int employeeId) {
		return employeeService.getEmployeeByEmployeeId(employeeId);
	}

}
