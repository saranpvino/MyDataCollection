package week3.day2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountCharacterOccurence {
	public static void main(String[] args) {
		// Print how many characters and its each count
		// a -> 3
		// m -> 2

		// Map -> Character , Integer
		// Does the return order matters -> Yes, alphabetic !! -> TreeMap
		/*
		 * String -> characters -> toCharArray
		 * 
		 * Loop through every character -> check if the character in the map -> No ->
		 * Create a new entry -> character, 1 -> Yes -> Update that count -> existing
		 * count + 1
		 * 
		 * Finally print
		 * 
		 */

		String companyName = "amazon india development center";
		char[] charArray = companyName.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < charArray.length; i++) {
			if (map.containsKey(charArray[i])) {
				map.put(charArray[i], map.get(charArray[i]) + 1);
			} else {
				map.put(charArray[i], 1);
			}
		}
		System.out.println(map);

		/*//SIMPLER VERSION OF ABOVE
		 * char[] charArray = companyName.toCharArray(); Map<Character, Integer> map =
		 * new HashMap<Character, Integer>(); for (int i = 0; i < charArray.length; i++)
		 * { map.put(charArray[i], map.getOrDefault(charArray[i], 0) + 1); }
		 * System.out.println(map);
		 */

		/*//LOGIC
		 * char[] charArray = companyName.toCharArray(); int count = 0;
		 * 
		 * for (int i = 0; i < charArray.length; i++) { if(charArray[i] == 'a') {
		 * count++; } } System.out.println(count);
		 */
	}
}
