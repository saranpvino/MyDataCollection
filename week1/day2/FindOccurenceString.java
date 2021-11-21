package week1.day2;

public class FindOccurenceString {

	public static void main(String[] args) {
		// Occurence of e
		int count = 0;
		// String Literal
		String str = "Welcome to Testleaf";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'e') {
				count++;
			}
		}
		System.out.println("Number of Times: " + count);
	}

}
