package com.bridzlabz.UC6_EmployeePayrollAppSetup.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {
    private String name;
    private String email;
    private double salary;
}
