package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="WEB-INF,com.nt.controller")
public class SpringMvc2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvc2Application.class, args);
	}

}
