package prachi.Assignment_18;

//Program 3:  write a method which will print ascii value of A to Z.

public class Ascii_Three {
	

	int printAsciiValues(char ch) {
		return ch;
	}
	
	public static void main(String[] args) {
		Ascii_Three asThree = new Ascii_Three();
		for(char ch = 'A'; ch <= 'Z'; ch++) {
			int value = asThree.printAsciiValues(ch);
			System.out.println("Ascii value of " +ch+ " is " +value );
		}
	}
}