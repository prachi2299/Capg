package com.capg.empapp.service;
import com.capg.empapp.dao.EmployeeDAOImpl;
import com.capg.empapp.dao.IEmployeeDAO;
//import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.execptions.InvalidEmployeeIdException;
//import com.capg.empapp.execptions.InvalidEmployeeIdException;
import com.capg.empapp.execptions.WrongSalaryException;

public class EmployeeServiceImpl implements IEmployeeService {
	IEmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	public boolean addEmployee(Employee e) throws WrongSalaryException {
		
			//System.out.println(" ------------>> inside service "+e);
	int	sal=e.getSalary();
			if(e.getSalary()> 50000)
			{
				throw new WrongSalaryException(sal);
			}
			else return dao.addEmployee(e);		
		
	}

	public Employee[] getAllEmployees() {

		return dao.getAllEmployees();
	}
	
	
	// ================================================================================

	public boolean editSalaryByEmployeeId(int id) throws InvalidEmployeeIdException {
		// TODO Auto-generated method stub
		if(id<100 || id>200) {
			throw new InvalidEmployeeIdException(id);
		}
		else return dao.editSalaryByEmployeeId(id);
	}

	public boolean editExpByEmployeeId(int id) throws InvalidEmployeeIdException {
		// TODO Auto-generated method stub
		if(id<100 && id>200) {
			throw new InvalidEmployeeIdException(id);
		}
		else return dao.editExpByEmployeeId(id);
	}

	public Employee[] getEmployeeBySalary(int salary) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee[] getEmployessBySalaryRange(int salaryRangeMin, int salaryRangeMax) {
		// TODO Auto-generated method stub
		return null;
	}
}
