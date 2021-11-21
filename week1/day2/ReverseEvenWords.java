package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String str = "I am a software tester"; 
		String[] splitWords1 = str.split(" ");
		for (int i = 0; i < splitWords1.length; i++) {
			//Taking even words as per index
			if(i%2!=0) {
				String[] splitWords2 = splitWords1[i].split(" ");
				for (int j = 0; j < splitWords2.length; j++) {
					char[] charArray = splitWords2[j].toCharArray();
					for (int k = charArray.length-1; k >=0; k--) {
							System.out.print(charArray[k]);
					}
				}
			}
			else {
				System.out.print(" "+splitWords1[i]+" ");
			}
		}
	}

}
