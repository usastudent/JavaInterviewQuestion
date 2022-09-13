package basicOFJava;

public class MultiDimensionalArrays {

	public static void main(String[] args) {
		
		/*
		 * multi dimensional array:
		 * you are trying to store an array inside an array
		 * 
		 * []=> Define the size number of an array, each [] is one array.
		 * 
		 * int [][] arr = new int [3][2];=> the first [] is outer or bigger array  or row
		 * and the second [] is the inner or smaller array or column in table.
		 *  
		 */
		
		// there are 2 ways for deceleration and initialization
		
		int [][] numbers = new int [5][3];
		int [][] nums = { { 1, 2, 3}, { 3,2 ,1 }, {4 ,6 , 8}, {5 ,7 ,7 }, {6 , 3, 9} };
		
		int x = 1;
		/*
		 * to go through the multi dimensional array we need to write nested for
		 * 
		 */
		for (int i = 0; i < numbers.length; i++) {
			for(int j =0; j< numbers[i].length; j++) {
			numbers [i][j] = x++;
			System.out.print(numbers[i][j]+ "\t");
			}
			System.out.println();
		}
		
		
	}

}
