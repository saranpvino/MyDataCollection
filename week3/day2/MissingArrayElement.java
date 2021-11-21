package week3.day2;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MissingArrayElement {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 7, 6, 8 };// Initialization
		int arrLength = arr.length;// find its length and it ll be a PROPERTY here not method
		Set<Integer> missing = new TreeSet<Integer>();
		System.out.println("Missing Array Element");
		for (int i = 0; i < arrLength; i++) {
			missing.add(arr[i]);
		}
		System.out.println("Set: " + missing);
		for(int var:missing) {
			boolean contains = missing.contains((var+1));
			if(contains){
				//Nothing to do
			}
			else {
				System.out.println("MissingElement: " + (var + 1));
				break;
			}
			var++;
		}
		/*
		 * for (int i = 0; i < arr.length; i++) { if (i + 1 != arr[i]) {
		 * System.out.println(); System.out.println("MissingElement: " + (i + 1));
		 * break; } }
		 */
	}

}
