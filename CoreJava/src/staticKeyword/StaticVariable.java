package staticKeyword;
	
public class StaticVariable {
	 static int empid = 3;
	
	public  static void set(int i){
		empid = i ;
	}
	public void show(){
		System.out.println(this.empid);
	}
	
	public static void main(String[] args) {
		StaticVariable obj = new StaticVariable();
		obj.set(30);
		obj.show();
		StaticVariable obj2 = new StaticVariable();
		obj2.show();

	}

}
