package staticKeyword;
	
public class StaticVariable_1 {
	    static int empid = 3; //Member variable (class)
	    int YOE = 7; // Member variable (instance)
	
	public void set(int i){
		empid = i ;
	}
	public void show(){
		System.out.println("value-" +  this.empid);
	}
	
	public static void main(String[] args) {
		int j = 90;
		StaticVariable_1 obj = new StaticVariable_1();
		obj.set(10);
		obj.show();
		
		
		StaticVariable_1 obj2 = new StaticVariable_1();
		obj2.set(40);
		obj2.show();
		
		obj.show();
		System.out.println(empid);
		//System.out.println(YOE); Static methods cannot access non-static (instance) variables directly because of how static members and instance members are tied to the class and its objects in Java
	}
}
//Member Variable: Any variable which is declared within a class but outside of any method, constructor, or block. (General term for any variable declared in a class.)
//Instance Variable: Non-static variable tied to object.
//Class Variable: Static variable shared among all instances of a class