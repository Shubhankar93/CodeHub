package miscellaneous;

import java.util.ArrayList;
import java.util.Collections;

public class EvenOdd {

	public static void main(String[] args) {
		Integer[] num = {12,79,66,55,23}; 
		ArrayList<Integer> oddNum = new ArrayList<Integer> ();
		ArrayList<Integer> evenNum = new ArrayList<Integer> ();
		for (int i=0;i<num.length;i++)
		{
			if (num[i]%2 == 0){
				evenNum.add(num[i]);
			}else{
				oddNum.add(num[i]);
			}
		}
		System.out.println(Collections.max(oddNum));
		System.out.println(Collections.max(evenNum));
		
		
	}

}
