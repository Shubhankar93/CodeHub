// Reverse a string with reverse
package string;

public class StringReverse {

	public static void main(String[] args) {
		String  a = "KOLKATA";
		StringBuffer  b = new StringBuffer("");// this value is going to change multiple time hence using StringBuffer
		for(int i=((a.length())-1); i>=0; i--){
			b=b.append(a.charAt(i));
		}
		System.out.println(b);
	}

}
