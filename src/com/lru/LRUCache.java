package com.lru;

import java.util.HashMap;

public class LRUCache {

	int capacity;
	HashMap<Integer, Node> maps = new HashMap<Integer, Node>();
	Node head = null;
	Node end = null;

	public LRUCache(int capacity) {
		this.capacity = capacity;
	}

	public void cacheNode(int key, int value) {
		if (maps.containsKey(key)) {
			Node old = maps.get(key);
			old.value = value;
			removeNode(old);
			setHead(old);
		} else {
			Node created = new Node(key, value);
			if (maps.size() >= capacity) {
				maps.remove(end.key);
				removeNode(end);
				setHead(created);
			} else {
				setHead(created);
			}
			maps.put(key, created);
		}
	}

	public int get(int key) {
		if (maps.containsKey(key)) {
			Node n = maps.get(key);
			removeNode(n);
			setHead(n);
			return n.value;
		}

		return -1;

	}

	public void removeNode(Node node) {
		if (node.prev != null) {
			node.prev.next = node.next;
		} else {
			head = node.next;
		}

		if (node.next != null) {
			node.prev.next = node.next;
		} else {
			end = node.prev;
		}

	}

	public void setHead(Node node) {
		node.next = head;
		node.prev = null;
		if (head != null) {
			head.prev = node;
		}
		head = node;
		if (end == null) {
			end = head;
		}

	}
	
	public void print(){
		System.out.println(maps);
	}

}
