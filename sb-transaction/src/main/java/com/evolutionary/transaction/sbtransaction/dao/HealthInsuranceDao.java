package com.evolutionary.transaction.sbtransaction.dao;

import com.evolutionary.transaction.sbtransaction.model.EmployeeHealthInsurance;

public interface HealthInsuranceDao {
    void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) ;
    void deleteEmployeeHealthInsuranceById(String empid) ;
}
