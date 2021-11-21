package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDupliates {

	public static void main(String[] args) {

		/*
		 * String text = "We learn java basics as part of java sessions in java week1";
		 * String[] splitText = text.split(" "); Set<String> dups = new
		 * LinkedHashSet<String>();//will not allow duplicate for (int i = 0; i
		 * <splitText.length; i++) { dups.add(splitText[i]);
		 * 
		 * boolean contains = dups.contains(splitText[i]); if(contains) {
		 * System.out.println("Yes"); }
		 * 
		 * } System.out.println(dups);
		 */

		String text = "PayPal India";
		char[] charArray = text.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			boolean addSet = charSet.add(charArray[i]);
			//boolean contains = charSet.contains(charArray[i]);
			//System.out.println(contains);
			// System.out.println("Character Set Initially: "+charSet);
			if(!addSet) {
			//if (contains) {
				dupCharSet.add(charArray[i]);
				// System.out.println("Duplicate Character Set: "+dupCharSet);
				charSet.remove(charArray[i]);
				for (int j = 0; j < charSet.size(); j++) {
					if (charArray[j] != ' ') {
						System.out.println("Character Set Finally: " + charSet);
						// continue;
					}
				}
			}
		}

		System.out.println("Character Set: " + charSet);
		System.out.println("Duplicate Character Set: " + dupCharSet);

	}

}
