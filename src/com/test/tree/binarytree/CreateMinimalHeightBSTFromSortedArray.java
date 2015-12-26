package com.test.tree.binarytree;

public class CreateMinimalHeightBSTFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private Node1 createMinimalHeightBST(int[] arr,int start,int end)
	{
		if(end<start){
			return null;
		}
		
		int mid=start+end/2;
		Node1 node=new Node1(arr[mid]);
		node.leftNode=createMinimalHeightBST(arr, start, mid-1);
		node.rightNode=createMinimalHeightBST(arr, mid+1, end);
		return node;
	}

}
