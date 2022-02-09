package EmployeeDao;

import java.util.List;

import Model.Employee;

public interface IEmployeeDAO 
{
		public List<Employee> getEmpDesg(String desg1,String desg2,String desg3) throws Exception;
		
}
