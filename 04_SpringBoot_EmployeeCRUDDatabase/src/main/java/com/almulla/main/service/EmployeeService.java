package com.almulla.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.almulla.main.dao.EmployeeDAOInterface;
import com.almulla.main.pojo.Employee;

@Service
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeDAOInterface employeeDAO;

	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeDAO.addNewEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDAO.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		return employeeDAO.deleteEmployeeByEmployeeId(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		return employeeDAO.getEmployeeByEmployeeId(employeeId);
	}

}
