package com.example.UC1_EmployeePayrollSetup.repository;

import com.example.UC1_EmployeePayrollSetup.models.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
}
