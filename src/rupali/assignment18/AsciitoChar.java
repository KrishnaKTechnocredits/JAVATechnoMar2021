/*
 * Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

 */
package rupali.assignment18;


public class AsciitoChar {
	
	char getAsciiofChar(int temp) {
		char c=(char)temp;
		return c;
	}
	public static void main(String[] args) {
		AsciitoChar asciitoChar=new AsciitoChar();
		int i=0;
		System.out.println("Ascii value for 'A' is:");
		i=asciitoChar.getAsciiofChar(65);
		System.out.println(i);
		System.out.println("Ascii value for 'g' is:");
		i=asciitoChar.getAsciiofChar(103);
		System.out.println(i);
		System.out.println("Ascii value for '8' is:");
		i=asciitoChar.getAsciiofChar(56);
		System.out.println(i);
		
	}


}
