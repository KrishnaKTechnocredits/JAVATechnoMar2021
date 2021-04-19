package renuka.Assignment18;

import java.util.Scanner;

public class GetAsciiValueFromGivenCharacter {
	
	public int getAsciiFromGivenChar(char charInput) {
		int asciiNumber = charInput;
		return asciiNumber;
	}

	public static void main(String[] args) {
		GetAsciiValueFromGivenCharacter getAsciiValueFromGivenCharacter = new GetAsciiValueFromGivenCharacter();
		// int asciiValue1=getAsciiValueFromGivenCharacter.getAsciiFromGivenChar('A');
		// System.out.println("Ascii value of Given Character is: "+asciiValue1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Character Value of which you want to See Ascii  :");
		String inputCharacter = scanner.next();
		int asciiValue = getAsciiValueFromGivenCharacter.getAsciiFromGivenChar(inputCharacter.charAt(0));
		System.out.println("The ASCII value of Entered Character is  : " + asciiValue);
		scanner.close();
	}

}
