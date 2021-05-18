/*Assignment 18 : 14th April'2021
 * Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
 */

package sourabh.stringExamples;

public class FindAsciiOfChar {
	 char getAsciiOfChar(int asciiValue) {
		 return (char) (asciiValue);
	 }
	 public static void main(String[] args) {
		 FindAsciiOfChar findAsciiOfChar= new FindAsciiOfChar();
		 char ch= findAsciiOfChar.getAsciiOfChar(65);
		 System.out.println("Character of 65 Ascii value is: "+ch);
	 }

}
