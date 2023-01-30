package string;

public class StringObject {
	public static void main(String[] args) {
		String a = new String ("Kolkata");
		String b = new String ("Delhi");
		String c = new String ("Kolkata");
		if (a == c) {
			System.out.println("Both a and c refering to same object");
		} else {
			System.out.println("a and c not refering to same object");
		}
	}

}
