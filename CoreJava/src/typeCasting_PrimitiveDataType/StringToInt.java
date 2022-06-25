package typeCasting_PrimitiveDataType;

public class StringToInt {

	public static void main(String[] args) {
		String s = "100";
		String s1 = new String("200");
		//Converting String(literal) to int (primitive) 
		Integer i = Integer.parseInt(s1); //here both primitive and object can be passed ie. s and s1 both are allowed.
		int i1 = Integer.parseInt(s1);
		Integer ii = Integer.parseInt(s);
		int ii1 = Integer.parseInt(s1);
		System.out.println(i);
		// Converting Int to string 
		int k = 500;
		Integer k1 = new Integer(600);
		String m = String.valueOf(k1);//try with k and k1
		System.out.println(m);
		
		
	}

}
