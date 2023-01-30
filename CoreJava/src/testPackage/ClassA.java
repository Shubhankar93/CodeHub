package testPackage;

public class ClassA {
	int a = 5; 
	int b = 10;
	public static void main(String[] args) throws CloneNotSupportedException
	{
	
		ClassA obj = new ClassA();
		ClassA obj1 = (ClassA) obj.clone();
		System.out.println(obj1 == obj);
	}
}
