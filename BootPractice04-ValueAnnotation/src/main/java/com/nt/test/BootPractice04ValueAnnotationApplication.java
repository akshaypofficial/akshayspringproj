package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.bean.Hospital;

@SpringBootApplication
public class BootPractice04ValueAnnotationApplication {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=SpringApplication.run(BootPractice04ValueAnnotationApplication.class, args);
		Hospital hospital=ctx.getBean("hsptll",Hospital.class);
		System.out.println("Spring Bean Class Object Data" +hospital);
		
		
		((ConfigurableApplicationContext)ctx).close();
	}
	
}
