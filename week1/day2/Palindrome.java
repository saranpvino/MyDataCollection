package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str = "madam";
		String rev = "";
		char[] charArray = str.toCharArray();
		int charLength = charArray.length;
		for (int j = charLength - 1; j >= 0; j--) {
			rev += charArray[j];
		}
		if (str.equalsIgnoreCase(rev)) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("Not a PALINDROME");
		}
	}

}
