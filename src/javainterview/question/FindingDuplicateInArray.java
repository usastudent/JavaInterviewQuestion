package javainterview.question;

public class FindingDuplicateInArray {

	public static void main(String[] args) {
		
		/*
		 *  finding duplicate array by nested loop (shifiting):
		 *  we use two for loops , in our first or outer loop we start the index from 0
		 *  and for the second loop or inner loop we have to start it from index 1
		 *  
		 *  finding duplicates by the nest loop it is not a very good idea because
		 *  it has complexity of  O(n^2)
		 *  n means number of iteration you do. right now we are running 6*6= 36 times the 
		 *  string data.
		 */
		String [] data = {"test", "take", "nice", "pass", "test", "nice"};
		System.out.println("Method 1");
		printDuplicateInArray(data);
		
	}
		// another way
		public static void printDuplicateInArray(String [] data) {
			out:for (int i = 0; i < data.length; i++) {
				in:for (int j = i+1; j<data.length; j++) {
					if (data[i].equals(data[j])) {
						System.out.println("Duplicate value found: "+data[i]+" on indexes "+i+" and "+j);
					//	break out; // if we want to get out the loop we use this break out
						// break => it means on the first duplicate exist
					}
						
				}
			
				
				
			}			
						
					
	}

}
