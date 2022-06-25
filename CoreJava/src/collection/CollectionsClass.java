package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		/*int[] a = {10,22,29,99,5,12};
		List<>Integer al = new  ArrayList<Integer>();
		System.out.println(al);
		Collections.addAll(al, a);
		Collections.reverseOrder();
		System.out.println(al);*/
		
		 Integer[] array = {10,22,29,99,5,12};

	     //===================Putting an array into list==================== 
		 //Method 1
	      List list = Arrays.asList(array);          
	      System.out.println(list);

	      //Method 2
	      List<Integer> list1 = new ArrayList<Integer>();
	      Collections.addAll(list1, array);
	      System.out.println(list1);
	      
	      //================== Sort in Ascending and Descending order =====================
	      
	      Collections.sort(list1);
	      System.out.println(list1);
	      Collections.reverse(list1);
	      System.out.println(list1);
	      
	     
	      

	}

}
