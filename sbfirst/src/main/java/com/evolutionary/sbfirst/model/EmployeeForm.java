package com.evolutionary.sbfirst.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmployeeForm {
    @NonNull
    private Long empId;
    @NonNull
    private String empNo;
    @NonNull
    private String empName;
    @NonNull
    private String position;

}
