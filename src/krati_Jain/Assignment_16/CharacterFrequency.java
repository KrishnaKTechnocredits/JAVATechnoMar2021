/*Find the frequency of character from a given String array.
Note: Take String and character from the user using scanner class.*/

package krati_Jain.Assignment_16;

import java.util.Scanner;

public class CharacterFrequency {
		
	int count;
	void inputString(String inputStr, char characterChosen) {

		String inString = inputStr.toLowerCase();

		
		for(int index = 0; index < inString.length(); index++) {
			if (inString.charAt(index) == characterChosen) 
			count++;
			}
		System.out.println("Frequency of '"+characterChosen+"'" + " in your string is " + count);
				
		}
		
	

	public static void main(String[] args) {
		
		CharacterFrequency CharFre = new CharacterFrequency();
		Scanner scn = new Scanner(System.in);
		System.out.println("Input a String of your choice- ");
		String inputStr = scn.nextLine();
		System.out.println("Write down which character's frequency you want to check in your string provided?");
		char characterChosen = scn.next().charAt(0); 
		CharFre.inputString(inputStr, characterChosen);
	}

}
