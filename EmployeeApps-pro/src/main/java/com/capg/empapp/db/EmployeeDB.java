package com.capg.empapp.db;

import java.util.Scanner;

import com.capg.empapp.dto.Employee;

public class EmployeeDB {
public static Employee employees[]  = new Employee[100];
	static Scanner sc=new Scanner(System.in);
	public static int count = 0;
	static int i;
	static {
		
		employees[count++] = 	new Employee(101, "ramesh", 8, 7000);
		employees[count++] = 	new Employee(101, "suresh", 2, 7000);
		employees[count++] = 	new Employee(101, "rakesh", 1, 7000);
		employees[count++] = 	new Employee(101, "lokesh", 5, 7000);
		
		}
		
		
	public static boolean addEmployee(Employee e)
	{
		
		employees[count++] = e;
	
		return true;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	
	public static Employee[] getEmployeeBySalary(int salary) {
		int j=0;
		Employee[] empsal=new Employee[count];
		while(i<count) {
			if(employees[i].getSalary()==salary) {
				empsal[j]=employees[i];
				j++;
				i++;
				
			}
				
		}
		
		return empsal;
	}
	
	public static Employee[] getEmployessBySalaryRange(int range1, int range2) {
		int j=0;
		Employee[] salary=new Employee[count];
		while(i<count) {
			if((employees[i].getSalary()>=range1) && (employees[i].getSalary()<=range2))
			{
				salary[j]=employees[i];
				 i++;
			     j++;
			
	
			}
		}
		
		return salary;
	}
	
	
	public static boolean editExpByEmployeeId(int id) {
	 System.out.println("enter employee new experience");
		int empexp=sc.nextInt();
		boolean value=false;
		for(i=0;i<count;i++) {
			if(employees[i].getEmployeeId()==id) {
				employees[i].setExp(empexp);
				value=true;
			}}
		return value;

}
	
	public static boolean editSalaryByEmployeeID(int id) {
		System.out.println("enter employee new salary");
		int empsal=sc.nextInt();
		boolean value=false;
		for(i=0;i<count;i++) {
			if(employees[i].getEmployeeId()==id) {
				employees[i].setSalary(empsal);
				value=true;
			}
			}
		return value;
	}
}


