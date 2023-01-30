package staticKeyword;

	public class NonStaticVariable {
		 int i =5 ;
		public  void show (){
			//int i;
			System.out.println(i);
		}
	
		public static void main(String[] args) {	
			System.out.println("abc");
			NonStaticVariable obj = new NonStaticVariable();
			System.out.println(obj.i);
			obj.show();
		}
	
	}
