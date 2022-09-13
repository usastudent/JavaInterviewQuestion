package javainterview.question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingLargestSmallestSumAndAveragePart2 {

	public static void main(String[] args) {
		int [] nums = {1, 121, 321, 5, 11, 5, 12, 15, 1, 21, 5, 21, 113, 5, 111, 2, 1};
		
	//	System.out.println("the smallest: " + findSmallestValueWithPosition(nums, 2));
	//	System.out.println("the largest: " + findLargestValueWithPosition(nums, 2));
		System.out.println(findLargestAndSmallestValueWithPosition(nums, 1, true));
		// if i pass true it means I am looking for largest number and
		//- if i pass false it means I am looking for the smallest number.
	}

	// Set is accepting only unique number so we add nums to to the Set by for loop
	// and then we need to convert Set to List because Set is un-ordered but in List we
	//- can sort it 
	// nums = the input numbers  //// Position is starting from 1, largest=1, secondlargest=2;
	public static int findSmallestValueWithPosition (int [] nums, int position) {
		
		// convert the numbers in the given array to a Set
		Set <Integer> numberSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			numberSet.add(nums[i]);
		}
		
		// you can add collection in collection 
		// so we convert the Set to List
		List<Integer> numbersList = new ArrayList<Integer> (numberSet);
		
		// Sort the list
		
		Collections.sort(numbersList);
		
		// Retrun the number on the given position 
		return numbersList.get(position-1); // index starts from 0
		
		
		
	}
	
	
	// Find the largest value
	
public static int findLargestValueWithPosition (int [] nums, int position) {
		
		// convert the numbers in the given array to a Set
		Set <Integer> numberSet = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			numberSet.add(nums[i]);
		}
		
		// you can add collection in collection 
		// so we convert the Set to List
		List<Integer> numbersList = new ArrayList<Integer> (numberSet);
		
		// Sort the list
		
		Collections.sort(numbersList, Collections.reverseOrder()); // descending sort
		
		// Retrun the number on the given position 
		position -=1; // to count for the fact the input starts from 1, and index numbers start from zero
		if(position > numbersList.size() || position < 0) {
			System.out.println("Invalid Position");
			return -1;
		}else {
			return numbersList.get(position); 
		}
		
		
		
		
	}

	
	//condLaregest = 2 //// direction true = largest, direction false = smallest;
	// we can findout the largest and smallest number by their positions in the Array
	public static int findLargestAndSmallestValueWithPosition (int [] nums, int position, boolean direction) {
	
	// convert the numbers in the given array to a Set
	Set <Integer> numberSet = new HashSet<>();
	for (int i = 0; i < nums.length; i++) {
		numberSet.add(nums[i]);
	}
	
	// you can add collection in collection 
	// so we convert the Set to List
	List<Integer> numbersList = new ArrayList<Integer> (numberSet);
	
	// Sort the list
	if(direction) {
		// we are looking for largest nums
		Collections.sort(numbersList, Collections.reverseOrder()); // descending sort
	}else {
		// we are looking for smallest number
		Collections.sort(numbersList); // Ascending sort
	}
	
	
	// Retrun the number on the given position 
	position -=1; // to count for the fact the input starts from 1, and index numbers start from zero
	if(position > numbersList.size()-1 || position < 0) {
		System.out.println("We have "+numbersList.size()+ " unique numbers in the data provided and position " + (position+1) + " is not valid");
		return -1;
	}else {
		return numbersList.get(position); 
	}
	}
}
