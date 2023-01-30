package exceptionHandling;

public class DefaultExceptionHandler {

	public static void main(String[] args) {
		m1();
		System.out.println("KOLKATA");
	}

	public static void m1() {

		try {
			m2();
			System.out.println("CHENNAI");

		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e.getMessage());
		}
		System.out.println("DELHI");
	}

	public static void m2() {
		System.out.println(10 / 0);
		System.out.println("MUMBAI");

	}

}
