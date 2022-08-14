package com.app.gatewaysvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GatewaySvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewaySvcApplication.class, args);
    }

}
