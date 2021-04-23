//Program 3:  write a method which will print ascii value of A to Z.

package prashant.Assignment_18;

public class AsciiValueAtoZ {

	void asciiAtoZ() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int asciivalue = ch;
			System.out.println(ch + " " + asciivalue);
		}
	}

	public static void main(String[] args) {
		AsciiValueAtoZ getchar = new AsciiValueAtoZ();
		System.out.println("Ascii Values of A to Z alphabets");
		getchar.asciiAtoZ();
	}

}
