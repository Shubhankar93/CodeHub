package sorting;

import java.util.*;

public class FindSecondLargestInteger {

	public static void main(String[] args) {
		int[] values = {23,11,66,20,12,3,99,2};
		Arrays.sort(values);
		for(int val: values) {
			System.out.println(val);
		}
		int secondLargest = values[values.length - 2];
		System.out.println(secondLargest);

	}

}
