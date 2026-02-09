package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="shifts")
public class Shift {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int sid;
	private  LocalDate shiftdate;
	private LocalTime shiftStarttime;
	private LocalTime endTime;
@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employee;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public LocalDate getShiftdate() {
		return shiftdate;
	}
	public void setShiftdate(LocalDate shiftdate) {
		this.shiftdate = shiftdate;
	}
	public LocalTime getShiftStarttime() {
		return shiftStarttime;
	}
	public void setShiftStarttime(LocalTime shiftStarttime) {
		this.shiftStarttime = shiftStarttime;
	}
	public LocalTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}
	public User getEmployee() {
		return Employee();
	}
	private User Employee() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
}
	
	