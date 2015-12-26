package com.test.tree.binarytree;

import java.util.Scanner;

public class BinaryTreeCreate {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out
				.println("Enter charaters to be inserted in tree without space");
		String characterSequence = sc.next();
		char[] nodeValues = characterSequence.toCharArray();
		BinaryTree bt = new BinaryTree();
		for (char c : nodeValues) {
			bt.insert(c);
		}
		System.out.println("Preorder Traversal of Tree : ");
		bt.preOrderTraversal();
		System.out.println("\n Inorder Traversal of Tree : ");
		bt.inOrderTraversal();
		System.out.println("\n Postorder Traversal of Tree : ");
		bt.postOrderTraversal();
		bt.countLeafNode();
		bt.getTreeHeight();
		System.out.println("Is the tree balanced "
				+ BinaryTree.isBalancedTress(bt.getRoot()));
		Node root = new Node('a');
		root.leftNode = new Node('b');
		root.rightNode = new Node('c');
		root.leftNode.leftNode = new Node('d');
		root.leftNode.rightNode = new Node('e');
		root.leftNode.leftNode.leftNode=new Node('f');
		root.leftNode.leftNode.rightNode=new Node('g');
		root.countLeafNode(root);
		System.out.println(" leafNodeCount =" + root.leafNodeCount);
		root.countLeafNode(root);
		System.out.println(" leafNodeCount =" + root.leafNodeCount);
		BinaryTree.getHeightIteratively(root);
		System.out.println("Is the tree balanced "
				+ BinaryTree.isBalancedTress(root));
		System.out.println("Diameter of tree "
				+ BinaryTree.getDiameter(root));
		
	}

}
