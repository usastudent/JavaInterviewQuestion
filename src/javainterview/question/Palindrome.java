package javainterview.question;

public class Palindrome {

	public static void main(String[] args) {
		
		// find out if a word is palindrome
		 String word= "abcba";
		 
		 System.out.println("isPalindrome1: " + isPalindrome1(word));
		 System.out.println("isPalindrome2 " + isPalindrome2(word));
		 System.out.println("isPalindrome3 " + isPalindrome3(word));
		 System.out.println("isPalindrome4 " + isPalindrome4(word,true));
	}
	
	// first way using StringBuilder or StringBuffer
	
	public static boolean isPalindrome1 (String word) {
		// SringBuilder or buffer has a method reverse that you can use to reverse
		//String
		
		StringBuilder sb = new StringBuilder(word);
		return word.equals(String.valueOf(sb.reverse()));
	}
	
	
	// Second way: using 
	
	public static boolean isPalindrome2 (String word) {
		
		String rev = "";
		for (int i = word.length()-1; i >= 0; i--) {
			rev += word.charAt(i);
		}
		
		return word.equals(rev);
	}
	
	
	// third way:
	
	public static boolean isPalindrome3 (String word) {
		
		for (int fwd = 0, bck = word.length()-1; fwd < word.length();fwd++, bck--) {
			if(fwd == bck || fwd > bck) {
				return true;
			}
			
			if(word.charAt(fwd) == word.charAt(bck)) {
				continue;
			}
			return false;
		}
		return true;
	}
	
	
	// forth way 
	
	
public static boolean isPalindrome4 (String word, boolean considerCase) {
	
		String w ="";
		if(considerCase) {
			w=word;
		}else {
			w = word.toLowerCase();
		}
		
		for (int fwd = 0, bck = w.length()-1; fwd < w.length();fwd++, bck--) {
			if(fwd == bck || fwd > bck) {
				return true;
			}
			
			if(w.charAt(fwd) == w.charAt(bck)) {
				continue;
			}
			return false;
		}
		return true;
	}
	
	

}
