package com.evolutionary.transaction.sbtransaction.dao.impl;

import com.evolutionary.transaction.sbtransaction.dao.HealthInsuranceDao;
import com.evolutionary.transaction.sbtransaction.model.EmployeeHealthInsurance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
public class HealthInsuranceDaoImpl extends JdbcDaoSupport implements HealthInsuranceDao {

    @Autowired
    DataSource dataSource ;

    @PostConstruct
    public void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) {
        String sql = "INSERT into employeeHealthInsurance " +
                "(empId, healthInsuranceSchemaName, coverageAmount) VALUES (?, ?, ?)" ;
        getJdbcTemplate().update(sql, new Object []{employeeHealthInsurance.getEmpId(),
            employeeHealthInsurance.getHealthInsuranceSchemaName(),
        employeeHealthInsurance.getCoverageAmount()}) ;
    }

    @Override
    public void deleteEmployeeHealthInsuranceById(String empid) {
        String sql = "DELETE from employeeHealthInsurance where empId = (?)" ;
        getJdbcTemplate().update(sql, new Object [] {empid}) ;

    }
}
