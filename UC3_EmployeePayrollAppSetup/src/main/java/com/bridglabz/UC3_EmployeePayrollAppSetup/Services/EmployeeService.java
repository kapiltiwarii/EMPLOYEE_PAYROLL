package com.bridglabz.UC3_EmployeePayrollAppSetup.Services;

import com.bridglabz.UC3_EmployeePayrollAppSetup.Model.Employee;
import com.bridglabz.UC3_EmployeePayrollAppSetup.Model.EmployeeDTO;
import com.bridglabz.UC3_EmployeePayrollAppSetup.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO){
        Employee employee = new Employee();
        employee.setName(employeeDTO.getName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setSalary(employeeDTO.getSalary());

        Employee savedEmployee = employeeRepository.save(employee);

        return new EmployeeDTO(savedEmployee.getName(),savedEmployee.getEmail(),savedEmployee.getSalary());
    }

    public List<EmployeeDTO> getAllEmployee(){
        return employeeRepository.findAll().stream().map(emp->new EmployeeDTO(emp.getName(),emp.getEmail(),emp.getSalary())).collect(Collectors.toList());
    }
}
