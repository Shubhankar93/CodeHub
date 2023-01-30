package string;

public class StringLiteral {

	public static void main(String[] args) {
		String a = "Kolkata";
		String b = "Delhi";
		String c = "Kolkata";
	
		// a and c both are referring to same object 
		if (a == c) {
			System.out.println("Both a and c refering to same object");
		} else {
			System.out.println("a and c not refering to same object");
		}

	}

}
