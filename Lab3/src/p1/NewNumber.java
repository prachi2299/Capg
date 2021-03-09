package p1;

import java.util.Scanner;

public class NewNumber {
	public int modifyNumber (int num) {
        String s =Integer.toString(num);
        int diff;
        int size=s.length();
        StringBuffer buff1=new StringBuffer();
        for(int i = 0; i < s.length()-1; i++)
        {
	   	    char ch = s.charAt(i);
	   	    char ch1 = s.charAt(i+1);

	   	    int a=Character.getNumericValue(ch);
	   	    int b=Character.getNumericValue(ch1);

	   	    diff=Math.abs(a-b);
			


            buff1.append(diff);
        
        
        }
        char last=s.charAt(size-1);
        buff1.append(last);
        int ans=Integer.parseInt(buff1.toString());
        return ans;
	}

	public static void main(String args[]) 
    { 
    	Scanner sc= new Scanner(System.in);
    	NewNumber nn=new NewNumber();
    	System.out.print("Enter a number ");
        int n  = sc.nextInt();
        
        int output=nn.modifyNumber(n);
        System.out.println(output);
        		sc.close();
}
}