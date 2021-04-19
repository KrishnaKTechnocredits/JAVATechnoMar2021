package sai.Assignment18;

/*
 * Program 3:  write a method which will print ascii value of A to Z.
 */

public class AsciiAZ {

	public static void main(String[] args) {
		AsciiAZ asciiAZ = new AsciiAZ();
		System.out.println("ASCII Values for A to Z is as follows ");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int value = asciiAZ.getAscii(ch);
			System.out.println(ch + ":" + value);
		}

	}

	int getAscii(char ch) {
		return ch;
	}

}
