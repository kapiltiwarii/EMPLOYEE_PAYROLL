package com.example.UC2_EmployeePayrollSetup.Repository;

import com.example.UC2_EmployeePayrollSetup.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
