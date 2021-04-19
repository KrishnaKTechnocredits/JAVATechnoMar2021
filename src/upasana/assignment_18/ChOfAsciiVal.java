package upasana.assignment_18;

import java.util.Scanner;
public class ChOfAsciiVal {
	
	char getCharOfAsciiVal(int asciiValue) {
		return (char)asciiValue;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input");
		int asciiVal = scanner.nextInt();
		char ch=new ChOfAsciiVal().getCharOfAsciiVal(asciiVal);
		System.out.println("Character of the given Ascii Value " +asciiVal+" is "+ch);
		scanner.close();
	}


}