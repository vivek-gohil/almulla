package com.almulla.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.almulla.main.pojo.Employee;

@Repository
public class EmployeeDAO implements EmployeeDAOInterface {

	private String insertNewEmployee = "insert into employee_master values(?,?,?,?)";
	private String updateEmployee = "update employee_master set first_name = ? , last_name = ? , salary = ? where employee_id = ?";
	private String deleteEmployee = "delete employee_master where employee_id = ?";
	private String selectEmployeeByEmployeeId = "select * from employee_master where employee_id = ?";
	private String selectAllEmployees = "select * from employee_master";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public boolean addNewEmployee(Employee employee) {
		Object[] args = { employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(),
				employee.getSalary() };

		int count = jdbcTemplate.update(insertNewEmployee, args);

		if (count > 0)
			return true;
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Object[] args = { employee.getFirstName(), employee.getLastName(), employee.getSalary(),
				employee.getEmployeeId() };
		int count = jdbcTemplate.update(updateEmployee, args);
		if (count > 0)
			return employee;
		return new Employee();
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int employeeId) {
		Object[] args = { employeeId };
		int count = jdbcTemplate.update(deleteEmployee, args);
		if (count > 0)
			return true;
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> employeeList 
		= jdbcTemplate.query(selectAllEmployees, new EmployeeRowMapper());
		return employeeList;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {
		Object[] args = { employeeId };
		Employee employee = 
				jdbcTemplate.queryForObject(selectEmployeeByEmployeeId, 
												new EmployeeRowMapper(), 
											args);
		return employee;
	}
}
