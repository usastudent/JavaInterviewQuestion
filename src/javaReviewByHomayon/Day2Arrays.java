package javaReviewByHomayon;

public class Day2Arrays {

	public static void main(String[] args) {
		
		// you need to start from array
		//array is a contiguous blocl of the memory
		
		//10, 10.5, 'a', "test"
		// by object data type we can have all the type of data
		// defult value of object is null
		 
		Object [] temp = new Object[4];
		int i =0;
		
		temp[i++]=10;
		temp[i++]=10.5;
		temp[i++]='a';
		temp[i++]="test";
		
		for(Object object : temp) {
			System.out.println(object);
		}
		
		
		 
		
		

	}

}
