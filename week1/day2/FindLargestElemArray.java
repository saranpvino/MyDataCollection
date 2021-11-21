package week1.day2;

import java.util.Arrays;

public class FindLargestElemArray {

	public static void main(String[] args) {
		// Below two initialization are true
		// int[] arr = { 100, 49, 398, 34, 1, 267 };//Initialization
		int arr[] = { 100, 49, 398, 34, 1, 267 };// Initialization

		int arrLength = arr.length;// find its length and it ll be a PROPERTY here not method

		System.out.println("Length:" + arrLength);

		// Array Values
		System.out.println("Array: ");
		for (int i = 0; i < arrLength; i++) {
			System.out.println(arr[i]);
			System.out.println();
		}

		// Sorted Array Values
		System.out.println("Sorted Array in ascending: ");

		Arrays.sort(arr);// default sorting of array always in ascending

		for (int i = 0; i < arrLength; i++) {
			System.out.println(arr[i]);
			System.out.println();
		}

		// Finding largest and smallest element in array
		System.out.println("Second Largest Element in Array: " + arr[arrLength - 2]);
		//System.out.println("First Smallest: " + arr[0]); System.out.println();

		// Printing sorted array in descending order
		/*
		 * System.out.println("Sorted Array in descending: "); for (int i = arrLength; i >0 ;
		 * i--) { System.out.println(arr[i-1]); System.out.println(); }
		 */

	}

}
