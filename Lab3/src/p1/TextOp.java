package p1;
import java.util.*;
public class TextOp {
	
	            public static void main(String args[]) {
	                        int numline=0,numword=1,numchar=0;           
	                        char ch;
	                        Scanner scr=new Scanner(System.in);
	                        System.out.print("\nEnter text:");
	                        String str=scr.nextLine();
	                    
	                     String  str1= str.replaceAll("( +)"," ").trim();
	                        for(int i=0;i<str1.length();i++)
	                        {         
	                        	ch = str1.charAt(i);
	                            if(ch=='.')
	                            numline++;
	                            else if(ch==' ')
	                            numword++;
	                            else if(ch!=' '&& ch!='.')
	                            	numchar++;
	                                                                       
	                        }
	                       
	                        System.out.println("\nNumber of lines : "+numline);
	                        System.out.println("\nNumber of words : "+(numword));
	                        System.out.println("\nNumber of characters : "+numchar);
	                       
	                    
scr.close();
	            }
	}

