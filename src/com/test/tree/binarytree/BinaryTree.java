package com.test.tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	private Node root = null;
	int count = 1;

	public BinaryTree() {
		root = null;
	}

	public void insert(char data) {
		root = insertElement(root, data);
	}

	public Node getRoot() {
		return root;
	}

	private Node insertElement(Node node, char data) {
		if (node == null) {
			node = new Node(data);
		} else {
			if ((count % 2) == 0) {
				node.leftNode = insertElement(node.leftNode, data);
			} else {
				node.rightNode = insertElement(node.rightNode, data);
			}
		}
		return node;
	}

	public void preOrderTraversal() {
		preorder(root);
	}

	private void preorder(Node node) {
		if (node != null) {
			System.out.print(node.data + " ");
			preorder(node.leftNode);
			preorder(node.rightNode);
		}

	}

	public void inOrderTraversal() {
		inorder(root);
	}

	private void inorder(Node node) {
		if (node != null) {
			inorder(node.leftNode);
			System.out.print(node.data + " ");
			inorder(node.rightNode);
		}

	}

	public void postOrderTraversal() {
		postorder(root);
	}

	private void postorder(Node node) {
		if (node != null) {
			postorder(node.leftNode);
			postorder(node.rightNode);
			System.out.print(node.data + " ");

		}

	}

	int leafNodeCount = 0;

	public void countLeafNode() {
		if (leafNodeCount > 0) {
			leafNodeCount = 0;
		}
		countLeaf(root);
		System.out.println("LeafNodeCount" + leafNodeCount);
	}

	private void countLeaf(Node node) {
		if (node != null) {
			if (node.leftNode == null && node.rightNode == null) {
				leafNodeCount = leafNodeCount + 1;
			} else {
				countLeaf(node.leftNode);
				countLeaf(node.rightNode);
			}
		}
	}

	public void getTreeHeight() {
		System.out.println("Height of the tree using IterativeMethod: "
				+ getHeightIteratively(root));
		System.out.println("Height of the tree using RecursiveMethod: "
				+ getHeightRecursiveMethod(root));
	}

	// BFS algo for finding height of tree
	// Non recursive /Iterative function to find height of Tree.
	// The time complexity of this program is O(n)
	public static int getHeightIteratively(Node node) {
		int height = 0;
		int sizeOfQueue = 0;
		if (node == null) {
			return 0;
		}
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(node);
		while (true) {
			sizeOfQueue = queue.size();
			if (sizeOfQueue == 0) {
				return height;
			}
			height++;
			while (sizeOfQueue > 0) {
				Node current = queue.peek();// process the front node without
											// removing it.
				queue.poll();// remove the front node i.i dequeue
				if (current.leftNode != null) {
					queue.add(current.leftNode);
				}
				if (current.rightNode != null) {
					queue.add(current.rightNode);
				}
				sizeOfQueue--;
			}
		}

	}

	// The runtime of this one O(n) as we are visiting each node atleast once
	private static int getHeightRecursiveMethod(Node node) {
		if (node == null) {
			return 0;
		} else {
			return Math.max(getHeightRecursiveMethod(node.leftNode),
					getHeightRecursiveMethod(node.rightNode)) + 1;
		}
	}

	// The runtime of this one O(nlogn)
	public static boolean isBalancedTress(Node node) {
		if (node == null) {
			return true;
		}
		int heightDiff = getHeightRecursiveMethod(node.leftNode)
				- getHeightRecursiveMethod(node.rightNode);
		if (Math.abs(heightDiff) > 1) {
			return false;
		} else {
			return isBalancedTress(node.leftNode)
					&& isBalancedTress(node.rightNode);
		}

	}

	public static int getDiameter(Node node) {
		if (node == null) {
			return 0;
		}
		int leftHeight = getHeightRecursiveMethod(node.leftNode);
		int rightHeight = getHeightRecursiveMethod(node.rightNode);
		int leftDia = getDiameter(node.leftNode);
		int rightDia = getDiameter(node.rightNode);
		return Math.max(leftHeight + rightHeight + 1,
				Math.max(leftDia, rightDia));
	}
}
