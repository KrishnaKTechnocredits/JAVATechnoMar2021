package madhavi_Raut.Assignment_18;
///Program 3: write a method which will print Ascii value of A to Z.

public class PrintAsciiValueOfCharacters {
	void displayAsciiValueOfCharacters(char startChar, char endChar) {
		System.out.println("Below is the Ascii value from " + startChar + " to " + endChar + ":");
		for (char ch = startChar; ch <= endChar; ch++) {
			System.out.println("Ascii value of " + ch + " is " + (int) ch);
		}
	}

	public static void main(String[] args) {
		new PrintAsciiValueOfCharacters().displayAsciiValueOfCharacters('A', 'Z');
	}
}
