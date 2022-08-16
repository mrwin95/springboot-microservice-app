package com.app.employeesvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = {"com.app.employeesvc"})
@EnableConfigurationProperties
public class EmployeeScvApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeScvApplication.class, args);
    }

}
