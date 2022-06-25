package string;

public class String_Buffer {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("Kolkata");
		StringBuffer b = new StringBuffer("Delhi");
		StringBuffer c = new StringBuffer("Kolkata");
		if (a == c) {
			System.out.println("Both a and c refering to same object");
		} else {
			System.out.println("a and c not refering to same object");
		}

	}

}
