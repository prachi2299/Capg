package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

interface EmployeeService{
	void employeeDetail(Employee e);
	String scheme(int salary,String designation);
	void display(Employee e);
}
public class Services implements EmployeeService{
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
	    public void employeeDetail(Employee e) {
	
		System.out.println("Enter Employee ID ");
		int id = Integer.parseInt(sc.nextLine());
		e.setId(id);
		System.out.println("Enter Employee Salary ");
		int salary = Integer.parseInt(sc.nextLine());
		e.setSalary(salary);
		System.out.println("Enter Employee designation ");
		
		String designation = sc.nextLine();
	    e.setDesignation(designation);
		System.out.println("Enter Employee Name ");
		String name = sc.nextLine();
		e.setName(name);
		
		String scheme=scheme(e.getSalary(),e.getDesignation());
		e.setInsuranceScheme(scheme);
		
	}
	public String scheme(int salary, String designation) {
		if(salary<20000) {
			if (designation.equals("manager")) {
				return "scheme 1";
			}
			else {
				return "Scheme 2";
			}}
		else if(salary>50000) {
			if(designation.equals("sr. manager")) {
			return "Scheme 3";
		}
			else {
				return "scheme 4";
			}
		}
		else {
			return "scheme 5";
		}
	}
	public void display(Employee e) {
		System.out.println(e.toString());
			
	}

	
}
