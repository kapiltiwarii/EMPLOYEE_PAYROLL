package com.bridzlabz.UC5_EmployeePayrollAppSetup.Service;

import com.bridzlabz.UC5_EmployeePayrollAppSetup.models.Employee;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final List<Employee> employeeList = new ArrayList<>(); // In-memory list to store employees

    // Add Employee
    public Employee addEmployee(Employee employee) {
        employee.setId((long) (employeeList.size() + 1)); // Simulating Auto-Increment ID
        employeeList.add(employee);
        return employee;
    }

    // Get All Employees
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    // Get Employee by ID (Without Optional)
    public Employee getEmployeeById(Long id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null; // Return null if employee not found
    }

    // Update Employee (Without Optional)
    public Employee updateEmployee(int id, Employee updatedEmployee) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                emp.setName(updatedEmployee.getName());
                emp.setEmail(updatedEmployee.getEmail());
                emp.setSalary(updatedEmployee.getSalary());
                return emp; // Return updated employee
            }
        }
        return null; // Return null if employee not found
    }

    // Delete Employee (Without Optional)
    public boolean deleteEmployee(Long id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                return true; // Return true if employee is deleted
            }
        }
        return false; // Return false if employee not found
    }
}
