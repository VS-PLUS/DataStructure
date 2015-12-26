package com.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class iterateOverMap {

	public static void main(String args[]) {
		// key,value pair stored in map
		Map<String, String> map1 = new LinkedHashMap<String, String>();

		map1.put("one", "Java");
		map1.put("two", "Oracle");
		map1.put("three", "JPA");

		/*
		 * //method 1: Set<Entry<String, String>> test = map1.entrySet(); for
		 * (Entry<String, String> entry : test) {
		 * System.out.println("shipra ..."+entry.getKey() + "::" +
		 * entry.getValue()); }
		 * 
		 * //method 2: Set<Entry<String, String>> test1 = map1.entrySet();
		 * Iterator<Entry<String, String>> setIterator=test1.iterator();
		 * Entry<String, String> entry; while(setIterator.hasNext()) {
		 * entry=setIterator.next();
		 * System.out.println("shipra1 ..."+entry.getValue
		 * ()+" "+entry.getKey()); }
		 * 
		 * //method3 Set<String> keySet=map1.keySet(); Iterator<String>
		 * keySetItr=keySet.iterator();
		 * 
		 * while(keySetItr.hasNext()) { String key=keySetItr.next();
		 * System.out.println(key+"::"+map1.get(key)); } //method4
		 * Collection<String> collection=map1.values(); Iterator<String>
		 * itr1=collection.iterator(); while(itr1.hasNext()){
		 * System.out.println("Iterating Values "+itr1.next()); }
		 */
		// Method 1
		Set<Entry<String, String>> test1 = map1.entrySet();
		Iterator<Entry<String, String>> itr = test1.iterator();
		Entry<String, String> entry;
		while (itr.hasNext()) {
			entry = itr.next();
			System.out.println("Method I : " + entry);
		}

		// Method II

		Set<Entry<String, String>> test2 = map1.entrySet();
		for (Entry<String, String> entry1 : test2) {
			System.out.println("Method II : " + entry1.getKey() + "::"
					+ entry1.getValue());
		}
		
		
		//Method III
		Set<String> keySet=map1.keySet();
		Iterator<String> itr3=keySet.iterator();
		while(itr3.hasNext()){
			String key=itr3.next();
			System.out.println("Method III : "+key+"::"+map1.get(key));
		}
		
		
		
		//Method IV
		Collection<String> collection=map1.values();
		Iterator<String> itr4=collection.iterator();
		
		while(itr4.hasNext()){
			System.out.println("Method IV :"+itr4.next());
		}
		
	}

}
