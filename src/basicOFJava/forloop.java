package basicOFJava;

import java.util.Iterator;

public class forloop {

	public static void main(String[] args) {
		
		//for loop can run with out initialization 
		
		/*
		 *  for ( declaration ; conditon; update) {   body of the loop    };
		 *      (starting point; ending point; update ) 
		 */

//		for (int i = 0; i <=5; i++) {
//			System.out.println(i);
//		}
//		
//		 for (int j =5; j>=1; j--) {
//			 System.out.println(j);
//		 }
		
//		 for (int i = 0; i <=5; i++) {
//				System.out.println("start");
//				for (int j =5; j>=1; j--) {
//					 System.out.println(j);
//				 }
//				
//			}
		
//		for(int i = 0; i<=10; i +=2) {
//			System.out.println(i);
//			
//		}
		
		// you could have multi condition, declaration, update// the only thing they should
		// have the same datatype
		for(int i = 0, j= 10; i<= 10; i++, j--) {
			System.out.println("i "+i+"  j "+ j);
		}
	}

}
