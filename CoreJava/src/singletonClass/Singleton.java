package singletonClass;

public class Singleton {

	public static void main(String[] args) {
		ClassA obj1 =  ClassA.obj;
		ClassA obj2 =  ClassA.getObject();
		System.out.println(obj1);
		System.out.println(obj2);
		

	}

}
