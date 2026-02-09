package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/api/manager/employees")
public class ManagerEmployeeController {

    private final EmployeeService employeeService;

    public ManagerEmployeeController(EmployeeService employeeService ) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public String createEmployee(@RequestBody RegisterRequest request) {

       employeeService.createEmployee(request);
    	
        return"employee is added";
    }
}
