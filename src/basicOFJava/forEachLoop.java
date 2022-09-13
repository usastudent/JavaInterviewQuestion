package basicOFJava;

public class forEachLoop {

	public static void main(String[] args) {
		
		/*
		 * when you wan to go through the Collections
		 *  if you want to go through a collection, you need to know the name of array and 
		 *  its data type 
		 *  for ( datatype  yourownselectedname : name of collection ) {
		 *  {
		 *  the varible num here is referring to the actual value 
		 */
		 
		int [] arr = {1,2,3};
		for (int num : arr) {
			System.out.print(num);
		}
		
		/*
		 *  difference between forloop=> in forloop you have to define the condition to
		 *  to go through the array but in   foreach you don't need to do it.
		 *  i => here is pointer and referres to the index number
		 */
		System.out.println("------------------------------------------------");
		int [] array = {1,2,3,4,5};
		for (int i =0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		
		
	}

}
