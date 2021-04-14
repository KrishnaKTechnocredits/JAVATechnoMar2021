package vaibhav.Assignment_18;

import java.util.Scanner;

public class ReturnCharacter {
	
	char getAsciiOfChar(int asciiValue) {
		return (char)asciiValue;
	}
	
	public static void main(String[] args) {
		ReturnCharacter returnCharacter = new ReturnCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the ASCII value to get the corrosponding charater : ");
		int asciiValue = scanner.nextInt();
		
		char ch = returnCharacter.getAsciiOfChar(asciiValue);
		System.out.println("Character corresponding to ASCII value " + asciiValue + " is : " + ch );
		scanner.close();
	}

}
