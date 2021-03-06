package com.training;

import com.training.model.Employee;
import com.training.model.EmployeeHealthInsurance;
import com.training.service.OrganizationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class SpringBootJdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
        OrganizationService organizationService = context.getBean(OrganizationService.class);

        Employee emp = new Employee();
        emp.setEmpId("emp1");
        emp.setEmpName("emp1");

        EmployeeHealthInsurance employeeHealthInsurance = new EmployeeHealthInsurance();
        employeeHealthInsurance.setEmpId("emp1");
        employeeHealthInsurance.setHealthInsuranceSchemeName("premium");
        employeeHealthInsurance.setCoverageAmount(20000);

        organizationService.joinOrganization(emp, employeeHealthInsurance);
    }
}
