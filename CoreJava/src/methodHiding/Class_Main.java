package methodHiding;

public class Class_Main {

	public static void main(String[] args) {
		ClassB objB = new ClassB();
		//ClassA objA = new ClassA();
		ClassA objA = objB;
		
		objA.m1(); // Class-A
		objB.m1();// Class-B
	
		

	}

}
