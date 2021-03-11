package com.capg.empapp.execptions;

@SuppressWarnings("serial")
public class WrongSalaryException extends Exception{
	int salary;
	public WrongSalaryException(int salary) {
		this.salary = salary;
	}

	
	public String toString()
	{
		return "Exception salary :- "+salary;
	}
	
}
