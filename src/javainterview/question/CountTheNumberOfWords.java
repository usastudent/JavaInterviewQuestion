package javainterview.question;

import java.util.HashMap;
import java.util.Map;

public class CountTheNumberOfWords {

	public static void main(String[] args) {
		
	String str = "we are in the house and we are coding in computert";
//	//System.out.println(str.split(" "));// it gives us the address in memory
//	
//	System.out.println(str.length()); // it gives us the length to the array
//	System.out.println(str.split(" ").length); // it gives us the length of the words
//	
//	for( String s : str.split(" ")) {
//		System.out.println(s);
//	}

	
//	System.out.println("----------------------------------------------");
//	
//	// we call the method another way
//	System.out.println("number of the words in the String: " + countOfWords(str));
	  
	
	System.out.println("count the number of words in given string");
	// we call the method
	System.out.println(countOccurances(str));
	}
	   
	
	

	// count the number of words in a given String
	 
		public static int countOfWords(String str ) {
			return str.split(" ").length;
		}
	
	
		// count the number of occurrence of words in a string
		
		public static Map <String, Integer> countOccurances (String  str){
			Map<String, Integer> temp = new HashMap<String, Integer>();
			
			for(String word: str.split(" ")) {
				// check to see if the word is in the map
				if(temp.containsKey(word)) {
					// if, yes increase the count
					// find the current count
					// add one to that 
					// that is the new count
				int newCount = temp.get(word)+1;
				temp.put(word, newCount);
				
					
				}else {
					// if not, add to the map with the count 1
					temp.put(word, 1);
					
					
				}
				
				
				
			}
			return temp;
		}
		
		
		
		
		

}
