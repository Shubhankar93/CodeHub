// Find the occurrences of Duplicate words in a statement
package string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateSubstringsFromString {

	public static void main(String[] args) {
		String s = "you are a special SDET and you are good tester SDET also you are special";
		String[] words = s.split(" ");
		int length = words.length;
		Set<String> val = new HashSet<String>();
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();

		for (int i = 0; i < length - 1; i++) {
			if (!val.contains(words[i])) {
				for (int j = i + 1; j < length; j++) {
					if (words[i].equals(words[j])) {
						val.add(words[i]);
						
						if (hMap.containsKey(words[i])) {
				            int count = hMap.get(words[i]);
				            hMap.put(words[i], ++count);
				         } else {
				            hMap.put(words[i],2);
				         }
					}
				}
			}
		}
		System.out.println(val);
		System.out.println(hMap);
	}

}
