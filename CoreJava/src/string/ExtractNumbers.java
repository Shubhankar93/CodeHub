package string;

public class ExtractNumbers {

	public static void main(String[] args) {
		String str="sdfvsdf68fsdfsf8999fsdf09";
		String numberOnly= str.replaceAll("[0-9]", "");
		
		System.out.println(numberOnly);
		   
		   

	}

}
