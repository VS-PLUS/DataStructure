package com.test.tree.binarytree;

import java.util.Scanner;

public class BinarySearchTree {

	Node root;

	public void createBinarySearchTree(char data) {
		createBST(data, root);
	}

	public static void createBST(char data, Node node) {
		if (node == null) {
			node = new Node(data);
			return;
		} else {
			if (data <= node.data) {
				createBST(data, node.leftNode);
			} else {
				createBST(data, node.rightNode);
			}
		}
	}

	public static boolean checkBST(Node node, Character maxLeft,
			Character minRight) {
		if (node == null) {
			return true;
		}
		if ((maxLeft != null && node.data <= maxLeft)
				|| (minRight != null && node.data > minRight)) {
			return true;
		}
		if (checkBST(node.leftNode, node.data, minRight)
				&& checkBST(node.rightNode, maxLeft, node.data)) {
			return false;
		}
		return true;
	}

	public static void main(String args[])

	{
		Character test='C';
		char test1='D';
		System.out.println(test>test1);
		System.out.println(test1>test);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elemnts for BST without space and comma");
		String input = sc.next();
		char[] inputArray = input.toCharArray();
		BinarySearchTree BST = new BinarySearchTree();
		for (char c : inputArray) {
			BST.createBinarySearchTree(c);
		}
		System.out.println("Binary tree created");

		Node nonBST = new Node('a');
		nonBST.leftNode = new Node('z');
		/*nonBST.rightNode = new Node('l');
		nonBST.leftNode.leftNode = new Node('d');
		nonBST.leftNode.rightNode = new Node('e');
		nonBST.leftNode.leftNode.leftNode = new Node('f');
		nonBST.leftNode.leftNode.rightNode = new Node('g');*/

		System.out.println("nonBST: is it BST? = "
				+ checkBST(nonBST, null, null));
		/*System.out.println("root: is it BST? = "
				+ checkBST(BST.root, null, null));*/
	}

}
