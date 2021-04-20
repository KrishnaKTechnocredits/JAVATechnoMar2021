/*Java Assignment 25:  18th April'2021

2.	Program 2: Write a method which will return all String from given array
which contains atleast one number. Main method should print the output.
Input: {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output: HP1w Pd3R4K9 Aashvi25

*/

package vaibhav.Assignment_25;

public class StringWithAtLeastOneNum {

	static int strCount;
	static int chCount;

	boolean isStringHasNum(String str) {
		chCount = 0;
		boolean numFlag = false;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				chCount++;
				numFlag = true;
				break;
			}
		}
		return numFlag;
	}

	String[] getStringArr(String[] inputArr) {
		String[] outputArr = new String[inputArr.length];

		for (int index = 0; index < inputArr.length; index++) {
			String str = inputArr[index];

			if (isStringHasNum(str)) {
				outputArr[strCount] = str;
				strCount++;
			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		StringWithAtLeastOneNum stringWithAtLeastOneNum = new StringWithAtLeastOneNum();
		String[] inputStr = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };

		String[] outputArr = stringWithAtLeastOneNum.getStringArr(inputStr);

		System.out.println("From given array,below are the strings which contains atleast one number in string ");
		System.out.println("");
		System.out.print("Output --> ");

		for (int index = 0; index < strCount; index++) {
			System.out.print(outputArr[index] + " ");
		}
	}
}
