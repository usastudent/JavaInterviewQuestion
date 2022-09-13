package basicOFJava;

public class Selection {

	public static void main(String[] args) {
		
		/*
		 * Selection: is the idea of defining condition and base on whether true or false
		 * we will execute something.
		 * 
		 * Unary operator:
		 * condition ? true : false;
		 * ? => then
		 * : => otherwise
		 */
		 int x =10;
		 int y =5;
		 boolean z = x>y ? true : false;
		 System.out.println(z);
		 
		 String result = x>y ? "x is bigger ": " it is not";
		 System.out.println(result);
		 
		 /*
		  * if statment
		  * if (condition){ true block }; => here we have block of codes that's why we have 
		  * curly brackets.
		  * or
		  * if (condition) print something; => you don't have curly brackets {} because
		  * you don't have block of code, you have only code statement 
		  * block of code means more than one line of code but statement of ode means one 
		  * line of code, 
		  * 
		  * if (conditions){
		  * true block 
		  * }else if (conditions){
		  * true block
		  * }else if (conditions){
		  * block of codes
		  * }else {
		  * block of codes
		  * }
		  * 
		  * 
		  */
		 
		 int i = 11;
		 int j = 100;
		 String res = i>j ? "i is bigger ": " j is bigger";
		 
		 if ( i>j ) {
			 System.out.println(res);
		 }else {
			 System.out.println(res);
		 }
		 
		 
		 double grade =85;
        // 90-100 =A
		// 80-90  =B
		// 70-80  =C
		// 60-70  =D
		// < 60   =F
		
		 // we read if statement from top to bottom and as soon as find out the answer
		 // we come out of the if statement and continue
		 if ( grade >= 90) {
			 System.out.println("A");
		 }else if (grade >= 80) {
			 System.out.println("B");
		 }else if (grade >= 70) {
			 System.out.println("C");
		 }else if (grade>=60){
			 System.out.println("D");
		 }else {
			 System.out.println("F");
		 }
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
