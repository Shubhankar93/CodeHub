
//Object Cloning - Way 2 : Cloning a class (OC_Clonable) from this (ObjectCloneDemo) class 


//*************************************  Start ************************************************
package objectCloning;

public class Cloning_Option_2   {

	int i;
	int j;


	public static void main(String[] args) throws CloneNotSupportedException {
		OC_Clonable obj = new OC_Clonable();
		obj.k = 200;
		obj.l = 500;
		OC_Clonable obj1 =  (OC_Clonable) obj.clone();
		System.out.println(obj1.k);


	}

}

// Go To QC_Clonable Class
