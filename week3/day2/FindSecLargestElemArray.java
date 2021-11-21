package week3.day2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindSecLargestElemArray {

	public static void main(String[] args) {
		int arr[] = { 100, 49, 398, 34, 1, 267 };// Initialization
		int arrLength = arr.length;// find its length and it ll be a PROPERTY here not method
		//Arrays.sort(arr);
		List<Integer> largeElement	=	new ArrayList<Integer>();
		// Array Values
		System.out.println("Sorted Array: ");
		for (int i = 0; i < arrLength; i++) {
			largeElement.add(arr[i]);
			//System.out.println(arr[i]);
			//System.out.println();
		}
		Collections.sort(largeElement);
		System.out.println(largeElement);
		int size=largeElement.size();
		System.out.println("Second Largest Element in Array: " + largeElement.get((size-2)));
	}

}
