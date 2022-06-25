package exceptionHandling;

public class Test {

	public static void main(String[] args) {
		try{
		m1();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public static void m1() {
		
		m2();
		System.out.println(10/0);
		
		
	}

	public static void m2() {
	
		System.out.println("MUMBAI");
		
	
	}

}
