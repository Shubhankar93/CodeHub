package methodHiding;

public class Class_Main {

	public static void main(String[] args) {
		ClassA obj = new ClassB();
		obj.m1();// As per Override rule it should invoke m1() of ClassB as Method Overriding takes place during run time and here in Runtime Object of ClassB being assigned but it will invoke m1() method of ClassA bcz of Method hiding and as per method hiding 
		
	}

}
