package shivani.Assignment_18;
//Program 4:  write a program which will print characters between ascii value 97 to 122.

public class PrintCharOFAscii {
	void displayChar() {
		for (int i = 97; i <= 122; i++) {
			System.out.println((char) i + " = " + " Ascii" + " " +i);
		}
    }

	public static void main(String[] args) {
		PrintCharOFAscii printCharOFAscii = new PrintCharOFAscii();
		printCharOFAscii.displayChar();
	}

}
