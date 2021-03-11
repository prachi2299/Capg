package com.capg.empapp.main;
import java.util.Scanner;

import com.capg.empapp.db.EmployeeDB;
import com.capg.empapp.dto.Employee;
import com.capg.empapp.service.EmployeeServiceImpl;
import com.capg.empapp.service.IEmployeeService;
public class EmpMainClass {
	IEmployeeService empService = new EmployeeServiceImpl();
	
	public static void main(String[] args) {
		int i;
		EmpMainClass app = new EmpMainClass();
		Scanner sc = new Scanner(System.in);
		while(true)
		 {
			System.out.println(" === MENU ==== ");
			System.out.println("1. add employee ");
			System.out.println("2. Display All Employee ");
			System.out.println("3. Display employee based on salary");
			System.out.println("4. Display employee based on salary range");
			System.out.println("5. Edit employee salary based on ID");
			System.out.println("6. Edit employee experience based on ID");
			System.out.println("0. EXIT");
			System.out.println("Enter Option");
			int option = Integer.parseInt(sc.nextLine());
			switch(option)
			{
			
			case 1:
				
				System.out.println("Enter Employee ID ");
				int empId = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Salary ");
				int empSalary = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Experience ");
				int empExp = Integer.parseInt(sc.nextLine());
				
				System.out.println("Enter Employee Name ");
				String name = sc.nextLine();
				
				Employee e = new Employee(empId, name, empExp, empSalary);
				
				try
				{
					boolean isInserted = app.empService.addEmployee(e);
					if(isInserted)
					{
						System.out.println(" Employee Added !!!");
					}
					else
					{
						 throw new Exception("Cannot added Employee ...");
						 
					}
				}
				catch(Exception ex)
				{
					System.out.println(" Contact to Customer Care ... "+ex); // raise the exception
					
				}

				
				break;
			case 2:
				
				Employee arr[] = app.empService.getAllEmployees();
				int count = EmployeeDB.count;  // not the code
				System.out.println("  --->>  count in main "+count);
				for (i = 0; i < count; i++) {
					System.out.println(arr[i]);
					System.out.println(" ========================================================");
				}
				break;
			case 3:
				System.out.println("Enter salary");
				int sal=sc.nextInt();
				int x=EmployeeDB.count;
				Employee empsal[] = app.empService.getEmployeeBySalary(sal);
				for(i=0;i<x;i++) {
					System.out.println(empsal[i]);
					System.out.println(" ========================================================");
			}
				break;
			case 4:
				System.out.println("Enter salary range");
				int sal1=sc.nextInt();
				int sal2=sc.nextInt();
				int count1=EmployeeDB.count;
				Employee empsal1[] = app.empService.getEmployessBySalaryRange(sal1,sal2);
				for(i=0;i<count1;i++) {
					System.out.println(empsal1[i]);
					System.out.println(" ========================================================");
				}
				break;
				
			case 5:
				System.out.println("Enter ID of employee you want to change salary of");
				int id=Integer.parseInt(sc.nextLine());
				
				try {
					boolean val = app.empService.editSalaryByEmployeeId(id);
					if(val) {
						System.out.println("employee salary updated");
						
					}
					else {
						throw new Exception("wrong id");
				    }
				}
				catch(Exception ex){
					System.out.println(ex);
				}
				break;
				
			case 6:
				System.out.println("Enter ID of employee you want to change experience of");
				int id1=sc.nextInt();
				
				try {
				boolean val1 = app.empService.editExpByEmployeeId(id1);
;
				if(val1) {
					System.out.println("employee experience updated");
					
				}
				else {
					throw new Exception("wrong id");
				}
				}
				catch(Exception ex){
					System.out.println(ex);
				}
				break;
			
			case 0:
				
				System.exit(0);
			
			
			
			}//end switch
			
	} // end while
		
}//end main

}
