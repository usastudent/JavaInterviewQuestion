package javainterview.question;

public class FindingLargestSmallestSumAndAverage1 {

	public static void main(String[] args) {
		
		/*
		 * max, min, sum, average, find the second largest or second smallest
		 */

		int [] nums = {1, 121, 321, 5, 11, 5, 12, 15, 1, 21, 5, 21, 113, 5, 111, 2, 1};
		System.out.println("Largest: " + findLargestValue(nums));
		System.out.println("Smallest: "+ findSmalletValue(nums));
		System.out.println("Sum: "+ getSumOfValues(nums));
		System.out.println("Average: "+ getAverageOfValues(nums));
		System.out.println("Second Largest: "+ findSecondlargestValue(nums));
		System.out.println("Second smallest value: "+ findSecondSmallestValue(nums));
	}

	// largest Number
	public static int findLargestValue (int [] nums) {
		
		int largest = nums[0]; // we put index of 0 as temporary largest, 
		
		for(int i = 0; i < nums.length; i++) {
			if ( largest <nums[i]) {
				largest = nums[i];
			}
		}
		
		
		return largest;
	}
	
	// smallest value in Array
	public static int findSmalletValue (int[] nums) {
		
		int smallest = nums [0]; // starts from index 0
		for (int i = 0; i < nums.length; i++) {
			if(smallest > nums [i]) {
				smallest = nums[i];
			}
		}
		return smallest;
	}
	
	
	//sum 
	
	public static int getSumOfValues (int[] nums) {
		
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum+= nums[i];
		}
		
		
		return sum;
		
		
	}
	
	// Average:
	
	public static double getAverageOfValues (int [] nums) {
		return (double) getSumOfValues(nums) / nums.length;
	}
	
	// find the second largest number 
	// you need to find the largest value then you need to find out the numbers i
	// which is the largest number and at the same time it is smaller than the largest one.
	
	public static int findSecondlargestValue (int[] nums) {
		 int secondLargest = nums [0];
		 int largest = findLargestValue(nums);
		 
		 for (int i = 0; i < nums.length; i++) {
			if(nums[i] > secondLargest && nums[i] < largest) {
				secondLargest = nums [i];
			}
		}
		 
		
		 
		 return secondLargest;
	}
	
	
	// Finding the second smallest value
	
	public static int findSecondSmallestValue ( int [] nums) {
		
		int smallest= findSmalletValue(nums);
	//	int secondSmallest = nums[0]; //// here only happens because the first index is 1
		// and the condition is not going to change
		int secondSmallest = Integer.MAX_VALUE; // so we use this method instead of nums [0]
		
		for (int i = 0; i < nums.length; i++) {
			if ( nums[i] < secondSmallest && nums[i] > smallest) {
				secondSmallest = nums [i]; // here only happens because the first index is 1
				// and the condition is not going to change
			}
		}
		
		
		return secondSmallest;
	}
	
	
	
	
}
