package com.evolutionary.transaction.sbtransaction.service.impl;

import com.evolutionary.transaction.sbtransaction.dao.HealthInsuranceDao;
import com.evolutionary.transaction.sbtransaction.model.EmployeeHealthInsurance;
import com.evolutionary.transaction.sbtransaction.service.HealthInsuranceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthInsuranceServiceImpl implements HealthInsuranceService {

    @Autowired
    HealthInsuranceDao healthInsuranceDao ;

    @Override
    public void registerEmployeeHealthInsurance(EmployeeHealthInsurance employeeHealthInsurance) {
        healthInsuranceDao.registerEmployeeHealthInsurance(employeeHealthInsurance);
    }

    @Override
    public void deleteEmployeeHealthInsurance(String empId) {
        healthInsuranceDao.deleteEmployeeHealthInsuranceById(empId);
    }
}
