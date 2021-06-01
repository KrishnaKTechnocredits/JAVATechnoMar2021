package ashish_Vyas.Assignment_18;
/*Assignemnt_18*/
import java.util.Scanner;
public class AsciiValue {

	int getAsciiOfChar(char ch) {
		int ascii_Char = ch;
		return ascii_Char;
	}

	char getCharOfAscii(int asciiValue) {
		char char_Ascii = (char) asciiValue;
		return char_Ascii;
	}

	void printAsciiVale() {
		System.out.println("===========");
		char ch = 'A';
		int asciiValue = ch;
		int endIndex = ch + 25;
		for (; asciiValue <= endIndex; asciiValue++) {
			System.out.println("Ascii value for " + (char) asciiValue + " : " + asciiValue);
		}
	}

	void printCharacter() {
		System.out.println("=============");
		for (int num = 97; num <= 122; num++) {
			char ch = (char) num;
			System.out.println("Character for the ascii value " + num + " : " + ch);
		}
	}

	public static void main(String[] args) {
		AsciiValue asciiValue = new AsciiValue();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character for which you want to print the ascii value");
		char character = scanner.next().charAt(0);
		System.out.println("Ascii value for " + character + " : " + asciiValue.getAsciiOfChar(character));
		System.out.println("Enter the number for which you want to print the character");
		int number = scanner.nextInt();
		System.out.println("Character for the Ascii value " + number + " : " + asciiValue.getCharOfAscii(number));
		asciiValue.printAsciiVale();
		asciiValue.printCharacter();
		scanner.close();
	}
}