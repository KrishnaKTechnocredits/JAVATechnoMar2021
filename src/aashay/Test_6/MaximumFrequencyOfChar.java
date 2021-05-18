package aashay.Test_6;
/*
 * Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.

input : globant india is hiring

output : i
 */

public class MaximumFrequencyOfChar {

	char maxFrequency(String input) {
		int maxCnt = 0;
		int tempCnt = 0;
		char ch=' ';

		for (int index = 0; index < input.length(); index++) {
			char temp = input.charAt(index);

			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if (temp == input.charAt(innerIndex))
					tempCnt++;
			}
			if (maxCnt < tempCnt) {
				maxCnt = tempCnt;
				tempCnt=0;
				ch = temp;
			}else {
				tempCnt=0;
			}

		}

		return ch;
	}

	public static void main(String[] args) {
		MaximumFrequencyOfChar maximumFrequencyOfChar = new MaximumFrequencyOfChar();
		String input = "globant india is hiring";
		char maxFrequencyChar = maximumFrequencyOfChar.maxFrequency(input);
		System.out.println("Maximum frequency character : " + maxFrequencyChar);

	}

}
