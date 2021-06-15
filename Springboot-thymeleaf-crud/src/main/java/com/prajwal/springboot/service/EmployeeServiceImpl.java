package com.prajwal.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prajwal.springboot.model.Employee;
import com.prajwal.springboot.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		Optional<Employee> option = employeeRepository.findById(id);
		Employee employee = null;
		
		if(option.isPresent()) {
			employee = option.get();
		}else {
			throw new RuntimeException("Employee not Found for ID -" + id);
		}
		
		return employee;
	}

	@Override
	public void deleteEmployeeById(int id) {
		employeeRepository.deleteById(id);
		
	}

	
	
}

