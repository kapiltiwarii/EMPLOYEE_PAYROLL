package com.bridzlabz.UC6_EmployeePayrollAppSetup.services;

import com.bridzlabz.UC6_EmployeePayrollAppSetup.models.Employee;
import com.bridzlabz.UC6_EmployeePayrollAppSetup.models.EmployeeDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j  // Lombok for Logging
@Service
public class EmployeeService {

    private final List<Employee> employeeList = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employee.setId(employeeList.size() + 1);
        employeeList.add(employee);
        log.info("Employee added: {}", employee);
        return employee;
    }

    public List<EmployeeDTO> getAllEmployees() {
        log.debug("Fetching all employees, Total: {}", employeeList.size());
        return employeeList.stream()
                .map(emp -> new EmployeeDTO(emp.getName(), emp.getEmail(),emp.getSalary()))
                .toList();
    }

    public Employee getEmployeeById(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                log.info("Employee found: {}", emp);
                return emp;
            }
        }
        log.warn("Employee not found with ID: {}", id);
        return null;
    }

    public boolean deleteEmployee(int id) {
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                log.info("Employee deleted: {}", emp);
                return true;
            }
        }
        log.error("Failed to delete, Employee not found with ID: {}", id);
        return false;
    }
}
