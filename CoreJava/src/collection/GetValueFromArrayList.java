package collection;
import java.util.*;

public class GetValueFromArrayList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 11, 3, 22, 6, 50, 66, 2);
		System.out.println(list.get(1));
		for (Integer i : list) {
			System.out.println(i);
		}
		

	}

}
