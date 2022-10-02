package com.evolutionary.transaction.sbtransaction.dao.impl;

import com.evolutionary.transaction.sbtransaction.dao.EmployeeDao;
import com.evolutionary.transaction.sbtransaction.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

    @Autowired
    DataSource dataSource ;

    @PostConstruct
    public void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void insertEmployee(Employee employee) {
        String sql = "INSERT into employee (empId, empName) VALUES (?, ?)" ;
        getJdbcTemplate().update(sql, new Object[] {employee.getEmpId(), employee.getEmpName()}) ;
    }

    @Override
    public void deleteEmployeeById(String empId) {
        String sql = "DELETE from employee where empId = ?" ;
        getJdbcTemplate().update(sql, new Object[] {empId}) ;
    }
}
