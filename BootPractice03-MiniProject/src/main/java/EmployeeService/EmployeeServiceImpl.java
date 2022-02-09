package EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EmployeeDao.IEmployeeDAO;
import Model.Employee;

@Service("empservice")
public class EmployeeServiceImpl implements IService 
{
	@Autowired
		private IEmployeeDAO dao;
	@Override
	public List<Employee> fetchEmpsDesg(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> listemps=dao.getEmpDesg(desg1, desg2, desg3);
		
		return listemps;
	}

}
