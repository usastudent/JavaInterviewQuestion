package javainterview.question;

public class CombinationOfThreeNumbersInRagne {

	public static void main(String[] args) {
		// write a function that print all the 3 digits with combination on of number between
		// 1 to 5
		//1 , 1, 1
		//1 ,1 , 2
		//5 ,5 ,5

		printNums(1, 5);
		
	}

	public static void printNums(int start, int end) {
		int x =0;
		for(int i = start; i<= end; i++) {
			for (int j =start; j<= end; j++) {
				for(int n = start; n<= end; n++) {
					System.out.println(i+","+j+","+n);
					x++;
				}
				
			}
			
		}
		System.out.println(x);
	}
	


	
}
