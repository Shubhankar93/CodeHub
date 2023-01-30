package exceptionHandling;

public class ExceptionInCatchBlock {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(Exception e){
			try{
				System.exit(0);
				System.out.println(5/0);
				
			}catch(Exception e1){
				System.out.println(e);
				System.out.println("===============");
				System.out.println(e1);
			}
		}

	}

}
