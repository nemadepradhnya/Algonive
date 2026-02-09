package com.example.demo.controller;


	import org.springframework.web.bind.annotation.*;

import com.example.demo.dto.LoginRegister;
import com.example.demo.dto.RegisterRequest;
import com.example.demo.service.EmployeeService;
	@RestController
	@RequestMapping("/api/auth")
	public class AuthController {

	    private final EmployeeService employeeservice;

	    public AuthController(EmployeeService employeeservice) {
	        this.employeeservice = employeeservice;
	    }

	    @PostMapping("/register")
	    public String register(@RequestBody LoginRegister request) {
	        employeeservice.register(request);
	        return "Registered successfully";
	    }

	    @PostMapping("/login")
	    public String login(@RequestBody LoginRegister request) {
	      employeeservice.register(request);
	        return "Login successful";
	    }
	}


