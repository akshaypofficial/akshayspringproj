package com.nt.bean;

	import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

	@Component("hsptl")
	@Data
	public class Hospital 
	{
		@Value("Kimms")
			private String name;
		
		@Value("20")
		private String age;
		
		@Value("hsptl.name")
		private String namee;
		
		@Value("hsptl.age")
		private Integer agee;
		
	}

