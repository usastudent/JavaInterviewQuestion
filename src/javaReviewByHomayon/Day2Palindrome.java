package javaReviewByHomayon;

public class Day2Palindrome {

	public static void main(String[] args) {
		
		String str = "1235321";
		
		isPalindrome(str);

		System.out.println(isPalindrome2(str));
	}

	// length is used as method in String  to define the size of the string we need ()
	// but in array we need to use (). here is variable
	
	public static void isPalindrome (String str) {
		
		String rev ="";
		
		for (int i = str.length()-1; i >= 0; i--) {
			rev+= str.charAt(i);
			
		}
		if ( rev.equals(str)) {
			System.out.println(rev +" Palindrome");
		}else {
			System.out.println(rev+" not palindrome");
		}
		
			}
	
	// another method 
	// run it as long as i is not equal to j => i! =j
			public static boolean isPalindrome2 (String str) {
				for (int i = 0, j = str.length()-1; i < str.length(); i++,j--) {
					
					if(str.charAt(i) != str.charAt(j)) {
						
						System.out.println("Not palindrome");
						return false;
					}
				if(i==j || i > j) {
					
					System.out.println("palindrome");
					return true;
				}
									
					
		}
				System.out.println("Not palindrome");
				return false;
	}
}
