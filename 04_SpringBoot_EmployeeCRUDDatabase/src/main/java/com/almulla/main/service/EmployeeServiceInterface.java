package com.almulla.main.service;

import java.util.List;

import com.almulla.main.pojo.Employee;

public interface EmployeeServiceInterface {

	public boolean addNewEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public boolean deleteEmployeeByEmployeeId(int employeeId);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeByEmployeeId(int employeeId);

}
