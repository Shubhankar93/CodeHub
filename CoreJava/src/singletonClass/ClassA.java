package singletonClass;

public class ClassA {
	static ClassA obj = new ClassA(); 
	private ClassA()
	{
		
	}
	
	public static ClassA getObject()
	{
		return obj;
		
	}

}
