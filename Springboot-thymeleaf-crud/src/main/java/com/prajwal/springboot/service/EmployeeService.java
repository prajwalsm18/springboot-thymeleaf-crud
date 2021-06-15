package com.prajwal.springboot.service;

import java.util.List;

import com.prajwal.springboot.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployee();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(int id);
	void deleteEmployeeById(int id);
	
}
