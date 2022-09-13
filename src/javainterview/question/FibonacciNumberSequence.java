package javainterview.question;

import java.util.ArrayList;
import java.util.List;

public class FibonacciNumberSequence {

	public static void main(String[] args) {
		
		/*
		 * fibanacci Number start with 0 and 1 , and then the next number is the 
		 * sum of previous one + current one
		 * ex: 0, 1, 1, 2, 3, 5, 8
		 */

		// solution with  Array
		
		// write a function that return a sequence of fib
		// numbers based on the given value

		// fib Numbers =
		// 1 - we start with 0 1
		// 2 - every next number is the sum of the two previous numbers
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

//		int count = 20;
//
//		int[] fibNums = new int[count];// make the array
//		fibNums[0] = 0; // assign the first value
//		fibNums[1] = 1; // assign the second value
//
//		for (int i = 2; i < fibNums.length; i++) {
//			fibNums[i] = fibNums[i - 1] + fibNums[i - 2];
//			System.out.print(" "+fibNums[i]+",");
//		}
		
//		for (int i : fibNums) {
//			System.out.print(i + ", ");
//		}
		
		
		System.out.println("Below solution is with ArrayList----------------------");
		
		
		System.out.println(fibNumbers(50));
		
		
	}

	public static List<Integer> fibNumbers (int end) {
		
		List<Integer> fibNum = new ArrayList<Integer> ();
		
		fibNum.add(0);
		fibNum.add(1);
		
		for (int i = 0; true; i++) {
			if (i>= end) {
				break;
			}
			fibNum.add(fibNum.get(fibNum.size()-1) + fibNum.get(fibNum.size()-2) );
		}
		return fibNum;
	}
}
