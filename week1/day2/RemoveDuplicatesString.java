package week1.day2;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		String str = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String strNew = "";
		String[] splitWords = str.split(" ");
		int arrayLength = splitWords.length;
		System.out.println("Print Duplicate Words");
		for (int i = 0; i < arrayLength; i++) {
			// System.out.println(splitWords[i]);
			for (int k = i + 1; k < arrayLength; k++) {
				if (splitWords[i].equals(splitWords[k])) {
					count++;
					if (count > 1) {
						strNew	=	splitWords[k].toUpperCase()+"\n";
						strNew += str.replace(splitWords[k], " ");
					}
				}
			}
		}
		System.out.println(strNew);
	}
}
