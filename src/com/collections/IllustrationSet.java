package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IllustrationSet {

	public static void doLogicSetPartition(int[] values) {
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> notUnique = new HashSet<Integer>();

		for (int value : values) {

			if (unique.add(value)) {
				System.out.println("Added in unique set");
			} 
			else {
				
				notUnique.add(value);
			}
		}
		
		Iterator itr=notUnique.iterator();
		
		while(itr.hasNext()){
			unique.remove(itr.next());
		}
		
		
		System.out.println("Unique Set" + unique);
		System.out.println("Not Unique Set" + notUnique);
	}

	public static void main(String args[]) {
		int[] values = { 1, 1, 3, 4, 5,4,4,4, 4, 6, 6, 8 };
		IllustrationSet.doLogicSetPartition(values);
	}

}
