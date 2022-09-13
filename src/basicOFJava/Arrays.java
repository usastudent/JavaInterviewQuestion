package basicOFJava;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		 * Arrays: storing multiple data in a set or collection.
		 * Array is used to store multiple same data type in a collection.
		 * Array is fixed in size.
		 * int [] data = new int [5]; => the datatype is: single dimensional array of integer
		 * data[0]=2;
		 * data[1]=4;
		 * System.out.println(data[0]);
		 * if you want to see all of data , you need to loop through it
		 */
		
		// important part: arrays are contiguous block of the memory, fixed in size
		
		
		
		int [] data = new int [5];
		data[0]= 5;
		data[1]= 10;
		data[2]= 15;
		data[3]= 20;
		data[4]= 25;
		
		System.out.println(data[1]);
		
		// if you want to go through all data of array
		for(int i =0; i< data.length; i++) {
			System.out.println(data[i]);	
			
		}

		for (int j : data) {
			System.out.print(j+",");
		}
		
		// you can define any data type , in array it is possible to not store any data 
		
				/*
				 *  it can store default value
				 *  int 0
				 *  double 0.0
				 *  boolean false]
				 *  object null;
				 */
		int [] def = new int [5];
		
		for(int i : def) {
			System.out.println(i);
		}
		
		
		// this is another way to store data in one dimensional array
		
		String [] names = { "Jack", "David","Alex","Marry","Jenifer"};
		for (String value : names) {
			System.out.print(value+",");
		}
		/*
		 *  one important things about difference of array with other collection is that
		 *  array to be contiguous block of memory in java, it means all of the indexes 
		 *  will store side by side in the memory. it helps to make the process of retrieving 
		 *  or storing of data  to be faster
		 */
	}

}
