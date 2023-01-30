package methodOverriding;

public class Class_B extends Class_A {
	//@Override// this annotation is not mandatory
	public void show(){
		System.out.println("Class B-Show");
	}
	public static void display(){
		System.out.println("Class B-Display");
	}

}
