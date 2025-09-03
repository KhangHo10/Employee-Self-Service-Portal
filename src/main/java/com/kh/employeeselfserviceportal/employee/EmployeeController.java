package com.kh.employeeselfserviceportal.employee;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/employee")
public class EmployeeController {

    @PostMapping
    public void createEmployee(String firstName, String lastName, String role, int id) {

    }
}
