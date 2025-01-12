package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicateCharactersFromString {

	public static void main(String[] args) {
		String val = "calcutta";
		Set<Character> newVal = new HashSet<Character> (); 
		for(int i=0;i<val.length();i++) {
			newVal.add(val.charAt(i));
		}
		
		Iterator itr = newVal.iterator();
		String fVal = ""; 
        // check element is present or not. if not loop will
        // break.
        while (itr.hasNext()) {
        	fVal = fVal + itr.next();
            
        }
        
        System.out.println(fVal);

	}

}
