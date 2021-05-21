/*Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25*/

package krati_Jain.Assignment_25;

import java.util.Scanner;

public class StringWithNumbers {

	public static void main(String[] args) {

		StringWithNumbers stringWithNumbers = new StringWithNumbers();

		String[] inputStr = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] arrString = stringWithNumbers.getStringWithNum(inputStr);

		System.out.println("Strings in the array with atleast 1 number in them are : ");
		for (int index = 0; index < arrString.length; index++) {
			if (arrString[index] != null)
				System.out.println(arrString[index]);

		}
	}

	String[] getStringWithNum(String[] inputStr) {

		String[] arrWithNums = new String[5];
		int arrIndex = 0;
		for (int index = 0; index < inputStr.length; index++) { // 3 = Krishna
			boolean digitFlag = false;
			for (int innnerindex = 0; innnerindex < inputStr[index].length(); innnerindex++) {

				char chartoCheck = inputStr[index].charAt(innnerindex); // HP1w
				if (Character.isDigit(chartoCheck)) {
					digitFlag = true;
					break;
				}

			}
			if (digitFlag == true) {
				arrWithNums[arrIndex] = inputStr[index];
				arrIndex++;
			}

		}

		return arrWithNums;

	}

}
