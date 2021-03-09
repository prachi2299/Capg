package p1;

import java.util.Scanner;

public class PositiveString {
 
		public boolean isAlphabaticOrder(String s) { 
			int n = s.length(); 

			for (int i = 1; i < n; i++) { 

				if (s.charAt(i) < s.charAt(i - 1)) { 
					return false; 
				} 
			} 

			return true; 
		} 

		 public static void main(String[] args) { 
		    Scanner sc=new Scanner(System.in);

			PositiveString ps=new PositiveString();
			System.out.println("Enter a string");
            String str=sc.nextLine();
			if (ps.isAlphabaticOrder(str)) { 
				System.out.println("Yes, it is a positive string."); 
			} else { 
				System.out.println("No. It is not a positive string");
				
			} 
			sc.close();
		} 
	} 
	