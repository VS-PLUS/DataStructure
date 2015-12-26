package com.test.tree.binarytree;

import java.util.Arrays;

public class KaedenAlgo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[]={1,2,-7,9,-6,8};
      int a1[]={2,3,4,-10,10,12};
      contigousubArray(a);
      contigousubArray(a1);
	}

	private static void contigousubArray(int[] a) {
		// TODO Auto-generated method stub
		
		int temp=a[0];
		int max=a[0];
		int start=0;
		int end=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max && temp+a[i]<=a[i])
			{
				start=i;
				end=i;
				temp=a[i];
			}
			else{
				temp=temp+a[i];
				
			}
			//a[]={ 1, 2,3,-6,4,5}
			if(temp>max)
			{
				max=temp;
				end=i;
			}
		}
		
		System.out.println(Arrays.toString(Arrays.copyOfRange(a, start, end+1)));
		
	}

}
