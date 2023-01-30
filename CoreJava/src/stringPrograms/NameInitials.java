package stringPrograms;

public class NameInitials {

	public static void main(String[] args) {
		String name = "Sankar Kumar Bera";
		String[] nameSplits = name.split(" ");
		int length = nameSplits.length;
		StringBuffer shortName = new StringBuffer();
		
		for (int i=0;i<length;i++) {
			shortName = shortName.append(nameSplits[i].charAt(0));
			
		}
		
		System.out.println(shortName);

	}

}
