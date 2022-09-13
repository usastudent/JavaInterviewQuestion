package javainterview.question;

public class FindTestCaseInTwoDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 * In the following 2D array, print the tests that failed.
		 * find test case status in a two-d array
		 */

		String [][] testStatus= {{"tc001","failed"},{"tc002","failed"},{"tc003","passed"}};
		
		for (int i = 0; i < testStatus.length; i++) {
			if(testStatus[i][1].equals("failed")) {
				System.out.println(testStatus[i][0]+" "+testStatus[i][1]);
			}
			
		}
		
	}

}
