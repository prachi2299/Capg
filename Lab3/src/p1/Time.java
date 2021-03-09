package p1;

import java.time.*;
import java.util.*;
public class Time {
	

	   public static void main(String[] args)
	    { 
		    Scanner sc=new Scanner(System.in);
	        LocalDate now = LocalDate.now();
	        System.out.println("Enter date in format yyyy-mm-dd");
	        String  date=sc.nextLine();
	      
	        LocalDate localDate = LocalDate.parse(date);
	        
	        Period diff = Period.between(localDate, now);
	 
	     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
	                    diff.getYears(), diff.getMonths(), diff.getDays());
	     sc.close();
	  }
	}

