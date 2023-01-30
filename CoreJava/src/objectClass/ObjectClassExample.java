package objectClass;

public class ObjectClassExample {

	public void show () {
		System.out.println("abc");
	}
	
	
	
	public static void main(String[] args) {
		ObjectClassExample obj= new ObjectClassExample(); 
		ObjectClassExample obj1= obj;
		ObjectClassExample obj2= new ObjectClassExample(); 
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());

	}

}
