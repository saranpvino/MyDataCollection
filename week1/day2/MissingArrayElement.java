package week1.day2;

import java.util.Arrays;

public class MissingArrayElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 6, 8 };// Initialization

		int arrLength = arr.length;// find its length and it ll be a PROPERTY here not method

		// Missing Element in Array
		Arrays.sort(arr);
		// Print array values in String(without loop)
		System.out.print(Arrays.toString(arr));
		for (int i = 0; i < arrLength; i++) {
			// System.out.println(arr[i]);
			if (i + 1 != arr[i]) {
				System.out.println();
				System.out.println("MissingElement: " + (i + 1));
				break;
			}
		}
	}

}
