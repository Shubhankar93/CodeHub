package tanukaGhosh;

public class program {

	public static void main(String[] args) {
		// separate only alphabets from an alphanumeric string
		StringBuffer newValue = new StringBuffer();
		String s = "tanuka@123";
		for(int i=0; i<s.length();i++) {
			char temp = s.charAt(i);
			for(char j='A';j<='Z';j++) {
				if (temp == j ) {
					newValue = newValue.append(temp);
				}
			}
			//if(Character.isAlphabetic(s.charAt(i)))
			//newValue = newValue.append(s.charAt(i));

		}
		System.out.println(newValue); 
}
}