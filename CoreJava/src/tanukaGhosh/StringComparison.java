package tanukaGhosh;

public class StringComparison {

	public static void main(String[] args) {
		// String Literals
        String s="Tanuka";
        String t="Tanuka";
        
        if (s==t){
        	System.out.println("pass");
        }
        else{
    		System.out.println("fail");
        }
	
	// String Objects
    String s0=new String("Shubho");
    String s1=new String("Tanuka");
    String s2=new String("Shubho");
    
    if (s==s1){
    	System.out.println("pass");
    }
    else{
		System.out.println("fail");
    }
    
    
}
}
