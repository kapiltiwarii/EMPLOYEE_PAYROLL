package com.bridglabz.UC4_EmployeePayrollAppSetup.Repository;

import com.bridglabz.UC4_EmployeePayrollAppSetup.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
