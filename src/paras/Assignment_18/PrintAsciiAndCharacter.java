/*
Program 3: write a method which will print ascii value of A to Z.

Program 4: write a program which will print characters between ascii value 97 to 122.
 */

package paras.Assignment_18;

public class PrintAsciiAndCharacter {

	void printAsciiOfCharacter() {
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			int output = (int) ch;
			System.out.println("Ascii of " + ch + " is - " + output);
		}
	}
	
	void printCharOfAscii() {
		System.out.println("------------------------------------------------");
		for(int num = 97 ; num <= 122 ; num++) {
			char ch = (char) num;
			System.out.println("Character of Ascii number " + num + " is - " + ch);
		}
	}
	
	public static void main(String[] args) {
		PrintAsciiAndCharacter printAsciiAndCharacter = new PrintAsciiAndCharacter();
		printAsciiAndCharacter.printAsciiOfCharacter();
		printAsciiAndCharacter.printCharOfAscii();
	}
}

