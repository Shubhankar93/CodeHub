package tanukaGhosh;

public class LearnConstructor {
	
	protected LearnConstructor(){
	     this("Shubho");
	   }
// Parameterized constructor
		LearnConstructor(String s){
			       System.out.println("Parameterized constructor " + s);
			   }

	public static void main(String[] args) {
		// Non-Parameterized constructor
		
		//LearnConstructor ob=new LearnConstructor();
		//LearnConstructor ob1=new LearnConstructor("Tanuka");
	
}

}