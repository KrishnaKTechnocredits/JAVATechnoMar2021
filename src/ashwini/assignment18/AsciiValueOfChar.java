package ashwini.assignment18;
/*
 Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

 */

public class AsciiValueOfChar {
	char charecter;
	int getAsciiOfChar(char ch) {
		charecter = ch;
		int asciivalue = ch;  
		//int asciivalue2 = ch2;  
		System.out.println("The ASCII value of " + ch + " is: " + asciivalue);  
		//System.out.println("The ASCII value of " + ch2 + " is: " + asciivalue2);  
		return asciivalue;
		//return asciivalue2;
	
	}

	public static void main(String[] args) {
		AsciiValueOfChar asciiValueOfChar = new AsciiValueOfChar();
		asciiValueOfChar.getAsciiOfChar('a');

	}

}
