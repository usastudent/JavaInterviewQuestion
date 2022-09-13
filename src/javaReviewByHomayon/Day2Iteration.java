package javaReviewByHomayon;

import java.util.ArrayList;

public class Day2Iteration {

	public static void main(String[] args) {
		
		/*
		 * Iteration: you can loop through, you want to cycle 
		 */

		boolean condition = false;
		
		while (condition) {
			// condition > body of the loop
			System.out.println("while loop");
		}
		
		do {
			// body of the loop> condition
			System.out.println("do while loop");
		}while (condition);
		
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Jack");
		names.add("David");
		names.add("Anna");
		
		// for each loop
		for(String s : names) {
			System.out.println(s);
		}
		
		
		// for loop
		/*
		 * s v i 
		 * s => pointer
		 * i => is an int used as the counter of the loop to refer to the indexes 
		 */
		for (int i = 0; i < names.size(); i++) {
			
			System.out.println(names.get(i));
			
		}
		
		// in Array we have length and in ArrayList we have size to get the lenght 
		// with () it means it is a method, without () it is variable
		
		
		
		for ( ; true ;) { // it works because it desn't say that we have to declare and initialize
			
		}
		
		
		
		
		
		
	}

}
