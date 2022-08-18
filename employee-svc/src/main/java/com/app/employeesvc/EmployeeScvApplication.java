package com.app.employeesvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.app.employeesvc"})
@EnableConfigurationProperties
@EnableFeignClients
public class EmployeeScvApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeScvApplication.class, args);
    }

}
