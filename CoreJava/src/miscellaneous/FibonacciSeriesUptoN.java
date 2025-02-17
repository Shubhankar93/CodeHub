package miscellaneous;

public class FibonacciSeriesUptoN {

	public static void main(String[] args) {
		//0,1,1,2,3,5
		int[] fs = new int[7];
		int a = 0;
		int b = 1;
		int c = a + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		for (int i = 4;i<=10;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			
		}

	}

}
