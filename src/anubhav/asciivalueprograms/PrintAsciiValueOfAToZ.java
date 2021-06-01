package anubhav.asciivalueprograms;

/*Program 3: write a method which will print ascii value of A to Z*/

public class PrintAsciiValueOfAToZ {

	public void asciiValueOfAToZ() {
		for (char character = 'a'; character <= 'z'; character++) {
			int ascii = (int)character;
			System.out.println("ASCII value correspong to character " + character + " is " + ascii);
		}
	}
	
	public static void main(String[] args) {
		PrintAsciiValueOfAToZ printAsciiValueOfAToZ= new PrintAsciiValueOfAToZ();
		printAsciiValueOfAToZ.asciiValueOfAToZ();
	}
}