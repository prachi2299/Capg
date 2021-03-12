package com.cg.eis.exception;

@SuppressWarnings("serial")
public class EmployeeException extends Exception {
	int salary;
	public EmployeeException(int salary) {
		this.salary = salary;
	}

	
	public String toString()
	{
		return "SalaryException :- "+salary;
	}
}
