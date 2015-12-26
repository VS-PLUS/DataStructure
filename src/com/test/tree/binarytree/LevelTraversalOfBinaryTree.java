package com.test.tree.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;

public class LevelTraversalOfBinaryTree {

	public ArrayList<LinkedList<Node>> levelTraversalUsingBFS(Node root) {
		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		LinkedList<Node> elementOfResultList = new LinkedList<Node>();//its similar to queue creation
		LinkedList<Node> temp;

		elementOfResultList.add(root);

		while (elementOfResultList.size() > 0) {
			result.add(elementOfResultList);
			temp = elementOfResultList;
			elementOfResultList = new LinkedList<Node>();
			for (Node node : temp) {
				if (node.leftNode != null) {
					elementOfResultList.add(node.leftNode);
				}

				if (node.rightNode != null) {
					elementOfResultList.add(node.rightNode);
				}
			}

		}
		
		return result;
	}

	public ArrayList<LinkedList<Node>> levelTraversalUsingDFS(Node root)
	{
		ArrayList<LinkedList<Node>> result = new ArrayList<LinkedList<Node>>();
		
		levelTraversalUsingDFS(root, result, 0 );
		
		return result;
	}
	
	private void levelTraversalUsingDFS(Node node, ArrayList<LinkedList<Node>> result, int level) {
		
		LinkedList<Node> elementOfResultList; 
		if(node==null)
		{
			return; 
		}
		
		if(result.size()==level)// means that level is not present in the list
		{
			elementOfResultList=new LinkedList<Node>();
			result.add(elementOfResultList);
		}
		else
		{
			elementOfResultList=result.get(level);
		}
		elementOfResultList.add(node);
		
		levelTraversalUsingDFS(node.leftNode, result, level+1);
		levelTraversalUsingDFS(node.rightNode, result, level+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
