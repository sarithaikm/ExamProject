package com.employeeexam.employeeexam.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employeeexam.employeeexam.model.Employee;

@Repository
public interface EmployeeRrepository extends JpaRepository<Employee, Integer>{
    
} 
    

