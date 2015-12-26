package com.test.tree.binarytree;

public class Node {
	char data;
	Node leftNode;
	Node rightNode;
	
	int leafNodeCount = 0;

	public Node(char data) {
		this.leftNode = null;
		this.rightNode = null;
		this.data = data;
	}
	
	

	public char getData() {
		return data;
	}

	public void setData(char data) {
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

}
