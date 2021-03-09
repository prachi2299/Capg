package p1;
import java.util.*;
public class ReverseString {
	public String getImage(String str) {
		StringBuffer buff1=new StringBuffer(str);
		StringBuffer buff2=new StringBuffer(str);

		StringBuffer str1=buff1.reverse();
		StringBuffer str2 =buff2.append("|");
		str2=str2.append(str1);
		str=str2.toString();
		
return str;
		
	}
	public static void main(String args[]) {
		ReverseString rs=new ReverseString();
		System.out.println("Enter a string");
		String str;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		
		String output= rs.getImage(str);
		System.out.println(output);
		sc.close();
	}

}
