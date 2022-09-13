package javaReviewByHomayon;

public class StackAndHeap {

	public static void main(String[] args) {
		
		String str = "test";
		String str2 = "test";
		String str3 = new String ("test");
		
		System.out.println(str == str2); // they are both are referening to the same location
		System.out.println(str == str3); // they are not stored in the same location 
		System.out.println(str.equals(str3)); // they are both have the same value
		
		// String is immutable => not changeable
		
		// StringBuilder and StringBuffer are mutable => means changeable in the spot in memory
		// the location in the memory is not going to change ( mutable )
		StringBuilder sb = new StringBuilder("test");
		sb.append("2"); // add something at the end 
		System.out.println(sb);
		 
		/*
		 * Buffering mean you are going to do it one it at the time, it is a thread safe
		 * StringBuilder is not thread safe , unsynchronized 
		 */
		
		
		
	}

}
