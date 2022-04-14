package com.almulla.main.dao;

import java.util.List;

import com.almulla.main.pojo.Employee;

public interface EmployeeDAOInterface {
	public List<Employee> getAllEmployees();
	public boolean addNewEmployee(Employee employee);
	public boolean deleteEmployeeByEmployeeId(int employeeId);
	public Employee updateEmployee(Employee employee);
	public Employee getEmployeeByEmployeeId(int employeeId);
	
}
