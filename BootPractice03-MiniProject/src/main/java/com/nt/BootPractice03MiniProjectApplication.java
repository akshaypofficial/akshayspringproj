package com.nt;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import EmployeeController.PayRollController;
import Model.Employee;

@SpringBootApplication
public class BootPractice03MiniProjectApplication {
	
	

	public static void main(String[] args) 
	{
		ApplicationContext ctx=SpringApplication.run(BootPractice03MiniProjectApplication.class, args);
		PayRollController controller=ctx.getBean("controller",PayRollController.class);
		
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter desg1");
		 String desg1=sc.next().toUpperCase();
		 System.out.println("enter desg2");
		 String desg2=sc.next().toUpperCase();
		 System.out.println("enter desg3");
		 String desg3=sc.next().toUpperCase();
		 
		 try {
		 List<Employee> listEmps=controller.showEmpsbyDesg(desg1, desg2, desg3);
		 listEmps.forEach(System.out::println);
		
	}
		 catch(SQLException se) {
			 se.printStackTrace();
			 System.out.println("Internal DB Problem  ");
		 }
		 catch(Exception e) {
			 e.printStackTrace();
			 System.out.println("Internal unknown Problem  ");
		 }
		 ((ConfigurableApplicationContext) ctx).close();
	}
}
