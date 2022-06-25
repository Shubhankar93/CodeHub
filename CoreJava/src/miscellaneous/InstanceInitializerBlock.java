// Instance block vs Static Block vs Constructor - Let's check execution order of them

package miscellaneous;

public class InstanceInitializerBlock {
	
	{
		System.out.println("InstanceInitializerBlock invoked");
		}
	static {
		System.out.println("static block invoked");
	}
	InstanceInitializerBlock(){
		System.out.println("Constructor Invoked");
	}
	
	public static void main(String[] args) {
		InstanceInitializerBlock obj = new InstanceInitializerBlock();
		

	}

}
