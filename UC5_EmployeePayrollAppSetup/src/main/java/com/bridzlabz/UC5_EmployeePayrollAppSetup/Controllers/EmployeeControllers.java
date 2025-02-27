package com.bridzlabz.UC5_EmployeePayrollAppSetup.Controllers;

import com.bridzlabz.UC5_EmployeePayrollAppSetup.Service.EmployeeService;
import com.bridzlabz.UC5_EmployeePayrollAppSetup.models.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeControllers {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> addEmployee(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
         employeeService.deleteEmployee(id);
    }

}
