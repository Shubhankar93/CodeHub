package collection;
import java.util.*;

public class IteratorDemoForList {

	public static void main(String[] args) {
		
		String[] arr = {"Apple", "Banana", "Cherry"};
		Set<String> set = new HashSet<>(Arrays.asList(arr));
        Iterator<String> iterator = set.iterator(); // Get Iterator

        while (iterator.hasNext()) { // Check if next element exists
            System.out.println(iterator.next()); // Print element
        }
        
        // Another way of iterating elements
        for(String ls: set) {
        	System.out.println(ls);
        	
        }

	}

}
