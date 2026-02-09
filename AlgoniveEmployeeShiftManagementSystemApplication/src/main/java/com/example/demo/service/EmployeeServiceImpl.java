package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LoginRegister;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Role;
import com.example.demo.repository.EmployeeRepository;

	@Service
	public class EmployeeServiceImpl implements EmployeeService {

	    @Autowired
	    private EmployeeRepository employeeRepository;

	   
	    public void register(Employee employee) {
	        employeeRepository.save(employee);
	    }
	    @Override
	    public  Optional<Employee> login(String name, String password) {

	        Optional<Employee> employee = employeeRepository.findByName(name);
	       

	        if (employee == null) {
	            System.out.println("Employee not found");
	           
	        }

	        if (employee.get().equals(password)) {
	            System.out.println("Login successful");
	        } else {
	            System.out.println("Invalid password");
	        }
			return employee;
	    }
		public Employee register(LoginRegister request) {
			return null;
			// TODO Auto-generated method stub
			
		}
		@Override
		public Employee register(RegisterRequest request) {
			return null;
			// TODO Auto-generated method stub
			
		}
		@Override
		public Employee createEmployee(RegisterRequest request) {
			Employee ee= new Employee();
			ee.setName(request.getName());
			ee.setEmail(request.getEmail());
			ee.setPassword(request.getPassword());
			ee.setRole(Role.EMPLOYEE);
			
			return employeeRepository.save(ee);
		}
	}


	
	