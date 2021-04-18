/*
 * Assignment 18 : 14th April'2021
Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

 */
package rupali.assignment18;


public class ChartoAscii {
	
	int getAsciiofChar(char c) {
		int temp=0;
		temp=c;
		return temp;
	}
	public static void main(String[] args) {
		ChartoAscii chartoAscii=new ChartoAscii();
		int i=0;
		System.out.println("Ascii value for 'A' is:");
		i=chartoAscii.getAsciiofChar('A');
		System.out.println(i);
		System.out.println("Ascii value for 'g' is:");
		i=chartoAscii.getAsciiofChar('g');
		System.out.println(i);
		System.out.println("Ascii value for '8' is:");
		i=chartoAscii.getAsciiofChar('8');
		System.out.println(i);
		
	}

}
