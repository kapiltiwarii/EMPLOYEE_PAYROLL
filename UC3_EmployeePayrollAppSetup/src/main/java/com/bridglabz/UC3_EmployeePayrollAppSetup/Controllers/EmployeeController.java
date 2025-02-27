package com.bridglabz.UC3_EmployeePayrollAppSetup.Controllers;

import com.bridglabz.UC3_EmployeePayrollAppSetup.Model.Employee;
import com.bridglabz.UC3_EmployeePayrollAppSetup.Model.EmployeeDTO;
import com.bridglabz.UC3_EmployeePayrollAppSetup.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDTO> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @PostMapping
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.saveEmployee(employeeDTO);
    }
}
