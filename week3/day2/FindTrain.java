package week3.day2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTrain {

	public static void main(String[] args) {
		List<String> trainName = Arrays.asList("Pandian", "Vaigai", "Pandian", "Muthunagar", "Quilon");
		Collections.sort(trainName);
		System.out.println("After sorting: "+trainName);
		
		Collections.reverse(trainName);
		System.out.println("After reversing: "+trainName);
		
		int size	=	trainName.size();
		System.out.println(trainName.get(size-2));
		
		//trainName.add("Nagerkovil Express");
		//System.out.println("After adding: "+trainName);
		
	}

}
