package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class PrintDupliArrayElem {

	public static void main(String[] args) {
		int arr[] = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int arrLength = arr.length;// find its length and it ll be a PROPERTY here not method

		Set<Integer> dups	=	new TreeSet<Integer>();
		//Print Duplicate Elements
		System.out.println("Print Duplicate Elements");
		for (int i = 0; i < arrLength; i++) {
			dups.add(arr[i]);
		}
		System.out.println(dups);
	}

}
