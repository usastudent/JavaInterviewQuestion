package basicOFJava;

public class ScopeInJava {

		
		/*
		 * what is scope? 
		 * scope is refer to the area where the variable is accessible in your code
		 * exp: in main method => your scope is inside the main method
		 * so scope is the area that you can access to your code.
		 * ? => then
		 * : => otherwise
		 */
	
		// duplication is not alowed in the same scope of code
	
		// int a = 10;// I can't access this variable inside of the below methods. because
		 // it is not static, so if i want to use it inside the below methods. I can make 
		 // static like: static int 1= 10; or bring it inside the static below methods
		 
		 static int a = 10;
		public static void max(int a , int b) {
			System.out.println(a>b ? "A is bigger" : "B is bigger");
		}

	public static void main(String[] args) {
		 int a = 10; 
		 int b= 15;
	//	 int b = 15; // we can not define the variable with the same name in a scope
		 
		max(a, b);
		//max(10, 5);
	}
	
	

}
