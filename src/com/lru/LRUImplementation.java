package com.lru;

public class LRUImplementation {

	public static void main(String args[]) {
		LRUCache cache = new LRUCache(4);
		cache.cacheNode(1, 1);
		cache.cacheNode(2, 2);
		cache.cacheNode(3, 3);
		cache.print();
		cache.cacheNode(4, 4);
		cache.print();
		cache.get(1);
		cache.cacheNode(5, 5);
		cache.print();
	}

}
