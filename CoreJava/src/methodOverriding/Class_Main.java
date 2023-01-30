package methodOverriding;

public class Class_Main {

	public static void main(String[] args) {
		Class_A obj = new Class_B();
		obj.show(); //Method Overriding (Happens during runtime)
		obj.display();;// Method Hiding  (Happens during compile time)
		
	}

}
