package p1;
import java.util.*;

public class ReplaceConsonants {
	public String alterString(String s) {
		 
	     String t = "";
	     for(int i = 0; i < s.length(); i++){
	     char ch = s.charAt(i);
	     if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U'&& ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')  
	     {  
	    	 char p = (char)(ch + 1);
			  t+=p;       
		 }
		 else {
		        	 t += ch;
		       }
		   } 
		   return t; 
} 
		  
		    public static void main(String args[]) 
		    { 
		    	Scanner sc= new Scanner(System.in);
		    	ReplaceConsonants rc=new ReplaceConsonants();
		        System.out.print("Enter string: ");
		        String s  = sc.nextLine();
		        
		       String output= rc.alterString(s);
		       System.out.println(output);
		       sc.close();
		    } 
		}  
		
