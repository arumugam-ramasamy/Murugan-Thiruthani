package com.evolutionary.transaction.sbtransaction.dao;

import com.evolutionary.transaction.sbtransaction.model.Employee;

public interface EmployeeDao {
    void insertEmployee(Employee employee) ;
    void deleteEmployeeById(String empId) ;
}
