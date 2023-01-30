package tanukaGhosh;

import java.util.HashMap;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer st= new StringBuffer();
		String s="Tanuka";
		
		for(int i=s.length();i>0;i--) {
			st=st.append(s.charAt(i-1));
		}
		System.out.println(st);

}

	
}

