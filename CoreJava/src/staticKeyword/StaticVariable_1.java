package staticKeyword;
	
public class StaticVariable_1 {
	  static int empid = 3;
	
	public void set(int i){
		empid = i ;
	}
	public void show(){
		System.out.println("value-" +  this.empid);
	}
	
	public static void main(String[] args) {
		StaticVariable_1 obj = new StaticVariable_1();
		obj.set(10);
		obj.show();
		
		
		StaticVariable_1 obj2 = new StaticVariable_1();
		obj2.set(40);
		obj2.show();
		
		
		obj.show();
		System.out.println("abc");
		
		
		

	}

}
