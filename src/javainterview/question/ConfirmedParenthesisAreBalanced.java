package javainterview.question;

import java.util.Stack;

public class ConfirmedParenthesisAreBalanced {

	public static void main(String[] args) {
		
		String sample1 = "()()()()()()()()()";
		String sample2 = "(((()()()(()))))";
		String sample3 = "))(("; // because we don't have anything stack it gets us false
		String sample4 = "<(()){}{<>()}>";
		String sample5 = "<{[(test)(test2)]}>";
		String sample6 = "";
		String sample7 = null;
		
		System.out.println("sampl 1: "+ isBalanced(sample1));
		System.out.println("sampl 2: "+ isBalanced(sample2));
		System.out.println("sampl 3: "+ isBalanced(sample3));
		System.out.println("sampl 4: "+ isBalanced(sample4));
		System.out.println("sampl 5: "+ isBalanced(sample5));
		System.out.println("sampl 6: "+ isBalanced(sample6));
		System.out.println("sampl 7: "+ isBalanced(sample7));
		
				}

	public static boolean isBalanced(String str) {
		// validation - make sure that str is not null
		if (str == null) {
			System.out.println("Input was null");
			return false;
		}
		
		// stack for chars
		Stack<Character> chars = new Stack<Character>();
		
		for (Character c : str.toCharArray()) {
			//if it is an opening - added to the stuck 
			if( c == '(' || c == '{' || c == '[' || c == '<'){
				chars.add(c);
			}else {
				
			// at this point there must be at least one variable at the stack
				if (chars.size()<1) {
					return false;
				}
			// else its closing- compare that with the last value added to the stack
			// method pop in stack remove the character on the top of stack but pick only
			// select the element
			
				// checking ()
			if(c == ')' && chars.pop() !='(') {
				return false;
			}
			
			//checking {
			if(c == '}' && chars.pop() !='{') {
				return false;
			}
			
			//checking [
			if(c == ']' && chars.pop() !='[') {
				return false;
			}
			
			//checking <
			if(c == '>' && chars.pop() !='<') {
				return false;
			}
		}
		}
		
		return chars.size()==0;
	}
}
