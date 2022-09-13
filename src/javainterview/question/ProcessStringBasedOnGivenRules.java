package javainterview.question;

import java.util.HashSet;

public class ProcessStringBasedOnGivenRules {

	public static void main(String[] args) {
		
		/*
		 * Write a method that modifies a string using the following 3 rules:
		 * 
		 * 1) Each word in the input string is replaced with following: 
		 * the first letter  of the word, the count of distinct letters between the first
		 * and last letter, and the last letter of the word, For example, "Freedom Mortgage" 
		 * would be replaced by "F4m M5e".
		 * 
		 * 2) A "Word" is defined as a sequence of alphabetic characters, delimited by 
		 * and non-alphabetic characters.
		 * 
		 * 3) Any non-alphabetic character in the input string should appear in the output 
		 * string in its original relative location.
		 * 
		 * another exp: This$is Book => T2s$i0s B1k
		 */
		
		// first we need to split the word
		
		String testValue = "Freedom Mortgage";
		System.out.println(getResultBasedOnRules(testValue));
		
		
		

	}
	
	// first we need to split the String
	/*
	 * rejects=> are using for spiting
	 * a-z => it covers from a to z lower case
	 * A-z =. it covers from A to Z upper case
	 * ^ => not operator
	 */
	
	// next method:
	
	private static String processWord (String str) {
		
		// we need the first char 
		// length of the unique chars in between first and last
		// last char
		
		// here we try to find out the indexes between first and last
		String r = str.substring(1, str.length()-1);
		
		// we need to count unique character in => r (we divided it by substring from string)
		// we can use Set => because Set doesn't accept duplicate
		HashSet <Character> chars = new HashSet<Character>();
		
		// i need to loop through lenght of r
		for (int i = 0; i < r.length(); i++) {
			chars.add(r.charAt(i));
		}
		
		//System.out.println("size " + chars.size() );
		
		// the string "" her is because char is count as string and 4 is number
		return "" + str.charAt(0) + chars.size() + str.charAt(str.length()-1);
	}
	
	
	/*
	 * we have a method that split based on space and also we have another method that 
	 * process the word based on first and last letter and the unique letter count in
	 * the middle of them.
	 * 
	 * right now we need to use these two above method to puth the together
	 */


	public static String getResultBasedOnRules (String str) {
		String reg = str.replaceAll("[a-zA-Z]", "");
		String[] words = str.split("[^a-zA-Z]");
		String result ="";
		
		for (int i = 0; i < words.length; i++) {
			result += processWord(words[i]);
			
			if(i <= reg.length() - 1) {
				result+= reg.charAt(i);
			}
		}
		
		return result;
	}
	
	
	// we don't need the below method, it just helps us for better understanding
	
	// in this method we try to split words based on space
//	private static String[] splitWords(String str) {
//		return str.split("[^a-zA-Z]");// this gives us all the characters with out a to z
 
// for (String string : words) {
//	System.out.println(string);
//}
		
	//}

}
