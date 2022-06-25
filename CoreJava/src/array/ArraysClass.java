package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysClass {

	public static void main(String[] args) {
		Integer a[] = {12,11,3,22,6,50,66,2};
		//sorting an array 
		//Arrays.sort(a,  2,5 );
		//Arrays.sort(a);
		//putting array in a list
		List<Integer> values = Arrays.asList(a);
		System.out.println(values);
		/*for(int i=1;i<=a.length;i++){
			System.out.println(a[i-1]);
		}*/

	}

}
