package miscellaneous;

public class FibanacciSeries {

	public static void main(String[] args) {
		int a= 0;
		int b= 1;
		int c = a+b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		while (true)
		{
		 
		 a = b;
		 b = c;
		 c = a+b;
		if (c<=50){
		System.out.println(c);
		}else{
			break;
		}
	

		}


	}

}
