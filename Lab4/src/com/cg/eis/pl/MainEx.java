package com.cg.eis.pl;
import com.cg.eis.service.Services;

import com.cg.eis.bean.Employee;

public class MainEx {
	public static void main(String[] args) {
	Employee e=new Employee();
	Services s=new Services();
	s.employeeDetail(e);
	s.display(e);
}
}