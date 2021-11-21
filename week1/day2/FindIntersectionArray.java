package week1.day2;

public class FindIntersectionArray {

	public static void main(String[] args) {
		int arr1[] = { 3, 2, 11, 4, 6, 7 };
		int arr2[] = { 1, 2, 8, 4, 9, 7 };

		int arr1Length = arr1.length;
		int arr2Length = arr2.length;

		// Intersection means getting similar elements in two arrays
		System.out.println("Intersection of Arrays");
		for (int i = 0; i < arr1Length; i++) {
			for (int j = 0; j < arr2Length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}
	}

}
