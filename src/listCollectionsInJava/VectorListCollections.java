package listCollectionsInJava;

import java.util.Vector;

public class VectorListCollections {

	public static void main(String[] args) {
		
		/*
		 * Vector is subclass of List interface
		 * it is similar to ArrayList but they have differences:
		 * 1) when you increase the size of your ArralyList capacity it is bout 50% increase
		 * but in Vector when you increase the size of your list it increase the size by 
		 * 100% of previous one exp: old one size is: 10 => the new one size is: 20
		 * 
		 * 2)
		 * Vector is synchronize or thread safe but ArrayList isn't synchronize or thread safe
		 * 
		 * What is thread:
		 * when you need any sort of calculation it works like your program send calculation
		 * to your computer and computer will solve it and send it back to your program
		 * this channel which is using for connection the program to your computer is called
		 * thread, in java we can have multi thread is as well, so thread is like a connection
		 * way
		 * 
		 * synchronization: 
		 * means you are merging all threads to one thread and then putting all the things 
		 * in order (in a line) like single thread
		 * 
		 * thread safe means synchronized, means all the threads merge in one thread so we
		 * don't face with challenges which happens if all threads try to do some thing in a
		 * same time
		 * 
		 * Vector is a safe thread, is a synchronized collection
		 * 
		 * In general when we have collection and we try to access data from it, we want to 
		 * access data faster at the same time so we wouldn't synchronized
		 * but if you want to change data and access data it make sense to synchronize it 
		 * to prevent issues
		 * 
		 * Vector is synchronized and ArrayList is not synchronized so ArrayLIst is faster
		 * and Vector is slower and the other difference is the way that they increase their
		 * size , ArrayList increases about 50 percent capacity every time but Vecotr 
		 * increases about 100%
		 *  
		 * ArrayList is more popular
		 *  
		 */

		Vector<String> vec = new Vector<String>();
		
		int x =1;
		vec.add("test"+x++);
		vec.add("test"+x++);
		vec.add("test"+x++);
		vec.add("test"+x++);
		vec.add("test"+x++);
		vec.add("test"+x++);
		vec.add("test"+x++);
		vec.add("test"+x++);
		vec.add("test"+x++);
		vec.add("test"+x++);
		vec.add("test"+x++);
		
		System.out.println(vec);
		System.out.println(vec.capacity());// capacity start from 10 and after that it is 
		// doubling the size each time
		
		
		
		
		
		
	}

}
