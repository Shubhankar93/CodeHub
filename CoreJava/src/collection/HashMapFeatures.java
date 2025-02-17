package collection;

import java.util.*;

public class HashMapFeatures {

	public static void main(String[] args) {
		Map<String,Integer> mapValues = new HashMap<String,Integer>();
		
		mapValues.put("Kolkata", 30);
		mapValues.put("Mumbai", 32);
		mapValues.put("Delhi", 40);
		
		
		//******** print the entire map 
		System.out.println(mapValues); 
		
		//******** Store the entire map in a form of set
		Set sets = mapValues.entrySet();
		System.out.println(sets);
		
		//******** Print keys alone
		Set keys = mapValues.keySet();
		System.out.println(keys); 
		
		//******** Print values alone
		Collection values = mapValues.values();
		System.out.println(values);
		
		//******** ForEach Loop to print values alone
		for(String key : mapValues.keySet()) {
				System.out.println(mapValues.get(key));
		}
		
		// ******* Print key & value using Entry interface
 	    for(Map.Entry<String, Integer> set: mapValues.entrySet()) {
			System.out.println(set.getKey());
			System.out.println(set.getValue());
		}
		

	}

}
