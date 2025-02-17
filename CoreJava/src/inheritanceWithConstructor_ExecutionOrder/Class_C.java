package inheritanceWithConstructor_ExecutionOrder;

public class Class_C extends Class_B{
	public Class_C(){
		//super(); // if you do not explicitly call a superclass constructor (super()), the compiler automatically inserts super(); as the first line of every constructor 
		System.out.println("Constructor inside Class C !");
		}
	 
	public static void main(String[] args) { 
	Class_C s = new Class_C();
	}
}
