package listCollectionsInJava;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCollections {

	public static void main(String[] args) {
		
		/*
		 *  LinkedList works with Node, Node is a class, so every time that i want to add
		 *  something the linkedList it makes an object of Node and copy it there.
		 *  
		 *  Node has two parts : 
		 *  1) data part 
		 *  2) the reference to other Node
		 *  this makes chain of data
		 *  
		 *  Linked list is not going to make array to store data, it makes object of Node
		 *  and store the data inside of it with its reference to the next Node
		 */
		
		/*
		 * we have two types of LinkeList:
		 * 1) Singly LinkedList => Nodes only know who is the next Node
		 * 2) Doubly LinkedList => Every Node knows who is previous and next Node is
		 * if we don't have any node before or after so they are null
		 * here we have java doubly LinkedList ( two ways road )
		 */

		/*
		 * the Node is not gauratnee in the same contiguous block of memory
		 * LinkedList is not good with data retrieving 
		 * 
		 * LinkedList is not good for retrieve or search because you need to move a lot
		 *  from front or end to get to that data
		 *  
		 *  LinkedList is good and faster with addition large number
		 *  in ArrayList we have to add a larger Array after while for addition but
		 *  in LinkedList we make a new object of data and then we add our data, and node is 
		 *  unlimited.
		 *  
		 *  LinkedList is good for deleting and modification because we just change the 
		 *  reference of each Node and connect it to the other Node, but in ArrayList we have
		 *  to shift all other indexes to fill the gap
		 *  
		 *   linkedList is better when you work with large set of data
		 *   ArrayList is better when you work with small set of data
		 *   
		 *    block chain is based on LinkedList
		 * 
		 */
		
		
		LinkedList<String> li = new LinkedList<String> ();
		
		li.add("value 1");
		li.add("value 2");
		li.add("value 3");
		li.add("value 4");
		li.add("value 5");
		
		System.out.println(li);
		
		//List<Integer> li2 = new LinkedList<Integer>();
		
		// using foorloop
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		
		// using each loop
		for(String s : li) {
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
