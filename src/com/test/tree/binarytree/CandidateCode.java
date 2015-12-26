package com.test.tree.binarytree;

public class CandidateCode {

	public static long fibonicci(long n) {
				if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonicci(n - 1) + fibonicci(n - 2);
		}
	}

	public static int calculate_sum(int input1, int input2) {
		long sum = 0;
		if (input2 < input1) {
			return -1;
		} else {
			while (input1 <= input2) {
				sum = sum + fibonicci(input1);
				input1++;
			}

		}
		System.out.println("Sum" + sum);
		int result = (int) sum % 1000000007;
		return result;
	}

	public static void main(String args[]) {
		System.out.println(CandidateCode.calculate_sum(0, 3));
		System.out.println(CandidateCode.calculate_sum(10, 19));
	}
}