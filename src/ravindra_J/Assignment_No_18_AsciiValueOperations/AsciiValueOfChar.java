/*Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
 */

package ravindra_J.Assignment_No_18_AsciiValueOperations;

import java.util.Scanner;

public class AsciiValueOfChar {
	
	static char getAsciiOfChar(int asciiValue) {
		return (char) asciiValue;
		 		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ASCII Value");

		int asciiValue = scanner.nextInt();

		System.out.println(getAsciiOfChar(asciiValue)+" is the character representing the given ASCII Value: "+asciiValue);
		scanner.close();
	}

}
