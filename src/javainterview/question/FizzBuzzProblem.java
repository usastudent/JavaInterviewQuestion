package javainterview.question;

public class FizzBuzzProblem {

	public static void main(String[] args) {
	
		/*
		 * write a function which writes from 1 to 100 and if the number is 
		 * divisible by 3 print=> Fizz and if number is divisible by 5 print => Buzz
		 * and if the number is divisible by both 3 & 5 print => FizzBuzz
		 * and if it is not the case print the number
		 */
		
		/*
		 * exp: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz
		 * 
		 * first we need to make a loop and then if statement
		 */
		
		printFizzBuzz(1, 30);

	}
	
		public static void printFizzBuzz (int start, int end) {
			
			for(int i = start; i <= end; i++) {
				
				// if divisible by 3 we print => Fizz
				// if divisible by 5 we print => Buzz
				// if divisible by 3 & 5 we print => FizzBuzz
				// other than that print the numbers
				
			if (i % 3 == 0 && i % 5 ==0) {
				System.out.println("FizzBuzz"); // make sure have this first because in if statement as soon as if statement maches then the result will be out 
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
				
				
				
				
				
		}
	
		}
	

}
