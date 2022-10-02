package com.evolutionary.transaction.sbtransaction.service;

import com.evolutionary.transaction.sbtransaction.model.EmployeeHealthInsurance;

public interface HealthInsuranceService {
    void registerEmployeeHealthInsurance (EmployeeHealthInsurance employeeHealthInsurance) ;
    void deleteEmployeeHealthInsurance(String empId) ;
}
