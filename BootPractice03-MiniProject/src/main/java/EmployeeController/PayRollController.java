package EmployeeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import EmployeeService.IService;
import Model.Employee;

@Controller("controller")
public class PayRollController 
{
	@Autowired
	private IService service;
	
	public List<Employee> showEmpsbyDesg(String desg1,String desg2,String desg3)throws Exception
	{
		List<Employee> listemps=service.fetchEmpsDesg(desg1, desg2, desg3);
		
		return listemps;
		
	}
	
}
