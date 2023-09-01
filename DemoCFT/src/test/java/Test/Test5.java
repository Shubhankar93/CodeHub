package Test;

public class Test5 {
	 static int i;
	public void setValue(int j) {
		//static int h;
		this.i = j ;

	}
	
	
	
	
	
	public static void main(String[] args) {
		Test5 obj1 = new Test5();
		obj1.setValue(10);
		System.out.println(obj1.i);
		
		Test5 obj2 = new Test5();
		obj2.setValue(15);
		System.out.println(obj2.i);
		
		System.out.println(obj1.i);

	}

}
