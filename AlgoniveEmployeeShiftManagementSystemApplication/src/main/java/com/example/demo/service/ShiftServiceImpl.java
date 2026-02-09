package com.example.demo.service;

import java.net.Authenticator.RequestorType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ShiftRegister;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Shift;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.ShiftRepository;

@Service
public class ShiftServiceImpl implements ShiftService {
	
   private final ShiftRepository shiftrepository;
   private final EmployeeRepository employeerepository ;
   
   public ShiftServiceImpl(ShiftRepository shiftrepository,
           EmployeeRepository employeerepository) {
this.shiftrepository = shiftrepository;
this.employeerepository = employeerepository;
}
   
	@Override
	public void createShift(ShiftRegister request) {
		Employee employee = employeerepository.findById(request.eid)
	            .orElseThrow(() -> new RuntimeException("Employee not found"));
		
		Shift s = new Shift();
		      s.setShiftdate(request.shiftdate);
		      s.setShiftStarttime(request.shiftStarttime);
		      s.setEndTime(request.endTime);
		      s.setEmployee(employee);
		      shiftrepository.save(s);
		      
	}

	@Override
	public List<Shift> getEmployeeShifts(int eid) {
        Employee employee = employeerepository.findById(eid)
                .orElseThrow();
        return shiftrepository.findByEmployee(employee);
	}

}
