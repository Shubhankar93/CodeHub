// Question - Shift all Zeros to end 

package array;

import java.util.ArrayList;

public class Array_Q1 {

	public static void main(String[] args) {
		int a[] = { 1, 0, 3, 0, 5 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i <= a.length - 1; i++) {
			al.add(a[i]);
		}

		System.out.println(al);

		for (int j = 0; j < a.length - 1; j++) {
			if (al.get(j).equals(0)) {
				int temp = al.get(j);
				System.out.println(j);
				al.remove(j);
				System.out.println(al);
				al.add(al.size(), temp);
				System.out.println(al);
			}
		}

		System.out.println("Print all" + al);

	}

}
