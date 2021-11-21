package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums	= {10,24,32,64,85,37,12,10};
		
		Set<Integer> number	=	new TreeSet<Integer>();//will not allow duplicate
		for (int i = 0; i < nums.length ; i++) {
			boolean add = number.add(nums[i]);
			if(!add){					//adding array values to Set
				System.out.println("Duplicate: "+nums[i]);
				break;
			}
		}
		
		System.out.println(number);
	}

}
