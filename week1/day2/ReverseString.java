package week1.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str = "feeling good";
		char arr[] = str.toCharArray();

		// Reverse the string
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		System.out.println();

		// Find character of the string using charAT()
		int strLength = str.length();// Length of the string is METHOD with ().
		// [Note its not a PROPERTY like array length]
		System.out.println("Length: " + strLength);
		System.out.println("Find character of String at its index: ");
		for (int j = strLength - 1; j >= 0; j--) {
			System.out.print(str.charAt(j));
		}
	}

}
