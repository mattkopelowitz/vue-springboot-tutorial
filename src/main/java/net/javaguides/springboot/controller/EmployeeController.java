package net.javaguides.springboot.controller;

import net.javaguides.springboot.entity.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:8081/")
public class EmployeeController {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> fetchEmployees() {
        return employeeRepository.findAll();
    }

}
