/*
 Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
 */
package neha_Patil.Assignment_18;

public class AsciiOfChar {
	
	int getAsciiOfChar(char ch) {
		
		int asciivalue = ch;  
	 System.out.println("The ASCII value of " + ch + " is: " + asciivalue);  
	 
		return asciivalue;
		

	}

	public static void main(String[] args) {
		AsciiOfChar asciiOfChar = new AsciiOfChar();
		asciiOfChar.getAsciiOfChar('n');

	}

}


