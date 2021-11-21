package week3.day1;

public class CheckString {

	public static void main(String[] args) {
		/*
		 * String str3 = new String("Kutty"); String str4 = new String("Kutty");
		 * 
		 * if (str3 == str4) { //Wrong comparison for string..instead use equals();
		 * System.out.println(" Same text"); } else System.out.println("Diff text");
		 * 
		 * System.out.println("***");
		 */
		// BEST EXAMPLE FOR WHY IS STRING IMMUTABLE
		String s = "Test";
		s.concat(" World");// Will not concat and will print Test because strings are immutable
							// objects
		System.out.println(s);
		String s2 = s.concat(" Leaf");// concat() method appends the string at the end and store it in an another
		// obj s2
		System.out.println(s2);// will print Test Leaf

		String s1 = 50 + 30 + "Sachin" + 40 + 40; // After String literal all "+" will be considered as concatenation
													// operator
		System.out.println(s1);// 80Sachin4040

		String text = "Java Exercise";
		// Index for character E and s
		System.out.println("Index of Character: ");
		System.out.println(text.indexOf('E'));
		System.out.println(text.indexOf('s'));
		/*
		 * //Logic char[] charArray = text.toCharArray(); for (int i = 0; i <
		 * charArray.length; i++) { if((charArray[i]=='E')||(charArray[i]=='s')) { //int
		 * count=1; System.out.println("Index: "+i); }
		 * 
		 * }
		 */

		String str1 = "I am Learning Java";
		String str2 = "I am learning java?";
		// if(str1 == str2) {Wrong comparison for string..instead use equals();
		if (str1.equals(str2)) {// include case and check
			System.out.println("Equal String");
		} else if (str1.equalsIgnoreCase(str2)) { // Ignore case and check string
			System.out.println("Equal String if ignore case");
		} else {
			System.out.println("Different String");
		}
		// string contains particular word/char
		if (str2.contains("java?")) {
			System.out.println("Contains string");
		}

		String sentence = "I am working with Java8";
		char charAt8 = sentence.charAt(7);// Index=length-1
		char charAt11 = sentence.charAt(10);
		String replace = sentence.replace(charAt8, charAt11);
		System.out.println("REPLACED STRING: " + sentence.replace(str1, str2));
		System.out.println("REPLACED CHARACTERS: " + replace);
		System.out.println("SUBSTRING:" + sentence.substring(5, 15));

	}

}
