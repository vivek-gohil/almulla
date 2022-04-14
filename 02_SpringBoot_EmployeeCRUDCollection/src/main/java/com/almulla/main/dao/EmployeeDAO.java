package com.almulla.main.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.almulla.main.pojo.Employee;

@Repository
public class EmployeeDAO implements EmployeeDAOInterface {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeDAO() {
		Employee employee1 = new Employee(101, "Vivek Gohil", 1000);
		Employee employee2 = new Employee(102, "Samarth Patil", 1000);
		Employee employee3 = new Employee(103, "Vijay Rane", 1000);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeList;
	}

	@Override
	public boolean addNewEmployee(Employee employee) {
		return employeeList.add(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				employeeList.remove(employee);
				return true;
			}
		}
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		for (Employee emp : employeeList) {
			if (emp.getEmployeeId() == employee.getEmployeeId()) {
				emp.setName(employee.getName());
				emp.setSalary(employee.getSalary());
				return emp;
			}
		}
		return new Employee();
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee.getEmployeeId() == employeeId) {
				return employee;
			}
		}
		return new Employee();
	}

}
