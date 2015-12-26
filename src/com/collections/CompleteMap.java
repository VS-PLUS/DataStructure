package com.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CompleteMap {
	public static void main(String args[]) {
		Map<String, String> map = new LinkedHashMap<String, String>();

		// key,value pair stored in map
		map.put("one", "Java");
		map.put("two", "Oracle");
		map.put("three", "JPA");

		// get() will return the value corresponding to key
		Object valueOne = map.get("one");
		System.out.println("Value for key one is :   " + valueOne);

		/*
		 * remove()- will return the object value corresponding to the key which
		 * we want to remove and also remove the key,pair from map
		 */
		System.out.println("Elements before removing  : " + map);
		System.out.println("Removed value corresponding to key three is : "
				+ map.remove("three"));
		System.out.println("Elements after removing  : " + map);

		/*
		 * containsKey() will check that particular key is present in map or not
		 * and it returns a boolean result
		 */
		if (map.containsKey("one")) {
			System.out.println("One is present in map as key");
		} else {
			System.out.println("One is not present in the map as key");
		}

		/*
		 * containsValue() will check that particular value is present in map or
		 * not and it returns a boolean result
		 */
		if (map.containsValue("Java")) {
			System.out.println("Java is present in map as value");
		} else {
			System.out.println("Java is not present in map as value");
		}

		// isEmpty() will check whether the map is empty or not
		if (map.isEmpty()) {
			System.out.println("Given map is an empty map");
		} else {
			System.out.println("Given map is not an empty map");
		}

		// size() will give the no of key,value pairs in the given map
		System.out.println("No of key,value pairs in map : " + map.size());

		/*
		 * Map does not extends Collection interface so we can not iterate over
		 * map.To iterate over map one has to convert map to a set using
		 * keySet() method,which will give the set of all the key values of map
		 */
		

		// key,value pair stored in map
		Map<String, String> map1 = new LinkedHashMap<String, String>();
		
		map1.put("one", "Java");
		map1.put("two", "Oracle");
		map1.put("three", "JPA");
		
		
		
		Set<String> set = map.keySet();	
		Iterator<String> it = set.iterator();
		System.out.println("All the key values using keySet()of map are :");
		while (it.hasNext()) {
			System.out.println("\t" + it.next());
		}
		// Removes from the underlying map the last element returned by the
		// iterator
		it.remove();
		System.out.println("Map after calling iterator remove() method : "
				+ map);
		// Like the above values() will return collection of values
		Collection<String> valueCollection = map.values();
		it = valueCollection.iterator();
		System.out.println("All the  values using values()of map are :");
		while (it.hasNext()) {
			System.out.println("\t" + it.next());
		}

		// clear() method will empty out the map
		map.clear();
		// Check the size of the map
		int size = map.size();
		System.out.println("After clearing the map..");
		if (size == 0) {
			System.out.println("\tmap is empty now");
		} else {
			System.out.println("\tmap is not empty");
		}
	}
}