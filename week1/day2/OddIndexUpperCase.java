package week1.day2;

public class OddIndexUpperCase {

	public static void main(String[] args) {
		int count = 0;
		String str = "Welcome to Testleaf";
		char[] charArray = str.toCharArray();
		/*
		 * Changing STRING to uppercase String upperCase = str.toUpperCase(); //NOTE
		 * System.out.println("UPPERCASE: "+upperCase);
		 */

		// Convert ODD index CHARACTER to uppercase
		System.out.println("Converting odd index CHARACTER to Uppercase");
		for (int i = 1; i < charArray.length; i++) {
			if (i % 2 != 0) {
				char strnew = charArray[i];
				// System.out.println(strnew);
				char upperCase = Character.toUpperCase(strnew);
				// NOTE Character.toUpperCase()
				System.out.print(upperCase);
			}
		}

	}

}
