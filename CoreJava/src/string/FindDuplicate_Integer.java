package string;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate_Integer {

	public static void main(String[] args) {

		Integer[] nums = { 2, 4, 5, 2, 3, 6, 6, 9, 9, 9 };
		int length = nums.length;
		Set<Integer> val = new HashSet<Integer>();
		for (int i = 0; i < length - 1; i++) {
			if (!val.contains(nums[i])) {
				for (int j = i + 1; j < length; j++) {
					if (nums[i] == (nums[j])) {
						val.add(nums[i]);
						break;
					}
				}
			}
		}

		if (val.isEmpty()) {
			System.out.println("There is no duplicate value");
		} else {
			System.out.println(val);
		}

	}

}
