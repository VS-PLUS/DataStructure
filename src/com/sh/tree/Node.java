package com.sh.tree;

public class Node {

	Node leftNode;
	
	Node rightNode;
	int value;
	public Node(Node left, Node right, int data)
	{
		leftNode=left;
		rightNode=right;
		value=data;
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
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	public static void inOrderTraversal(Node root)
	{
		if(root==null)
		{
			//System.out.println("tree empty");
			return;
		}
		 inOrderTraversal(root.getLeftNode());
		 System.out.println("Inorder Traversal"+root.value);
		 inOrderTraversal(root.getRightNode());
	}
	public static void preOrdeTraversal(Node root)
	{
		if(root==null)
		{
			return;
		}
		System.out.println("preOrdeTraversal"+root.value);
		preOrdeTraversal(root.getLeftNode());
		 preOrdeTraversal(root.getRightNode());
	}
	public static void postOrdeTraversal(Node root)
	{
		if(root==null)
		{
			return;
		}
		postOrdeTraversal(root.getLeftNode());
		postOrdeTraversal(root.getRightNode());
		 System.out.println("postOrdeTraversal"+root.value);
	}
}
