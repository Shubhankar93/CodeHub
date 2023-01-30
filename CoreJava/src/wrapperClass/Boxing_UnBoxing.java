package wrapperClass;

public class Boxing_UnBoxing {

	public static void main(String[] args) {
		int a = 5; // storing data in primitive data type 
		
		Integer aa = new  Integer (5); //boxing ( converting a primitive data into an object)
		Integer bb = new  Integer (a); //boxing ( converting a primitive data into an object)
		
		Integer i = a; //Autoboxing
	
		int j = bb.intValue(); 	//unboxing ( Converting an object into primitive data type)
		
		int jj = bb; // Autounboxing
		
		//Note: Autoboxing and Autounboxing has been introduced in Java since java version 1.5
		}

}
