package iterationOnCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IterationOnCollections {

	public static void main(String[] args) {
		
		/*
		 * what are Iterators: 
		 * set is not working base on index so we can't use for loop instead we use foreach
		 * 
		 * Iterators work with all the collections.
		 * 
		 * Enumeration: access and read only interface
		 * more, and has element method
		 */

		ArrayList<String> st = new ArrayList<>();
		
		st.add("1");
		st.add("11");
		st.add("111");
		st.add("1111");
		
		System.out.println(st);
		
		// for loop
		System.out.println("using for loop -----------------------------------");
		for (int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i));
		}
		
		System.out.println("using foreach -------------------------------------");
		
		for (String s : st) {
			System.out.println(s);
		}
		
		System.out.println(" using iterator ------------------------------------");
		
		/*
		 * when you create an object of Iterator interface they you have 3 main methods
		 * 1) one will check if there is next element => hasNext
		 * itNext and romove
		 * by Iterator you can only go forth.
		 */
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			String s = (String) it.next();
			System.out.println(s);
			if (s.equals("111")) {
				it.remove();
			}
			
		}
		
		System.out.println(st);
		
		System.out.println("usnig listIterator -----------------------------");
		
 ArrayList<String> data = new ArrayList<>();
		
		st.add("1");
		st.add("11");
		st.add("111");
		st.add("1111");
		
		// by ListIterator you can go forward and in to the previous
		// it is only work with List
		ListIterator <String> listIt = data.listIterator();
		while (listIt.hasNext()) {
			String s = (String) listIt.next();
			System.out.println(listIt);
			
			
		}
		
		
		
	}

}
