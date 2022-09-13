package basicOFJava;

import java.util.Scanner;

public class Whileloop {

	public static void main(String[] args) {
		
		/*
		 * when we talk about iteration, we talk about the statement that are going to
		 * have a loop basically they are going to have a cycle of executing the same code
		 * as long as the condition is true.
		 */
		
		/*
		 * while (condition){                                     };
		 * the first condition should be true, to get into the loops and as long as the 
		 * condition is true, it is looping as soon the condition gets false, it comes out
		 * of the loop
		 */

//		int x =10;
//		while (x>=0) {
//			if (x==5) {
//				x--;
//				continue;
//				
//			}
//			
//			System.out.println(x--);
//			
//		}
		
		/* 
		 * while loop usually is used for event control situation 
		 * you could key break and continue
		 * break=> it will stop the loop
		 * continue=> will skip that iteration
		 */
		
		/*
		 * Infinite loop is a loop which condition is not going to be false, it will keep
		 * cycling through the loops
		 */
		
//		while (true) {
//			System.out.println(x++);
//		}
		
		
		/*
		 * Scanner class: it is going to ask the user to input something in console
		 * and enter, that would be taken to the system, and store in variable.
		 */
		Scanner  obj = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String test = obj.nextLine();

		while (test.equals("NA")) { 
			System.out.println("Can't have NA as name, please enter the name again: ");
			test = obj.nextLine();
		}
		System.out.println("Name: "+test);	
		// it means as long as the NA is writen in consloe keep continue otherwise get out.
	}

}
