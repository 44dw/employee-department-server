package com.dw.employeedepartmentserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.dw")
@EnableEurekaServer
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableFeignClients(basePackages = {"com.dw.departmentdictionary.api.feign"})
public class EmployeeDepartmentServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDepartmentServerApplication.class, args);
	}

}
