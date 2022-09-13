package javaReviewByHomayon;

public class Selection {

	public static void main(String[] args) {
		
		/*
		 * Selection:
		 * is all the condition that you defined, 
		 * 
		 * 1) conditional operator =>  condition ? true : false
		 * 	
		 * 2) if statement
		 * 3) switch case
		 * 
		 * logic of computer depends on boolean , true and false 
		 * computer language is binary 0 and 1
		 * 
		 * if (conditions)
		 * condition must be a boolean, if it is true it runs the code and if it is false
		 * it runs the statement after if or it is not running at all.
		 * 
		 * conditional operator => ?   and    :
		 * Relational operator => > , < , ...
		 */
		
		/*
		 * Logical gates: 
		 * they are 3 important : 
		 * And && => both side should be true 
         *OR   ||  => one side should be true         
         *NOt   !
		 * 
		 * we have to kinds of Logical operator:
		 *  1) &&    vs     & => 
		 *  2) ||    vs     | =>
		 *  3) !
		 *  
		 *  
		 *  
		 */
	
		
		// false and  anything is false
		// ture and anything is true
		// && as soon as it found the first statement is false it is going to stop the execution
		int x = 1;
		int y = 2;
		//false > true;
		if (y++ < x && ++x <= y) {
			System.out.println("the condition was true");
		}else {
			System.out.println("the condition was fasle");
		}
		
		System.out.println("y "+ y);
		System.out.println("x "+ x);
		
		
		
		System.out.println("--------------------------------------");
		// here after false statment still we are going to execute the rest of the code
		int i = 1;
		int j = 2;
		
		if (j++ < x & ++i <= j) {
			System.out.println("the condition was true");
		}else {
			System.out.println("the condition was fasle");
		}
		
		System.out.println("j "+ j);
		System.out.println("i "+ i);
		
		System.out.println("-------------------------------------");
		// conditional operator
		//condition ? true : false
		
		int a =15;
		int b = 10;
		 //String str = a>b ? "Yes" : "No";
		String str = b > a ? "yes" : a+10 >b ? "maybe" : " I don't know";
		System.out.println(str);
		
		
		/*
		 * if ( conditoin) true statement;
		 */
		
		if (a>b) 
			System.out.println("true statement");
		
		System.out.println("sdfdfdfd"); // ths is not part of code so anyway it executes.
		
		// if we have { } it means block of code so it execute whatever is inside it.
		// in if statement we always execute one block as soon it matches we get out .
		
		
		/*
		 * switch 
		 */
		

	}

}
