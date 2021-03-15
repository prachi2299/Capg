package p6;

public class CharOccurance {
public String charCount(char[] arr) {
	
	
	int num=1;
	StringBuilder sb=new StringBuilder();
	String str="";

	
char ch=arr[0];
	
    for(int i=1;i<arr.length;i++) {
    	if(ch==arr[i]) {
    		num++;
    	}
    	else{
    		sb.append(ch).append(num);
    		ch=arr[i];
    		num=1;
    	}
    	
    }
    sb.append(ch).append(num);
	
	
	str=sb.toString();
	
	return str;
}

public static void main(String[] args) {
	CharOccurance oc=new CharOccurance();
	
	String str = "aaaabbbyyyyzzzzkkk"; 
	char[] strArray = str.toCharArray(); 
    String output=oc.charCount(strArray);
    
    System.out.println(output);

}


}

