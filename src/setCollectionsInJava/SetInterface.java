package setCollectionsInJava;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		
		/*
		 * Set: all takes unique values, it is not going to accept duplicate values
		 * 
		 * Types of set:
		 * 1) HashSet  2) linkedHashSet   3) TreeSet
		 * 
		 * HashSet works by HashTable => it has a good complexity O(n)=> constant 
		 * LinkedHashSet => it has a good complexity  O(n)=> constant
		 * TreeSet =>  good complexity  O(log(n)) => sorted =>
		 */
		
		/*
		 * O (1)=> means Constant Time
		 * (n) => means Growth of input
		 */
		
		/*
		 * We don't Set for big data
		 * we use Set mostly when we want unique value
		 * 
		 * the main difference between them is=> 
		 * 
		 * HashSet is un-ordered => it doesn't store the data based on the order you entered in
		 * LinkedHashSet is ordered => it stores the data based on the order you entered in.
		 * exp: data entery: 1, 7, 5;
		 *          HashSet: 5, 1, 7 => unordered
		 *    linkedHashSet: 1, 7, 5 => ordered
		 * Tree Set=> is ordered => smaller number first then increase
		 * exp: data entery: 1, 7, 5;
		 *       TreeSet   : 1, 5, 7; ordered based on smaller to bigger
		 */
		
		/*
		 * All Sets don't accept duplicate value
		 */
		
		// HashSet =>  No duplicate allows, un-ordered
		
		Set<String > s = new HashSet<String> (); 
		
		s.add("test1");
		s.add("test2");
		s.add("test3");
		s.add("test1");
		
		System.out.println(s);
		System.out.println("----------------------------------------");
		
		
		// LinkedHashSet => No duplicate is allowed , and it is ordered base
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		
		ls.add("test1");
		ls.add("test3");
		ls.add("test2");
		ls.add("test1");
		
		System.out.println(ls);
		System.out.println("-----------------------------------------");
		
		
		// TreeSet => No duplicates allowed, it should be stored in Ascending 
		
		TreeSet<String> ts = new TreeSet<String> ();
		
		ts.add("test3");
		ts.add("test2");
		ts.add("test1");
		ts.add("test3");
		
		System.out.println(ts);

	}

}
