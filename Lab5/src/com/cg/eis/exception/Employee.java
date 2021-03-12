package com.cg.eis.exception;



public class Employee {
	
		private String name;
		private int salary;
	
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + "]";
		}
		public void addEmp(String name, int salary)throws EmployeeException {
			
			if(salary<3000) {
				
				throw new EmployeeException(salary);
			}
			this.name=name;
			this.salary=salary;
			
			System.out.println("Employeee info added ");
			
			}


}
