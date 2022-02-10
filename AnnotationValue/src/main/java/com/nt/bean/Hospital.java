package com.nt.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hsptl")
@Data
public class Hospital 
{
		@Value("BharatiHospital")
		private String name;
		
		@Value("25")
		private int age;
		
		@Value("${hsptl.name}")
		private String namee;
		
		@Value("${hsptl.age}")
		private int agee;
}
