package com.test.tree.binarytree;



public class Node1 {
	int data;
	Node1 leftNode;
	Node1 rightNode;
	
	
	int leafNodeCount = 0;

	public Node1(int data) {
		this.leftNode = null;
		this.rightNode = null;
		this.data = data;

	}
	
	

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node1 getLeftNode() {
		return leftNode;
	}

	public void setLeftNode(Node1 leftNode) {
		this.leftNode = leftNode;
	}

	public Node1 getRightNode() {
		return rightNode;
	}

	public void setRightNode(Node1 rightNode) {
		this.rightNode = rightNode;
	}
	public void countLeafNode(Node1 node) {
		if (leafNodeCount > 0) {
			leafNodeCount = 0;
		}
		countLeaf(node);
		System.out.println("LeafNodeCount" + leafNodeCount);
	}
	
	public void countLeaf(Node1 node) {
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
		
			if(((Node1) obj).data==this.data)
			{
				return true;
			}
		return false;
	}

	
}
