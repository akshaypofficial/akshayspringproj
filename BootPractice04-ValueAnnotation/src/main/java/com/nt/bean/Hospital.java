package com.nt.bean;


import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import lombok.Data;



@Component("hosp")
@Data
public class Hospital 
{


	@Value("Apollo")
	private String name;			//hardcoding
	
	@Value("25")
	private int rank ;
	
			@Value("${hsptl.name}")  //collection from properties file
			private String name1;
			
			@Value("${hsptl.age}")      //collection from properties file
			private String age;
			
			@Value("${Path}")				//injecting from env variable
			private String pathData;
			
			@Value("${os.name}")		//injecting from system properties
			private String os;
}
