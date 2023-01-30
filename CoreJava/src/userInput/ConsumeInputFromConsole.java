package userInput;

import java.util.Scanner;



public class ConsumeInputFromConsole {
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner (System.in);
		String s = sc.nextLine();
		System.out.println(s);
	}

}
