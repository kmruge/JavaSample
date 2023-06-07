package Intrview;

import java.util.*;

public class RevArry {

	public static void main(String[] thiru) {
		Integer [] nums= {1,2,3,4,5,6,7};
		for(Integer value:nums) {
			System.out.println("original value "+value);
		}
		Arrays.sort(nums,Collections.reverseOrder());
		System.out.println(Arrays.toString(nums));
		for(Integer number:nums) {
			System.out.println("reversed value  "+number);
		}
	}

}
