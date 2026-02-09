package com.example.demo.service;

import java.util.Optional;

import com.example.demo.dto.LoginRegister;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.Employee;

public interface EmployeeService {
//	void register (LoginRegister request);
	Optional<Employee> login(String name ,String password);
	Employee register(LoginRegister request);
	Employee createEmployee(RegisterRequest request);
	Employee register(RegisterRequest request);
	

}

