package com.dailycodebuffer.springbootdemo.service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.dailycodebuffer.springbootdemo.model.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	List<Employee> employees = new ArrayList<>();
	
	@Override
	public Employee save(Employee employee) {
		if(employee.getEmployeeId()==null || employee.getEmail().isEmpty()) {
			employee.setEmployeeId(null);
			
		}
		employees.add(employee);
		return employee;
	}
	
}
