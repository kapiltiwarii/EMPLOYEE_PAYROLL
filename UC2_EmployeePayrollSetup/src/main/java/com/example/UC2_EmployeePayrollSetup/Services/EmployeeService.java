package com.example.UC2_EmployeePayrollSetup.Services;

import com.example.UC2_EmployeePayrollSetup.Repository.EmployeeRepository;
import com.example.UC2_EmployeePayrollSetup.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public Employee getById(Long id){
        return employeeRepository.findById(id).orElseThrow();
    }

    public Employee employeeSave (Employee employee){
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee,Long id){
        Employee existingEmployee = new Employee();

        existingEmployee.setName(employee.getName());
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setSalary(employee.getSalary());

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        Employee employee = employeeRepository.findById(id).orElseThrow();
        employeeRepository.delete(employee);

    }
}
