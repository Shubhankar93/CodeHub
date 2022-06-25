package array;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] a; // Declaration 
		a = new int[3]; // Creating memory for array
		//Assigning values into array
		a[0]= 20;  
		a[1]= 30;
		a[2]= 40;
		
		for ( int i : a)// For each loop 
		{
			System.out.println(i);
		}	
	}
}
