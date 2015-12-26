package com.test.graph;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;



public class Graph {
	
	/*private int noOfVertices; */
	
	private Node vertices[];
	
	//private LinkedList<Node> adjacencyListArr[];
	
	private HashMap<Node,LinkedList<Node>> adjacencyList=new HashMap<Node, LinkedList<Node>>();
	
	public Graph(Node[] listOfVertices){
		for (Node node : listOfVertices) {
			adjacencyList.put(node, new LinkedList<Node>());
		}
	}
	
	
	public Node[] getVertices()
	{  
		
		Node[] nodeArr=new Node[adjacencyList.size()];
		Set<Entry<Node, LinkedList<Node>>> adjacencySet=adjacencyList.entrySet();
		//Iterator<Entry<Node, LinkedList<Node>>> iter=adjacencySet.iterator();
		int i=0;
		for (Entry<Node, LinkedList<Node>> entry : adjacencySet) {
			nodeArr[i]=entry.getKey();
			i++;
		}
		return nodeArr;
	}
	/*public Graph(int noofVertices)
	{
		this.noOfVertices=noofVertices;
		this.adjacencyListArr=new LinkedList[noOfVertices];
		
		for (int i = 0; i < noofVertices; i++) {
			adjacencyListArr[i]=new LinkedList<Node>();
		}
		
	}
	*/
	
	public void addEdge(Node v, Node w)
	{
		adjacencyList.get(v).add(w);
	}
	
	public LinkedList<Node> getAdjacentNodes(Node n)
	{ 
		return adjacencyList.get(n);
	}

}
