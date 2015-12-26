package com.test.graph;

import com.test.graph.BFS.State;

public class Node {
	int data;
	Node leftNode;
	Node rightNode;
	State state;
	
	int leafNodeCount = 0;

	public Node(int data) {
		this.leftNode = null;
		this.rightNode = null;
		this.data = data;
		this.state=null;
	}
	
	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node leftNode) {
		this.leftNode = leftNode;
	}

	public Node getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node rightNode) {
		this.rightNode = rightNode;
	}
	public void countLeafNode(Node node) {
		if (leafNodeCount > 0) {
			leafNodeCount = 0;
		}
		countLeaf(node);
		System.out.println("LeafNodeCount" + leafNodeCount);
	}
	
	public void countLeaf(Node node) {
		if (node != null) {
			if (node.leftNode == null && node.rightNode == null) {
				leafNodeCount = leafNodeCount + 1;
			} else {
				countLeaf(node.leftNode);
				countLeaf(node.rightNode);
			}
		}
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}



	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
			if(((Node) obj).data==this.data)
			{
				return true;
			}
		return false;
	}

	
}
