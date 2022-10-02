package com.evolutionary.transaction.sbtransaction;

import com.evolutionary.transaction.sbtransaction.model.Employee;
import com.evolutionary.transaction.sbtransaction.model.EmployeeHealthInsurance;
import com.evolutionary.transaction.sbtransaction.service.OrganizationService;
import com.evolutionary.transaction.sbtransaction.service.impl.OrganizationServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbTransactionApplication {

    public static void main(String[] args) {

        ApplicationContext context= SpringApplication.run(SbTransactionApplication.class, args);
        OrganizationService organizationService = context.getBean(OrganizationServiceImpl.class);

        Employee emp = new Employee();
        emp.setEmpId("emp10");
        emp.setEmpName("emp10");

        EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
        employeeHealthInsurance.setEmpId("emp10");
        employeeHealthInsurance.setHealthInsuranceSchemaName("premium");
        employeeHealthInsurance.setCoverageAmount(20000);

        organizationService.joinOrganization(emp, employeeHealthInsurance);

    }

}
