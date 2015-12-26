package com.test.tree.binarytree;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {
	public void calculateNthTerm(BigDecimal firstTerm, BigDecimal secondTerm,
			long nthTerm) {
		int term = 3;
		while (term <= nthTerm) {
			BigDecimal thirdTerm = calculateNumber(firstTerm, secondTerm);
			firstTerm = secondTerm;
			secondTerm = thirdTerm;
			term++;
		}
		//System.out.println("Nth Term " + nthTerm + " = " + secondTerm);
		System.out.println(secondTerm);
	}

	public BigDecimal calculateNumber(BigDecimal firstTerm,
			BigDecimal secondTerm) {

		return (secondTerm.multiply(secondTerm)).add(firstTerm);

	}

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Values :");
		String[] test = sc.nextLine().split(" ");
		Solution sol = new Solution();
		//System.out.println(test.length);
		sol.calculateNthTerm(BigDecimal.valueOf(Long.parseLong(test[0])),
				BigDecimal.valueOf(Long.parseLong(test[1])),
				Integer.parseInt(test[2]));

	}

}
