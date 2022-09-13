package MapCollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapCollectionsInJava {

	public static void main(String[] args) {
		
		/*
		 * Map: generally is not inheriting from collection interface, it is separate family on
		 * itself, it is useful.
		 * 
		 * Map Structure:
		 * Map is based on Key and value which is mapping together.
		 * keys are using Set, 
		 * we have HashMap, TreeMap and ...
		 */
		
		/*
		 * we need to define data type for our keys and values in Map
		 * 
		 * how you can create a Map:
		 * HashMap <String> hs = new HashMap<String> ();
		 * 
		 * the keys are always unique in the Map but value is not
		 * 
		 */
		
		/*
		 * HashTable: is synchronized collections means it is a thread safe,
		 * it doesn't accept null value as its key or value
		 * No Null for key and value
		 * it is un-ordered
		 */
		System.out.println("Hashtable-----------------------------------");
		
Hashtable<Integer, String> ht = new Hashtable<Integer, String> ();	
		
		ht.put(1, "value 1"); // mehthod put is used to add in the Map
		ht.put(2, "value 2");
		ht.put(3, "value 3");
		ht.put(1, "value 1 - 2");
	//	ht.put(null, null);// it is going to give you null exception
		System.out.println(ht); // key is not duplicated so the second same key takes the first 
		//-one place.
		
		
		System.out.println("HashMap-----------------------------------------");
		
		/*
		 * HashMap: is using Node class, it makes object for each Node, it is using array of 
		 * Node to store values. it has key and value which works based on them
		 * it looks like ArrayList
		 * HashMap is non synchronized / it is not thread safe
		 * it can take Null value
		 * it is un-ordered
		 * it is using Array of Node
		 */
		
		HashMap<String, String> hm = new HashMap<String, String> ();
		
		hm.put("K1", "V1");
		hm.put("K22", "V2");
		hm.put("K3", "V3");
		hm.put("K5", "V4");
		hm.put("K1", "V5");
		hm.put(null, null);
		System.out.println(hm); // the key K1 is written only once, and it is overridden 
		
		
		System.out.println("Linked HasMap ---------------------------------------");
		
		/*
		 * LinkedHashMap: is using doubly LinkList structure in the back. it also use 
		 * Node class to generate keys and values
		 * linkedHashMap is ordered structure.
		 * it can take Null
		 * it is non synchronized
		 * it is ordered- it will store elements based on the order of the entry
		 * it is backed by dobubly linked list structure of Nodes
		 */
		
		LinkedHashMap<String, String> lhm =new LinkedHashMap<String, String> ();
		lhm.put(null, null);
		lhm.put("1", "v1");
		lhm.put("2", "v2");
		lhm.put("5", "v5");
		lhm.put("3", "v3");
		lhm.put("4", "v4");
		
		System.out.println(lhm); // it is ordered
		
		

		System.out.println("TreeMap -------------------------------------------");
		
		
		/* 
		 * TreeMap is only sorted TreeMap that it is also using Node class. the values will be
		 * sorted in the memory 
		 * treeMap is sorted structure. it is going to sort it by the keys
		 * it is sorted ASC badly, on the keys on descending 
		 * it is non synchronize
		 * no Null value is allowed 
		 * it is sorted based on the keys of the Map
		 * 
		 */
		
		TreeMap<String, String> tm = new TreeMap<String, String> ();
		
		tm.put("4", "v4");
		tm.put("1", "v1");
		tm.put("2", "v2");
		tm.put("5", "v5");
		tm.put("3", "v3");
		tm.put("4", "v4 - 2");
		
		System.out.println(tm);
		
		
		
		
		
	}

}
