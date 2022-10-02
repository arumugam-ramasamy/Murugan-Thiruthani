package com.evolutionary.transaction.sbtransaction.service.impl;

import com.evolutionary.transaction.sbtransaction.model.Employee;
import com.evolutionary.transaction.sbtransaction.model.EmployeeHealthInsurance;
import com.evolutionary.transaction.sbtransaction.service.EmployeeService;
import com.evolutionary.transaction.sbtransaction.service.HealthInsuranceService;
import com.evolutionary.transaction.sbtransaction.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    EmployeeService employeeService ;
    @Autowired
    HealthInsuranceService healthInsuranceService ;

    @Override
    @Transactional
    public void joinOrganization(Employee employee , EmployeeHealthInsurance employeeHealthInsurance) {
        employeeService.insertEmployee(employee);
        healthInsuranceService.registerEmployeeHealthInsurance(employeeHealthInsurance);

    }

    @Override
    @Transactional
    public void leaveOrganization(Employee employee , EmployeeHealthInsurance employeeHealthInsurance) {
        healthInsuranceService.deleteEmployeeHealthInsurance(employee.getEmpId());
        employeeService.deleteEmployeeById(employee.getEmpId());

    }
}
