package typeCasting_PrimitiveDataType;

public class ExpliciteTypeCasting {

	public static void main(String[] args) {
		double a = 10.55;
		// int c = a;// here compiler will give error as we are trying to pass
		// broader data type (higher size) to a narrower data type (lower size)
		int b = (int) a; // Explicit Type casting - this can result in loss of
							// information
		System.out.println(b);
		System.out.println(a);//
	}

}
