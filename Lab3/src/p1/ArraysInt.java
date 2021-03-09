package p1;



import java.util.Arrays;
import java.util.Scanner;

public class ArraysInt {
	public static int[] getSorted(int arr[]){
	
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			String s = Integer.toString(arr[i]);
			char ch[]=s.toCharArray();
			String str="";
			for(int j=ch.length-1;j>=0;j--) {
				str+=ch[j];
				}
			temp[i]=Integer.parseInt(str);
			
		}
		Arrays.sort(temp);
		
		return temp;

}

	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int num= sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter array element");
		for(int i=0;i<num;i++) {
		arr[i]=sc.nextInt();
		}
		int[] output=getSorted(arr);
		for(int i=0;i<num;i++)
		System.out.println(output[i]);
		sc.close();
		}
}
