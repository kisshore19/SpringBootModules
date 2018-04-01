package com.java.kishore.SpringBootModules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication(scanBasePackages={"com.java"})
@EnableAutoConfiguration
@ComponentScan(basePackages="com.java.kishore")
@Configuration
@EntityScan(basePackages="com.java.kishore.jpa.beans")
public class SpringBootModulesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootModulesApplication.class, args);
	}
	
}
