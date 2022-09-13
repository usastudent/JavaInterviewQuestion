package basicOFJava;

public class AssignmentVsCalling {

	public static void main(String[] args) {
		
		int x =10;
	// the below is assignment
		x+=10; // here we assign a value to x, it means we change the value of the variable
		System.out.println(x);
		x*=5; // ==. x=x*5 ==> assigning 
		System.out.println(x);
		
		System.out.println(x+20);// here we call variable x and we donot change the value 
		
		/* 
		 * increment => ++
		 * decrement => --
		 * pre vs post
		 * in pre we increase or decrease the value=> --x , ++x
		 * in post we increase of decrease the value after variable but in the other line 
		 * of code => x-- , x++ don't change here but will change the value in next line.
		 * 
		 * when we use ++ or -- we change the value of our variable in fact. but
		 * when we use variable - 1 or variable +1 we don't change the value of the variable
		 */
		int y = 1;
		System.out.println(1+y); // here we don't change the value of y
		System.out.println(y); // value is 1
		System.out.println(++y); // here we change the value of variable y , after this y is 2
		System.out.println(y); // value changed to two
		
		int j = 2;
		System.out.println(j++); // post increment: the value is not going to change
		System.out.println(j ); // here the value of varaibale j chaange to 3
		
		

	}

}
