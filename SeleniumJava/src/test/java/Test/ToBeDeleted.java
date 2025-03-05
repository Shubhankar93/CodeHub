package Test;

public class ToBeDeleted {
	 static int i;
	public void setValue(int j) {
		//static int h;
		this.i = j ;

	}
	
	
	
	
	
	public static void main(String[] args) {
		ToBeDeleted obj1 = new ToBeDeleted();
		obj1.setValue(10);
		System.out.println(obj1.i);
		
		ToBeDeleted obj2 = new ToBeDeleted();
		obj2.setValue(15);
		System.out.println(obj2.i);
		
		System.out.println(obj1.i);

	}

}
