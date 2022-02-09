package EmployeeDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import Model.Employee;

@Repository("empdao")
public class EmployeeDaoImpl implements IEmployeeDAO
{
	private static final String GET_EMPS_BY_DESG="SELECT EMPNO,EMPNAME,JOB,SALARY FROM EMP WHERE JOB IN(?,?,?) 	ORDER BY JOB";
	

	@Autowired
	public DataSource ds;
	@Override
	public List<Employee> getEmpDesg(String desg1, String desg2, String desg3) throws Exception 
	{
		List<Employee> listemp=null;
		try (Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_EMPS_BY_DESG))
		{
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs=ps.executeQuery())
			{
				listemp=new ArrayList();
				while(rs.next())
				{
					Employee e=new Employee();
					e.setEmpno(rs.getInt(1));
					e.setEname(rs.getString(2));
					e.setJob(rs.getString(3));
					e.setSal(rs.getFloat(4));
					listemp.add(e);
			}
			
		}
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se; // exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e; //exception rethrowing
		}
				
		return listemp;
	}

}
