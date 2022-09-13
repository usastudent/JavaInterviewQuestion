package basicOFJava;

public class SwitchCase {

	public static void main(String[] args) {
	
		/*
		 * switch case is a selection
		 * with switch case you are limited to the number of data types and the number of 
		 * operators that you can use.
		 * in switch case you define an expression and each case try to match that expression.
		 * switch(expression){
		 * case expression that you want to match;
		 * case ... ;
		 * break;
		 * default:...
		 * }
		 * 
		 */

		/*
		 * different between switch and if statement is:
		 * in switch case it start from where case match to the switch statment
		 * and it starts from there until it sees the break keyword, or it goes
		 * all the way down to the end.
		 * 
		 * 
		 */
		
		String str = "sample1";
		switch(str){
		case "sample":
			System.out.println("line 1");
			System.out.println("line 2");
			break; // if we don't have this break keyword, the execution will go all the way down.
			
		case "sample1":
			System.out.println("line 3");
			break;
		default:
			System.out.println("default block");
			
		}
		
		// you can have as many case statement in switch case if you want
		
		
		/*
		 *  you can not use relational operator with switch cases, if you want it you need 
		 *  to use if statement or unary statement.
		 */
		
//		int x = 10;
//		switch (x) {
//		case x > 5: // you can not use relational operation with swich cases.
//			break:
//				
//		}
		
		
		/*
		 * switch case will accept datatypes:
		 * byte, short, char, int => primitive data types
		 * enums, String
		 */
		
		
		
		
		
		
		
	}

}
