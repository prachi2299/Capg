package p6;

import java.util.*; 
public class Occurance {
	
		public Map<Character, Integer> countChars(char[] arr) 
		{ 
			
			Map<Character, Integer> countChar = new HashMap<Character, Integer>(); 
 
			for (char ch : arr) { 
				if (countChar.containsKey(ch)) 
				{ 	
					countChar.put(ch, countChar.get(ch) + 1); 
				} 
				else { 
					countChar.put(ch, 1); 
				} 
			}
			return countChar;

			
		} 

		public static void main(String[] args) 
		{ 
			Occurance oc=new Occurance();
			
			String str = "aaaabbbyyyyzzzzkkk"; 
			char[] strArray = str.toCharArray(); 
			Map<Character, Integer> output = new HashMap<Character, Integer>(); 

			output=oc.countChars(strArray);
			for (Map.Entry<Character,Integer>entry : output.entrySet()) { 
				System.out.print(entry.getKey() +""+ entry.getValue()); 
			} 
			
		} 
	} 


