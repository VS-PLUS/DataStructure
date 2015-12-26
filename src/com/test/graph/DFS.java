package com.test.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.test.graph.BFS.State;

public class DFS {

	/*
	 * public enum State { unvisited, visited, visiting; }
	 */

	public static void DfsImplementation(Graph graph, Node start) {

		Node[] vertices = graph.getVertices();

		for (Node node : vertices) {
			System.out.println("node data=" + node.data);
			node.state = State.unvisited;
		}
		start.state = State.visiting;

		Stack<Node> stack = new Stack<Node>();
		Node n;
		stack.push(start);
		while (!stack.isEmpty()) {
			n = stack.pop();
			System.out.print(" " + n.data + " ");
			if (n != null) {
				n.state = State.visited;
				LinkedList<Node> adjcNodes = graph.getAdjacentNodes(n);
				for (Node node : adjcNodes) {
					if (node.state == State.unvisited) {
						stack.push(node);
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
		// Node n5 = new Node(5);
		// Node n6 = new Node(6);

		Node[] listOfVertices = { n0, n1, n2, n3 };
		Graph graph = new Graph(listOfVertices);
		graph.addEdge(n0, n1);
		graph.addEdge(n0, n2);
		graph.addEdge(n1, n2);
		graph.addEdge(n2, n3);
		graph.addEdge(n2, n0);
		graph.addEdge(n3, n3);

		DFS.DfsImplementation(graph, n2);

		Node n11 = new Node(1);
		Node n22 = new Node(2);
		Node n33 = new Node(3);
		Node n44 = new Node(4);
		Node n55 = new Node(5);
		Node f = new Node(6);

		Node[] listOfVertices1 = { n11, n22, n33, n44, n55 };
		Graph graph1 = new Graph(listOfVertices1);
		graph1.addEdge(n11, n22);
		graph1.addEdge(n11, n33);
		graph1.addEdge(n22, n44);
		graph1.addEdge(n22, n55);
		//graph1.addEdge(d, e);
		//graph1.addEdge(e, f);
		DFS.DfsImplementation(graph1, n22);

	}

}
