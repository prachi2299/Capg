package p5;

import java.util.Scanner;

public class PersonMain {
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
        Person p=new Person();
		try {
			System.out.println("enter person's name");
		
		    String name=sc.nextLine();
		    System.out.println("Enter age");
		    int age=sc.nextInt();		
		    p.addPerson(name, age);
		}
		catch(AgeException ex) {
			System.out.println("wrong age "+ex);
         }
     }
}