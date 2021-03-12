package com.cg.eis.exception;

import java.util.Scanner;


public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Employee e=new Employee();
		try {
			System.out.println("enter name");
		    String name=sc.nextLine();
		    System.out.println("Enter salary");
		    int sal=sc.nextInt();
		    e.addEmp(name, sal);
		}
		catch(EmployeeException ex) {
			System.out.println("Salary less than 3000 "+ex);
		}
	}
}

