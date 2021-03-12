package p5;

import java.util.Scanner;

public class NameMain {
	
		public static void main(String args[])
		{	
		Scanner sc=new Scanner(System.in);
		Name nm=new Name();
		try {
			System.out.println("enter first name");

		    String fname=sc.nextLine();
		    System.out.println("Enter last name");
		    String lname=sc.nextLine();
		    nm.addName(fname,lname);
		}
		catch(NameEmptyException ex) {
			System.out.println("First name or Last name is blank "+ex);
		}
	}
}
