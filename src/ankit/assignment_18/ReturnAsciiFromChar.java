//Assignment_18 : WAP to print ascii value of a character input

package ankit.assignment_18;

public class ReturnAsciiFromChar {

	int getCharOfAscii(char ch) {
		int asciiValueint = (int)ch;
		return asciiValueint;
	}

	public static void main(String[] args) {
		ReturnAsciiFromChar returnAsciifromChar = new ReturnAsciiFromChar();
		int asciiVal = returnAsciifromChar.getCharOfAscii('A');
		System.out.println("Ascii Value is " + asciiVal);	
	}		
}
