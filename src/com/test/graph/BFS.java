package com.test.graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public enum State {
		unvisited, visited, visiting;
	}

	public static void bfsImplementation(Graph graph, Node start) {

		Node[] vertices = graph.getVertices();

		for (Node node : vertices) {
			System.out.println("node data="+node.data);
			node.state = State.unvisited;
		}
		start.state = State.visiting;

		Queue<Node> queue = new LinkedList<Node>();
		Node n;
		queue.add(start);
		while (!queue.isEmpty()) {
			n = queue.poll();
			System.out.print(" " + n.data + " ");
			if (n != null) {
				n.state = State.visited;
				LinkedList<Node> adjcNodes = graph.getAdjacentNodes(n);
				for (Node node : adjcNodes) {
					if (node.state == State.unvisited) {
						queue.add(node);
					}
				}
			}

		}

	}

	public static void main(String args[]) {

		Node n0 = new Node(0);
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		//Node n5 = new Node(5);
		//Node n6 = new Node(6);

		Node[] listOfVertices = { n0, n1, n2, n3 };
		Graph graph = new Graph(listOfVertices);
		graph.addEdge(n0, n1);
		graph.addEdge(n0, n2);
		graph.addEdge(n1, n2);
		graph.addEdge(n2, n3);
		graph.addEdge(n2, n0);
		graph.addEdge(n3, n3);
		
		BFS.bfsImplementation(graph, n2);
	}

}
