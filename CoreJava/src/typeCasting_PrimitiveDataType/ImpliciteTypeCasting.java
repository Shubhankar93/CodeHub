package typeCasting_PrimitiveDataType;

public class ImpliciteTypeCasting {

	public static void main(String[] args) {
		int a = 10;
		double b = a;// double is of 8 byte and int is of 4 bytes - so JVM
						// itself will convert it's type from int to double and
						// store it without lossing any data
		System.out.println(b);
		System.out.println(a);

	}

}
