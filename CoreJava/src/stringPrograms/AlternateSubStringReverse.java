package stringPrograms;

public class AlternateSubStringReverse {
	public static void main(String[] args) {
		String name = "I Love My Country Which Is India";
		String[] nameSplit = name.split(" ");
		StringBuffer newName = new StringBuffer(nameSplit[0]);
		for (int i=1; i<nameSplit.length; i++) {
			StringBuilder temp = new StringBuilder(" "+nameSplit[i]+" ") ;
			if (i%2 != 0) {
				
				newName = newName.append(temp.reverse());
			}
			else  {
				newName = newName.append(temp);
			}
		}
		
		System.out.println(newName);
	}
}
