package javainterview.question;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfEachCharacterInString {

	public static void main(String[] args) {
		
		// write a function that counts the occurrence of each character in a given string
		
		String test= "This is a test of th method that is going to count the number of chars "
				+ "in this string";

		System.out.println(CharsWithCOunt(test));
	}

	/*
	 * we can use HashMap, HashMap has keys and values.
	 * Keys should be unique, because it is set
	 * we are going to store chars as keys and values as count
	 */
	public static Map <Character, Integer> CharsWithCOunt(String str) {
		
		Map <Character, Integer> chars = new HashMap<Character, Integer>();
		
		for(int i = 0; i<str.length(); i++) {
			if (chars.containsKey(str.charAt(i))) {
				// the char is already in the map
				//1. get the current 
				//int currentCount = chars.get(str.charAt(i))+1;
				//2. increase the count by one
				//3. assign this new count to that key in the map
				
				chars.put(str.charAt(i), chars.get(str.charAt(i))+1 );
				
			}else {
				// char doesn't exist as a key in the map
				// add the char as a key
				// add count of 1
				chars.put(str.charAt(i), 1);
			}
		}
		
		return chars;
	}
	
	
	
	
	
	
	
	
	
	
}
