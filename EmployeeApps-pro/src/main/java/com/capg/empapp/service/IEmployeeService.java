package com.capg.empapp.service;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.execptions.InvalidEmployeeIdException;
//import com.capg.empapp.execptions.InvalidEmployeeIdException;
import com.capg.empapp.execptions.WrongSalaryException;
public interface IEmployeeService {
	public boolean addEmployee(Employee e)throws WrongSalaryException;
	 
	 public boolean editSalaryByEmployeeId(int id)throws InvalidEmployeeIdException;
	 
	 public boolean editExpByEmployeeId(int id)throws InvalidEmployeeIdException;
	 
	 public Employee[] getAllEmployees();
	 
	 public Employee[] getEmployeeBySalary(int salary);
	 
	 public Employee[] getEmployessBySalaryRange(int salaryRangeMin,int salaryRangeMax);

}
