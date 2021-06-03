/*
 * 
 Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

*/
package ami.Assignment_18;

public class ReturnAsciiVal {

	int getAsciiOfChar(char ch) {
		int asciiValue = ch;
		return asciiValue;
	}

	public static void main(String[] args) {
		ReturnAsciiVal retn = new ReturnAsciiVal();
		System.out.println("ASCII VALUE: " + retn.getAsciiOfChar('a'));

	}
}
