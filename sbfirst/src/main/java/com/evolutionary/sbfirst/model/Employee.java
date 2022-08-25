package com.evolutionary.sbfirst.model;

import lombok.*;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class Employee {

    @NonNull
    private Long empId;
    @NonNull
    private String empNo;
    @NonNull
    private String empName;
    @NonNull
    private String position;

    public Employee(EmployeeForm empForm) {
        this.empId = empForm.getEmpId();
        this.empNo = empForm.getEmpNo();
        this.empName = empForm.getEmpName();
        this.position = empForm.getPosition();
    }
}
