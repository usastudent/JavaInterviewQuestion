package javainterview.question;

import java.util.HashSet;
import java.util.Set;

public class FindingDuplicateInArraysMethod2 {
	
	public static void main(String[] args) {
		
		/* 
		 * we try to sove it by set collection=> set is not going to accept dupplicate value
		 * in this method we are trying to decrease the numbers of time which the code
		 * is going to run to get 
		 * we have string of 6 index, so we are going to run 6 times it
		 */
		String [] data = {"test", "take", "nice", "pass", "test", "nice"};
		
		System.out.println("Method 2");
		printDuplicateInArray2(data);
	}
	
	// we use set and its method add that return us boolean and if returns is false means
	// this element is duplicate
	
	public static void printDuplicateInArray2(String [] data) {
		
		Set<String> temp = new HashSet<String>();
		for(int i =0; i<data.length; i++) {
			if( !temp.add(data[i])) {
				// ! makes it false and this element is a duplicate
			System.out.println("Duplicate element found on index "+i+" with the value of: "
					+data[i]);
			}
		}
	}
	
	
	
}
