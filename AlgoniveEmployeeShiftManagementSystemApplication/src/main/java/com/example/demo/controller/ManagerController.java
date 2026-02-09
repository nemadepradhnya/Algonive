package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ShiftRegister;
import com.example.demo.service.ShiftService;

@RestController
@RequestMapping("/api/manager")
public class ManagerController {
	private final ShiftService shiftService ;
	
	public ManagerController(ShiftService shiftService) 
	{
		this.shiftService=shiftService;
	}
	@PostMapping("/shift")
	public String createShift(@RequestBody ShiftRegister request)
	{
		
	shiftService.createShift(request);
	return"Shift is created";
	}
	

}
