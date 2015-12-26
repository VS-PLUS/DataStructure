package com.collections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentHashMapDemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("key 1", "value1");
		map.put("key 2", "value2");
		map.put("key 3", "value3");
		map.put("key 4", "value4");
		map.put("key 5", "value5");
		map.put("key 6", "value6");
		map.put("key 7", "value7");
		map.put("key 8", "value8");
		map.put("key 9", "value9");
		map.put("key 10", "value10");
		map.put("key 11", "value11");
		map.put("key 12", "value12");
		map.put("key 13", "value13");
		map.put("key 14", "value14");
		map.put("key 15", "value15");
		map.put("key 16", "value16");
		/*map.put("key 17", "value7");
		map.put("key 18", "value8");
		map.put("key 19", "value9");
		map.put("key 20", "value10");*/
		System.out.println(map);
		
		
		CopyOnWriteArrayList<String> list=new CopyOnWriteArrayList<String>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		Iterator itr=list.iterator();
		Iterator itr1=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			list.remove("a");
		}
		System.out.println("Test 1"+itr1.next());
		System.out.println("Test");
		itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			//list.remove("d");
		}

	}

}
