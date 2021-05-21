package renuka.Assignment18;

import java.util.Scanner;

public class GetCharacterFromAsciivalue {
	
	public char getCharFromGivenAscii(int asciiNumber) {
		char charOfAscii = (char) (asciiNumber);
		return charOfAscii;
	}

	public static void main(String[] args) {
		GetCharacterFromAsciivalue getCharacterFromAsciivalue = new GetCharacterFromAsciivalue();
		// char asciiValue1=getCharacterFromAsciivalue.getCharFromGivenAscii(65);
		// System.out.println("The Character value of Entered Ascii is : "+asciiValue1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Ascii Value of which you want to Character  :");
		int inputAscii = scanner.nextInt();
		char charAsciiValue = getCharacterFromAsciivalue.getCharFromGivenAscii(inputAscii);
		System.out.println("The ASCII value of Entered Character is  : " + charAsciiValue);
		scanner.close();

	}


}
