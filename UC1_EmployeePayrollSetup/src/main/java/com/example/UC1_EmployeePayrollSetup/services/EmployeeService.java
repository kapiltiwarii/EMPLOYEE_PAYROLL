package com.example.UC1_EmployeePayrollSetup.services;

import com.example.UC1_EmployeePayrollSetup.models.EmployeeEntity;
import com.example.UC1_EmployeePayrollSetup.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<EmployeeEntity> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public EmployeeEntity getEmployeeByID(Long id){
       return employeeRepository.findById(id).orElseThrow();
    }

    public EmployeeEntity saveEmployee(EmployeeEntity employee){
        return employeeRepository.save(employee);
    }

    public EmployeeEntity updateEmployee(Long id,EmployeeEntity updateEmployee){
        EmployeeEntity existingEmployee =  employeeRepository.findById(id).orElseThrow();

        existingEmployee.setName(updateEmployee.getName());
        existingEmployee.setEmail(updateEmployee.getEmail());
        existingEmployee.setSalary(updateEmployee.getSalary());


        return employeeRepository.save(existingEmployee);
    }

    public void deleteEmployee(Long id){
        EmployeeEntity employee = employeeRepository.findById(id).orElseThrow();

        employeeRepository.delete(employee);
    }
}
