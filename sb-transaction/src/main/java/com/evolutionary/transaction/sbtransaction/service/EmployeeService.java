package com.evolutionary.transaction.sbtransaction.service;

import com.evolutionary.transaction.sbtransaction.model.Employee;

public interface EmployeeService {
    void insertEmployee (Employee employee) ;
    void deleteEmployeeById(String empId) ;

}
