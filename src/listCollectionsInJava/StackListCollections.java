package listCollectionsInJava;

import java.util.Stack;

public class StackListCollections {

	public static void main(String[] args) {
		
		/*
		 * Stack means last in first out
		 * the method peek : means it is going to return what is on the top of the stack
		 * the method pop  : it is going to remove the variable on the top of the stack and 
		 * it is going to return the same variable too. so it makes the stack empty eventually
		 * 
		 * Stack is inheriting from vector so it has all the methods form vector
		 * stack is look like vector but the flow of execution is different.
		 * 
		 */
		
		Stack<String> st = new Stack <String>();
		
		st.add("E1");
		st.add("E2");
		st.add("E3");
		st.add("E4");
		
		System.out.println(st);
		System.out.println("peek: "+st.peek());// it is going return the value which is on the top of the Stack.
		System.out.println("firstElement: "+ st.firstElement());// it is giving you the first value which you put in the stack and it is in the bottom of the stack.
		System.out.println("pop: "+ st.pop());// it remove the value which is on the on the top of the stack.
		System.out.println(st);
		

	}

}
