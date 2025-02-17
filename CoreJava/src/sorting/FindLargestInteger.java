package sorting;

public class FindLargestInteger {
	
	public static void main(String[] args) {
		int[] values = {23,11,66,20,12,3,99,2};
		int max = values[0];
		for(int i=1;i<values.length;i++) {
			if(values[i]>max) {
				max = values[i];
			}
		}
		
		System.out.print(max);
		
	}

}
