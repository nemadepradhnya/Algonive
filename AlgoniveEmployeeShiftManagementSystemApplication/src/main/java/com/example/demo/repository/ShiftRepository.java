package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Shift;
@Repository
public interface ShiftRepository extends JpaRepository<Shift, Integer>{
List<Shift> findByEmployee(Employee employee);



}
