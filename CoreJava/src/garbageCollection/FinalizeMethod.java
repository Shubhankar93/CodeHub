package garbageCollection;

public class FinalizeMethod{
	
	protected void finalize(){
		System.out.println("Close all DB connections");
	}

	public static void main(String[] args) {
		FinalizeMethod obj1 = new FinalizeMethod();
		FinalizeMethod obj2 = new FinalizeMethod();
		obj1=null;
		obj2=null;
		System.gc();
		

	}

}

