package javainterview.question;

import javax.naming.spi.DirStateFactory.Result;

public class SumExample {

	public static void main(String[] args) {
		
		/*
		 * Given 3 integer values,abc, return their sum. However, if one of the values 
		 * is 10 it does not count towards the sum and values to its right do not count. so,
		 * for example, if b is 10 then both b and c not count.
		 * Examples:
		 * freedomSum(1,2,3)=>6
		 * freedomSum(1,2,10)=>3
		 * freedomSum(1,10,3)=>1
		 */
	
		//System.out.println(freedomSum(2, 4, 10));
		
		System.out.println(freedomSum(1, 1, 1));
	}

	
	public static int freedomSum (int a, int b, int c) {
		
		if(a==10) {
		return 0;	
		}else if(b==10){
			return a;
		}else if (c==10) {
			return a+b;
		}else {
			return a+b+c;
		}
		
		
		 
	}
	
	
	
}
