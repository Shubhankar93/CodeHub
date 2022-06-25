package constructor;

public class Class_A {
	int a, b;

	
	Class_A(){
		 a = 5;
		b = 10;
		System.out.println(a);
		System.out.println(b);
	}

	Class_A(Class_A ref) {
		int j, k;
		j = ref.a;
		k = ref.b;
		System.out.println(j);
		System.out.println(k);
	}

	public static void main(String[] args) {
		Class_A obj = new Class_A();
		Class_A obj1 = new Class_A(obj);

	}

}
