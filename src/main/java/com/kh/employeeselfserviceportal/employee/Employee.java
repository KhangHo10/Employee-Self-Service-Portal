package com.kh.employeeselfserviceportal.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String role;

    public Employee() {
        this.id = 0;
        this.firstName = "ABC";
        this.lastName = "DEF";
        this.role = "Employee";
    }

    public Employee(String firstName, String lastName, String role, int id) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public String getRole() {
        return role;
    }

    public boolean equals(Employee obj) {
        if (obj == null || !getFirstName().equals(obj.getFirstName())
                || !getLastName().equals(obj.getLastName())
                || !getRole().equals(obj.getRole())
                || getId() != obj.getId()) return false;
        return true;
    }
}
