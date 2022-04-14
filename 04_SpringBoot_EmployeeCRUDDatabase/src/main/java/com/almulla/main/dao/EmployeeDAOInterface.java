package com.almulla.main.dao;

import java.util.List;

import com.almulla.main.pojo.Employee;

public interface EmployeeDAOInterface {

	public boolean addNewEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public boolean deleteEmployeeByEmployeeId(int employeeId);

	public List<Employee> getAllEmployees();

	public Employee getEmployeeByEmployeeId(int employeeId);

}
