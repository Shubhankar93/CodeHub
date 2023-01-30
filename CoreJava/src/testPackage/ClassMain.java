package testPackage;

public class ClassMain {
	int p = 20; 
	int q = 30;
	
	public void show () {
		int a = 5; 
		int b = 10;
	}
	public static void main(String[] args) {
		ClassMain obj1 = new ClassMain();
		obj1.p = 222;
		obj1.q = 333;
		System.out.println(obj1);
		System.out.println(obj1.hashCode());
		
		

	}

}


