package com.evolutionary.transaction.sbtransaction.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EmployeeHealthInsurance {

    private String empId ;
    private String healthInsuranceSchemaName ;
    private int coverageAmount ;


    @Override
    public String toString() {
        return "EmployeeHealthInsurance{" +
                "empId='" + empId + '\'' +
                ", healthInsuranceSchemaName='" + healthInsuranceSchemaName + '\'' +
                ", coverageAmount=" + coverageAmount +
                '}';
    }
}
