package krishna.Assignment_18;

import java.util.Scanner;

public class ASCIIValFind {

	char getAsciiOfChar(int asciiValue) {
		char ch = (char) asciiValue;
		return ch;
	}

	public static void main(String[] args) {
		ASCIIValFind aSCIIValFind = new ASCIIValFind();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start value to find want ASCII char :");
		int start = scanner.nextInt();
		System.out.println("Enter the end value to find want ASCII char :");
		int end = scanner.nextInt();

		for (int index = start; index <= end; index++) {
			char ch = aSCIIValFind.getAsciiOfChar(index);
			System.out.println("Ascii character for value " + index + " is " + ch);
			System.out.println("--------------------------------");
			// index++;
		}
	}
}
