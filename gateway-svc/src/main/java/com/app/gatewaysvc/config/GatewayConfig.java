package com.app.gatewaysvc.config;

import lombok.RequiredArgsConstructor;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class GatewayConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder){
        return builder.routes()
                .route("department-id", r -> r.path("/department-svc/**")
                        .uri("lb://department-svc"))
                .route("employee-id", r -> r.path("/employee-svc/**")
                        .uri("lb://employee-svc"))
                .build();
    }

}
