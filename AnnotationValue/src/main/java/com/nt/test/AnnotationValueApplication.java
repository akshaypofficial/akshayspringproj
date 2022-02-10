package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.bean.Hospital;

@SpringBootApplication
public class AnnotationValueApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(AnnotationValueApplication.class, args);
		Hospital hospital=ctx.getBean("hsptl",Hospital.class);
		
		System.out.println("Spring Class Object " +hospital);
		((ConfigurableApplicationContext)ctx).close();
	}

}
