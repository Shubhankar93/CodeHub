package abstractClass;

abstract public class AbstractClassExample_A {

	
		int noOfTyres ; 
		//Abstract class can contain constructor 
		public AbstractClassExample_A(){
			this(5); 
			System.out.println("Parent Class Constructor Called !");
		}
		public AbstractClassExample_A(int i) {
			System.out.println("Constructor inside a constructor !");
		}
		public abstract void start();
		private void show(){
		System.out.println("Vehicle made in India");
		}

}
