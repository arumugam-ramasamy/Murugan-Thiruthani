package com.evolutionary.transaction.sbtransaction.service;

import com.evolutionary.transaction.sbtransaction.model.Employee;
import com.evolutionary.transaction.sbtransaction.model.EmployeeHealthInsurance;

public interface OrganizationService {
    public void joinOrganization (Employee employee, EmployeeHealthInsurance employeeHealthInsurance) ;
    public void leaveOrganization (Employee employee, EmployeeHealthInsurance employeeHealthInsurance) ;
}
