package ashtha.Assignment21;

import java.util.Scanner;

public class CountCharacters {

	void characterCount (String input) {
		int digitCount = 0;
		int letterCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int specialCharCount = 0;
		
		for (int index=0; index<input.length();index++) {
			int ch = input.charAt(index);
			if(ch >= 48 && ch <= 57) {
				digitCount++;
			}else if (ch >= 65 && ch<=90) {
				upperCaseCount++;
			}else if (ch >= 97 && ch <= 122) {
				lowerCaseCount++;
			}else
				specialCharCount++;
		}
		letterCount = upperCaseCount + lowerCaseCount;
		System.out.println("Output: ");
		System.out.println("Digit count : "+digitCount);
		System.out.println("Letter Count : "+letterCount);
		System.out.println("UpperCase Count : "+upperCaseCount);
		System.out.println("LowerCase Count : "+lowerCaseCount);
		System.out.println("Special Char Count : "+specialCharCount);
	}
	
	public static void main(String[] args) {
		CountCharacters countCharacters = new CountCharacters();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input string");
		String inputString = scanner.next();
		countCharacters.characterCount(inputString);
		scanner.close();
	}
}

