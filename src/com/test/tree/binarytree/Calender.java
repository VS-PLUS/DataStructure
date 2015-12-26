package com.test.tree.binarytree;

import java.io.*;

public class Calender {

	public static int daysCount(String input1, String input2) {
		int difference=0;
		// DD-MM-YYYY
		if(input1.equals(input2)){
			return difference;
		}
		else{
		String[] startDateInput = input1.split("-");
		String[] endtDateInput = input2.split("-");
		// Start Date
		int startDate = Integer.parseInt(startDateInput[0]);
		int startMonth = Integer.parseInt(startDateInput[1]);
		int startYear = Integer.parseInt(startDateInput[2]);
		// End Date
		int endDate = Integer.parseInt(endtDateInput[0]);
		int endMonth = Integer.parseInt(endtDateInput[1]);
		int endYear = Integer.parseInt(endtDateInput[2]);
		int numberOfLeapYearsTillStartDate = countNumberOfLeapYears(
				startYear, startMonth);
		int numberOfLeapYearsTillEndDate = countNumberOfLeapYears(
				endYear, endMonth);

		difference = (int) (countNumberOfDaysFromInception(
				numberOfLeapYearsTillEndDate, endDate, endMonth, endYear) - countNumberOfDaysFromInception(
				numberOfLeapYearsTillStartDate, startDate, startMonth,
				startYear));
		return difference+1; // To include end date
		}
		

	}

	private static long countNumberOfDaysFromInception(int numLeapYears,
			int date, int month, int year) {
		int[] numberOfDaysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
				30, 31 };
		int numberOfDays = 0;

		for (int i = 0; i < month - 1; i++) {
			numberOfDays = numberOfDays + numberOfDaysInMonth[i];
		}

		long sum = ((365 * year) + date + numberOfDays + numLeapYears);

		return sum;
	}

	private static int countNumberOfLeapYears(int year, int month) {
		if (month <= 2) {
			year = year - 1;
		}
		int numberOfyears = ((year / 4) - (year / 100) + (year / 400));
		return numberOfyears;
	}

	public static void main(String args[]) {
		// 10-06-2012
		// 15-10-2012
		System.out.println(Calender.daysCount("1-01-2015", "31-12-2015"));

	}
}
