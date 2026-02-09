package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ShiftRegister;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Shift;

public interface ShiftService {
	void createShift(ShiftRegister request);
	
	List<Shift> getEmployeeShifts(int id);

}
