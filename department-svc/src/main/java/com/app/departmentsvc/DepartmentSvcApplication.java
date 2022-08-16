package com.app.departmentsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.app.departmentsvc"})
public class DepartmentSvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(DepartmentSvcApplication.class, args);
    }

}
