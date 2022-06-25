package objectCloning;

public class ClassA implements Cloneable{

	int i;
	int j;

	public static void main(String[] args) throws CloneNotSupportedException {

		ClassA obj = new ClassA();
		obj.i = 10;
		obj.j = 20;
		ClassA obj1 = (ClassA) obj.clone();
		System.out.println(obj1.j);

	}
}
