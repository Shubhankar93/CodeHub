package inheritanceWithConstructor_ExecutionOrder;

public class Class_C extends Class_B{
	public Class_C(){
		super();
		System.out.println("Constructor inside Class C !");
		}
	 
	public static void main(String[] args) { 
	Class_C s = new Class_C();
	}
}
