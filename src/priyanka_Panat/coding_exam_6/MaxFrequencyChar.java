/*
 Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.

input : globant india is hiring

output : i
 */

package priyanka_Panat.coding_exam_6;

public class MaxFrequencyChar {
	char getChar(String input) {
		int maxCnt = 0;
		char maxChar = ' ';
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char temp = input.charAt(index);
			for (int innerIndex = index + 1; innerIndex < input.length(); innerIndex++) {
				if (temp == input.charAt(innerIndex)) {
					count++;
				}
				if (count > maxCnt) {
					maxCnt = count;
					maxChar = input.charAt(innerIndex);
				}
			}
		}
		return maxChar;
	}

	public static void main(String[] args) {
		MaxFrequencyChar maxFrequencyChar = new MaxFrequencyChar();
		String inputStr = "globant india is hiring";
		char output = maxFrequencyChar.getChar(inputStr);
		System.out.println("Character having maximum frequency in a given string is : " + output);
	}

}
