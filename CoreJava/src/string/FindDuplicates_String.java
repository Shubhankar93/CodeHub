// Find the Duplicate words in a statement
package string;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates_String {

	public static void main(String[] args) {
		String s = "you are a SDET and you are good tester SDET";
		String[] words = s.split(" ");
		int length = words.length;
		Set<String> val = new HashSet<String> ();
		for (int i=0;i<length-1;i++){
			for (int j=i+1;j<length;j++){
				if (words[i].equals(words[j])){
					val.add(words[i]);
				}
			}
		}
System.out.println(val);
	}

}
