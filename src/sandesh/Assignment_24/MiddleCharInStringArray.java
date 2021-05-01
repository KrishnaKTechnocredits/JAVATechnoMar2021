/*
 Assignment - 24 : 18th April'2021

Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.
 
*/

package sandesh.Assignment_24;

public class MiddleCharInStringArray {
	char ch;
	
	char getMiddleCharacterFromEachString(String inString) {
		if(inString.length() % 2 == 0 && inString.length() != 0)
			ch = inString.charAt(inString.length()/2 - 1);
		else if(inString.length() % 2 != 0)
			ch = inString.charAt(inString.length()/2);
		else 
			ch = 0;
		return ch;
	}
	
	char[] getEachStringFromArray(String[] inArray) {
		char[] middleChar = new char[inArray.length];
		for(int index=0; index<inArray.length; index++) {
			getMiddleCharacterFromEachString(inArray[index]);
			middleChar[index] = ch;
		}
		return middleChar;
	}
	
	public static void main(String[] args) {
		String[] arrayInput = {"", "Techno", "Hello", "Credits", " ", "-+-"};
		char[] middleCharactersArray = new MiddleCharInStringArray().getEachStringFromArray(arrayInput);
		
		for(int index=0; index<arrayInput.length; index++) {
			if(middleCharactersArray[index] != 0)
				System.out.println("Middle character of " + arrayInput[index] + " is -: " + middleCharactersArray[index]);
			else
				System.out.println("Enter Valid String in place of null string -: " + arrayInput[index]);
		}
	}
}
