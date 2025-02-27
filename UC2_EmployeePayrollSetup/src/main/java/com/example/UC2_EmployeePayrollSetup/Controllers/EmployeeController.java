package com.example.UC2_EmployeePayrollSetup.Controllers;

import com.example.UC2_EmployeePayrollSetup.Services.EmployeeService;
import com.example.UC2_EmployeePayrollSetup.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployee(@RequestBody Employee employee){
        return employeeService.getAll();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getById(id);
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.employeeSave(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@RequestBody Employee employee,@PathVariable Long id){
        return employeeService.updateEmployee(employee,id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

}
