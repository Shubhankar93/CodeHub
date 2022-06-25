package exceptionHandling;

public class UncheckedException {

	public static void main(String[] args) {
		try{
		System.out.println("Line1");
		System.out.println(2/0);
		System.out.println("Line3");
		}
		catch(Exception e){
			
			System.out.println( e.toString());
		
			System.out.println(e.getMessage());					
			
		}
		System.out.println("Line4");

	}

}
