package com.queue;


public class PriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.util.PriorityQueue<Integer> p=new java.util.PriorityQueue<Integer>();
		for(int i=10;i>0;i--)
		{
			p.add(new Integer(i));
		}
		for(int i=0;i<10;i++)
		{
			System.out.println(p.poll());
		}
		
		
	}

}
