package com.example.api_gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;

public class CustomRouteLocator  {


//
//    @Bean
//    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route("financial-year-server", r -> r.method(HttpMethod.GET)
//                        .uri("http://localhost:1010/get"))
//
//                .route("financial-year-server", r -> r.method(HttpMethod.POST)
//                        .uri("http://localhost:1010/save"))
//
//                .route("financial-year-server", r -> r.method(HttpMethod.GET)
//                        .uri("http://localhost:1010/get"))
//
//
//
//                .build();
//    }


}
