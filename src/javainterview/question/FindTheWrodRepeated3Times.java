package javainterview.question;

import java.util.HashMap;
import java.util.Map;

public class FindTheWrodRepeated3Times {

	public static void main(String[] args) {
		
		// give us the words that has been repeated more than a n times
		
		String str = "this is me trying to say something that is done by me which me is happy, me";
		
		System.out.println(countOccWithLimit(str, 2));
	}

	public static Map<String, Integer> countOccWithLimit (String str, int n){
		
		Map<String, Integer> res = new HashMap<String, Integer>();
		Map<String, Integer> temp= countOccurances(str);
		
		// we can't use indexes for set. sets don't have indexes so we can't use foorloop
		// so we can loop base on keys
		
		for(String key: temp.keySet()) {
			if (temp.get(key) > n) {
				res.put(key, temp.get(key));
			}
		}
		
		
		return res;
		
		
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
