package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Shift;
import com.example.demo.service.ShiftService;

import java.util.List;

	@RestController
	@RequestMapping("/api/employee")
	public class EmployeeController {

	    private final ShiftService shiftService;

	    public EmployeeController(ShiftService shiftService) {
	        this.shiftService = shiftService;
	    }

	    @GetMapping("/shifts/{id}")
	    public List<Shift>getShifts(@PathVariable int eid) {
	        return shiftService.getEmployeeShifts(eid);
			}
	    
	}


