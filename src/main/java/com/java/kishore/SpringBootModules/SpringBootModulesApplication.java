package com.java.kishore.SpringBootModules;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.java"})
@EnableAutoConfiguration
@ComponentScan(basePackages="com.java.kishore")
@Configuration
@EntityScan(basePackages="com.java.kishore.jpa.beans")
@EnableJpaRepositories("com.java.kishore.repository")
public class SpringBootModulesApplication {

	
	
	/*currently using entities 
	 * com.java.kishore.jpa.beans.Post.java
	 * com.java.kishore.jpa.beans.Comment.java
	 * */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootModulesApplication.class, args);
	}
	
}
