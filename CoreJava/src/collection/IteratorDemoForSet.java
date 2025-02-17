package collection;
import java.util.*;

public class IteratorDemoForSet {

	public static void main(String[] args) {
		
		String[] arr = {"Apple", "Banana", "Cherry"};
		//List<String> list = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
		List<String> list = new ArrayList<>(Arrays.asList(arr));
        Iterator<String> iterator = list.iterator(); // Get Iterator

        while (iterator.hasNext()) { // Check if next element exists
            System.out.println(iterator.next()); // Print element
        }
        
        // Another way of iterating elements
        for(String ls: list) {
        	System.out.println(ls);
        	
        }

	}

}
