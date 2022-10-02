package com.evolutionary.transaction.sbtransaction.service.impl;

import com.evolutionary.transaction.sbtransaction.dao.EmployeeDao;
import com.evolutionary.transaction.sbtransaction.model.Employee;
import com.evolutionary.transaction.sbtransaction.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDao employeeDao ;

    @Override
    public void insertEmployee(Employee employee) {
        employeeDao.insertEmployee(employee);
    }

    @Override
    public void deleteEmployeeById(String empId) {
        employeeDao.deleteEmployeeById(empId);
    }
}
