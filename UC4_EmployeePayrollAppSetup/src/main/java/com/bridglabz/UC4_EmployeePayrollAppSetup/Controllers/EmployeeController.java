package com.bridglabz.UC4_EmployeePayrollAppSetup.Controllers;

import com.bridglabz.UC4_EmployeePayrollAppSetup.Services.EmployeeService;
import com.bridglabz.UC4_EmployeePayrollAppSetup.models.Employee;
import com.bridglabz.UC4_EmployeePayrollAppSetup.models.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService; // Injecting Service Layer

    @PostMapping("/add")
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employee) {
        return employeeService.saveEmployee(employee); // Delegating to Service
    }

    @GetMapping("/all")
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployee(); // Delegating to Service
    }
}
