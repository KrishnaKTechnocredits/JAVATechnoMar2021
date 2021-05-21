//Program 4:  write a program which will print characters between ascii value 97 to 122.
package prashant.Assignment_18;

public class CharAsciiRange {

	void charAscii() {
		for (int ascii = 97; ascii <= 122; ascii++) {
			char ch = (char) ascii;
			System.out.println(ascii + " " + ch);
		}
	}

	public static void main(String[] args) {
		CharAsciiRange getascii = new CharAsciiRange();
		System.out.println("Characters between ascii value 97 to 122");
		getascii.charAscii();
	}
}
