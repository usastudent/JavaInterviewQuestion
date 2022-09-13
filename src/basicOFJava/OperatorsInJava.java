package basicOFJava;

public class OperatorsInJava {

	public static void main(String[] args) {
		

		/*
		 * Assignment operator=> =   => when we assign a value to a variable
		 * 
		 * Equality operators=>  == => when you compare two values you can use it
		 * equality operators generally work with primitive data type. in case of reference 
		 * data type they only say the address of them in location, are they in the same sopt
		 * in the memory or not.
		 * it is not good to compare two string by equality operator.
		 * 
		 * not equal to =>      !=  =>
		 */
		
		int x =5;
		int y = 10;
		boolean z = x!=y;
		System.out.println(z);
		System.out.println("------------------------------------------------");
		
		/* 
		 * it is not good to compare two string by equality operator.
		 * when we are saying new String in fact we make a new object so each object refers
		 * to a new location spot in the memory, that's why th below code is false. in fact 
		 * it compares their address
		 * we can compare the value by .equal method
		 */
		String str1= new String ("test"); // address 001
		String str2= new String ("test"); // address 002
		System.out.println(str1==str2); // false
		System.out.println("-----------------------------------------------");
		System.out.println(str1.equals(str2)); // this method compares the value of string.
		
		
		/*
		 * Relational operator 
		 * you can define condition , it defines true or false
		 * <. > , <= , =>
		 */
		
		int i = 5;
		int j = 10;
		System.out.println("checking relational operator "+ (x>y));
		
		System.out.println("--------------------------------------------");
		/*
		 * Logical operator
		 * And  && => both of conditions should be true 
		 * Or  ||  =>  one side should be true
		 * NOt  !  => it takes your input and reverse it.
		 * ^    zor => it only returns true if both side is different, false true
		 */
		
		
		
		int t = 10;
		int p = 5;
		
		if(t>p || t==p) {
			System.out.println("the condition resulted true");
		}
		
		if(t>p && t==p) {
			System.out.println("the condition resulted false");
		}
		System.out.println("-------------------------------------");
		
		System.out.println(true||false);
		System.out.println(false || false);
		System.out.println(false || true);
		
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println( !(true && true));
		System.out.println( ! (true && false));
		System.out.println( ! (false && false));
		
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		 
		System.out.println("----------------------------------------------");
		/*
		 * there are 2 important rules for logical operation
		 * 1) True or =>anything is true => the rest of code after true || isn't executed.
		 * 2) falsee and => anything is false=> the rest of code after and && isn't executed.
		 */
		int k =1;
		System.out.println(true || 10<k++);
		
		
		System.out.println("------------------------------------------------");
		
		// concatenation means connecting multiple string to each other. 
		/*
		 * precedence rules:
		 * execution order => top to bottom then left to right
		 * in math => by using () this means whatever is inside will execute first
		 * then division => multiplication => sum => minus
		 */
		System.out.println(1+1-2 / 2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
