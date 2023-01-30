//Object Cloning - Way 1 : Cloning an object of a class inside same class 


package objectCloning;

public class Cloning_Option_1 implements Cloneable{

	int i;
	int j;

	public static void main(String[] args) throws CloneNotSupportedException {

		Cloning_Option_1 obj = new Cloning_Option_1();
		obj.i = 10;
		obj.j = 20;
		Cloning_Option_1 obj1 = (Cloning_Option_1) obj.clone();
		System.out.println(obj1.j);

	}
}

// *********************** End of Program ***********************************