package krishna.Assignment_24;

import java.util.Scanner;
/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d
Note:  for name having even length, consider length/2-1 index is middle character.
*/
public class ReturnMiddleCharacter {

	char[] middleCharacter(String[] givenString) {
		char[] output = new char[givenString.length];
		for (int index = 0; index < givenString.length; index++) {
			if (givenString[index].length() % 2 == 0) {
				output[index]= givenString[index].charAt(givenString[index].length()/2-1);
			} else {
				output[index]= givenString[index].charAt(givenString[index].length()/2);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnMiddleCharacter returnMiddleCharacter = new ReturnMiddleCharacter();
		int size;
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many names you want to enter: ");
		size = scanner.nextInt();
		String[] givenString = new String[size];

		for (int index = 0; index < size; index++) {
			System.out.println("Enter the names :");
			givenString[index] = scanner.next();

		}
		returnMiddleCharacter.middleCharacter(givenString);
		// String[] givenString = new String[] { "Techno", "Hello", "Credits" };
		char[] midChar = returnMiddleCharacter.middleCharacter(givenString);
		
		for(int midCharIndex=0;midCharIndex<midChar.length;midCharIndex++) {
			System.out.println("The mid character is :"+midChar[midCharIndex]);
		}
		
	}

}
