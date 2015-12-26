package com.test.tree.binarytree;

import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of ");
		int[] temp = { 5, 4, 4, 2, 2, 8 };
		Test t = new Test();
		t.cut(temp);
		int[] temp2 = { 1, 2, 3, 4, 3, 3, 2, 1 };
		System.out.println("===========================");
	
		t.cut(temp2);
	}

	public void cut(int lengths[]) {
		int[] temp = lengths;
		Arrays.sort(temp);
		int count = 0;
		int counter = 0;
		int local = 0;
		while (counter != temp.length) {
			int min = temp[counter];
			for (int i = counter; i < temp.length; i++) {
				// if (temp[i] > 0) {
				temp[i] = temp[i] - min;
				if (temp[i] == 0) {
					local++;
				}
				count++;
				// }
			}
			System.out.println(count);
			count = 0;
			counter = local;
		}
	}

}
