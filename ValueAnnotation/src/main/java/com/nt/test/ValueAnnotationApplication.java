package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.bean.Hospital;

@SpringBootApplication
public class ValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(ValueAnnotationApplication.class, args);
		
		Hospital hospital=ctx.getBean("hsptl",Hospital.class);
		System.out.println("Spring Bean Class Object" +hospital);
		
		((ConfigurableApplicationContext)ctx).close();
	}

}
