/*Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d

Note:  for name having even length, consider length/2-1 index is middle character.*/

package krati_Jain.Assignment_24;

import java.util.Scanner;

public class MiddleCharacterString {

	public static void main(String[] args) {
		MiddleCharacterString middleCharStr = new MiddleCharacterString();

		Scanner scn = new Scanner(System.in);
		System.out.println("Provide the length of the array you want to create? (should be a whole number) : ");
		int len = scn.nextInt();
		String[] tempArr = new String[len];
		System.out.println("Enter the elements of array");
		for (int index = 0; index < len; index++) {
			tempArr[index] = scn.next();
		}

		middleCharStr.getMiddleCharInString(tempArr);

	}

	void getMiddleCharInString(String[] tempArr) {
		int index = 0;
		int middCharIndex = 0;
		for (index = 0; index < tempArr.length; index++) {
			String tempString = tempArr[index];
			if (tempString.length() % 2 == 0)
				middCharIndex = (tempString.length() / 2 - 1);
			else
				middCharIndex = tempString.length() / 2;

			char ch = tempString.charAt(middCharIndex);
			System.out.println("Middle Character of " + tempArr[index] + " is : " + ch);

		}
	}

}
