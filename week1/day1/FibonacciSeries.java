package week1.day1;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range = 8;
		int sum1 = 0;
		int sum2 = 1;
		int sum3;
		System.out.println("FIBONACCI SERIES are : ");
		System.out.print(sum1);
		for (int i = 0; i < range; i++) {
			//NOTE HOW TO SWAP FOR FIBONACCI SERIES
			sum3 = sum1 + sum2;			
			sum1 = sum2;
			sum2 = sum3;
			System.out.print(sum3);

		}
	}

}
