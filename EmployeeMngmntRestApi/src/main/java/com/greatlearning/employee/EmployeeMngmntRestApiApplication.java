package com.greatlearning.employee;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = "com.greatlearning.employee")
public class EmployeeMngmntRestApiApplication {

	//logging
		static final Logger logger  = LogManager.getLogger(EmployeeMngmntRestApiApplication.class.getName());
		
	public static void main(String[] args) {
		SpringApplication.run(EmployeeMngmntRestApiApplication.class, args);
		logger.info("entered application");
	}
	
	
}
