package objectCloning;

public class ObjectCloneDemo extends OC_Test  {
	
	int i;
	int j;

	public static void main(String[] args) throws CloneNotSupportedException {

		ObjectCloneDemo obj5 = new ObjectCloneDemo();
		obj5.i = 10;
		obj5.j = 20;
		ObjectCloneDemo obj1 =  (ObjectCloneDemo) obj5.clone();
		System.out.println(obj1.j);
	
		/*OC_Test obj = new OC_Test();
		obj.k = 200;
		obj.l = 500;
		OC_Test obj1 =  (OC_Test) obj.clone();
		System.out.println(obj.k);*/
		
		
		
	}

}
