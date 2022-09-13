package listCollectionsInJava;

import java.util.ArrayList;

public class ArrayListCollections {

	public static void main(String[] args) {
		
		/*
		 * Collections frame work: 
		 * collections are used to store data, they have different ways to store the data.
		 * 
		 * when you know the size of your data and you know the data type, array is fast and 
		 * good because the data is stored in contiguous block of memory so finding and 
		 * Retrieving data is very fast
		 * 
		 * In most cases we don't know the sizes of our data and we need the dynamic 
		 * collection to store data and be able to handle the size of data so we have bunch
		 * of collections and we have different collections
		 */
		
		/*
		 * List in general is going to take data and store it, it doesn't have any limitation 
		 * on the type of the data or the data size, it is dynamic 
		 */
		
		/*
		 * types of List:
		 * 1) ArrayList    2) LinkedList    3) Vector    4) Stack
		 * 
		 * the first list or the popular one is called: ArrayList class
		 * ArrayList makes array with changeable 
		 * 
		 * ArrayList < the name of the class or rapper class> arr= new Arraylist<String>(); 
		 * ()=> option to define size of the arry, if we don't definethe size , it is 10 indexes.
		 * exp=> ArrayList<String> arr = new ArrayList<String> ();
		 * 
		 * every time it makes a new array if we have bigger data than its current array
		 * how we add: old capacity * 3 /2 +1 = next capacity=> 10*3/2+1= 16
		 */
		
		/*
		 * bad and good parts about ArrayList:
		 * one challenge is it has to make new capacity and old capacity (array) should be 
		 * deleted, and it happens a lot. and it takes a lot of processing to move data
		 * 
		 * second: ArrayList doesn't allow the empty indexes in the ArrayList
		 * it means if we have an empty index in the ArrayList we need to shift all the indexes
		 * one by one to fill that gap, this makes the process time long and slow
		 * 
		 * generic is the idea which we define what type of data type we want to use between <>
		 * and we can't use primitive data type for it but if we want to use primitive data type
		 * we have to use rapper class , the first letter is Upper case and it write its name
		 * complete. ex: Integer
		 */

		/*
		 * usually we use ArrayList with smaller data set
		 * we use it when we need to do addition or searching of data, if you do delete or
		 * modification you need to do a lot of shifting so it is not recommended with 
		 * ArrayList
		 */
		ArrayList<String> ar = new ArrayList<String>();
		//System.out.println(ar);=> it gives us the array
		
		ar.add("value 1");
		ar.add("value 2");
		ar.add("value 3");
		ar.add("value 4");
		ar.add("value 5");
		
	System.out.println(ar);
	
	/*
	 * in general we have to know some ArrayList methods
	 * add=> it adds something to the arraylist
	 * add all=> it takes a collection and add all of it to the ArrayList
	 * colne=> copy it
	 * contains=> is going to check the variable that you are looking for is in the array and
	 * it return boolean
	 * 
	 */
	
		System.out.println(ar.contains("value 3"));
		
		// loop through ArrayList by forLoop
		for(int i =0; i< ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// loop through ArrayList by for each
		for (String s : ar) {
			System.out.println(s);
		}
		
		
		
		
		
	}

}
