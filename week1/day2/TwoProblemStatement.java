package week1.day2;

import java.util.Arrays;

public class TwoProblemStatement {

	public static void main(String[] args) {

				// Two Problem Statement
		System.out.println("TWO PROBLEM STATEMENTS");
		int[] num = { 2, 11, 15, 7, 3, 5, 4,8,1 };
		int target = 9;
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] + num[j] == target) {
					System.out.println(num[i] + "+" + num[j]);
				}

			}

		}

	}

}
