package krishna.Assignment_18;
//Program 3:  Write a method which will print ASCII value of A to Z.

import java.util.Scanner;

public class AtoZReturnAscii {
	static char ch;
	int asciivalueofAtoZ(char ch) {
		int value = ch;
		return value;
	}
	public static void main(String[] args) {
		AtoZReturnAscii atoZReturnAscii = new AtoZReturnAscii();
		Scanner scanner = new Scanner(System.in);
		char ch;
		System.out.println("For getting ASCII value from A to Z. Please enter the character A :");
		ch = scanner.next().charAt(0);
		for (int index=0;index<26;index++) {// Assuming I don't know the ASCII value of A
			int value = atoZReturnAscii.asciivalueofAtoZ(ch);
			System.out.println("Ascii value is of "+ch+" is " + value);
			System.out.println("--------------------------------");
			ch++;
		}
		
	}

}
