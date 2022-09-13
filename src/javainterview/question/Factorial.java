package javainterview.question;

public class Factorial {

	public static void main(String[] args) {
		
		/*
		 * factorial practice question
		 * 5! = 1*2*3*4*5
		 * 
		 */
		
		// write a code that will return factorial of num
		// 1*2*3*4*5
		// hint: you can use for loop
		
		
		int y = 5;
		int fact = 1;
		for (int i =1; i <=y; i++) {
			fact = fact*i;
			//1. fact =1*1=1
			//2. fact= 1*2=2
			//3. fact =2*3=6
			//4. fact =6*4= 24
			//5. fact =24*5=120
			//System.out.println(fact);
		}
	System.out.println("factorial of : " + fact);

	}

}
