package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1 = "stops";
		String str2 = "potss";
		String sameValue = "";
		if (str1.length() == str2.length()) {
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			for (int i = 0; i < charArray1.length; i++) {
				for (int j = 0; j < charArray2.length; j++) {
					if (charArray1[i] == charArray2[j]) {
						sameValue += charArray2[j];
						break;
					}
				}
			}
			System.out.println("ANAGRAM: "+sameValue);
		}
	}

}
