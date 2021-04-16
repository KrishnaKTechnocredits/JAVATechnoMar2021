/*Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
*/
package sourabh.stringExamples;

public class FindAsciiValue {
	int getAsciiOfChar(char ch) {
		return ch;
	}
	public static void main(String[] args) {
		FindAsciiValue findAsciiValue= new FindAsciiValue();
		int asciiValue= findAsciiValue.getAsciiOfChar('Z');
		System.out.println("Ascii value of z is: "+asciiValue);
	}
}
