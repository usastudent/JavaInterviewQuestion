package javainterview.question;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfWordsInString {

	public static void main(String[] args) {
	
		/*
		 * 
		 */
		
		System.out.println("Counting words: "+ countWords("This is a test of test") );

		System.out.println("Counting Chars: "+ countChars("This is a test of test") );
		
	}
	
	// This method is using to count the number of each word in a String
	
	public static Map <String, Integer > countWords (String str){
		
		Map <String, Integer> words = new HashMap<String, Integer>();
		// method .split is using to split strings in Array of string
		// here it String is splitting by space => " "
		// w => here is pointing to the word
		
		for(String w : str.split(" ")) {
			if (words.containsKey(w)) {
				words.put(w, words.get(w)+ 1);
			} else {
				words.put(w, 1);
			}
		}
		
		
		return words;
		
	}
	
	
	
	
	
	
	
	
	
	

	// the below method is using to count the number of characters repetition in a string
	public static Map <Character, Integer > countChars (String str) {
		Map<Character, Integer> chars = new HashMap<Character, Integer>();
		
		for (int i = 0; i < str.length(); i++) {
			if(chars.containsKey(str.charAt(i))) {
				chars.put(str.charAt(i), chars.get(str.charAt(i))+1);
			}else {
				chars.put(str.charAt(i), 1);
			}
		}
		
		
		
		
		return chars;
		
	}
}
