package EmployeeService;

import java.util.List;

import Model.Employee;

public interface IService 
{
	public List<Employee>  fetchEmpsDesg(String desg1,String desg2,String desg3) throws Exception;
	
}
