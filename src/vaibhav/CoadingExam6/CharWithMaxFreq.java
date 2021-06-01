/*Coding Exam -  : 14th May'2021 [Complexity : Easy]

Test -6 : 
Find a Character having a maximum frequency.

input : globant india is hiring

output : i
*/

package vaibhav.CoadingExam6;

public class CharWithMaxFreq {

	int maxCount;
	char maxCountChar;
	int count;

	void getMaxCharater(String input) {

		maxCount = 0;
		maxCountChar = input.charAt(0); // ch1 == g

		for (int index = 0; index <= input.length() - 1; index++) { // globant india is hiring
			count = 0;
			for (int iIndex = 0; iIndex <= input.length() - 1; iIndex++) {

				if (index != iIndex) {

					if (input.charAt(index) == input.charAt(iIndex)) {
						count++;
					}
				}
				if (count >= maxCount) {
					maxCount = count;
					maxCountChar = input.charAt(index);
				}

			}

		}

	}

	public static void main(String[] args) {
		CharWithMaxFreq charWithMaxFreq_2 = new CharWithMaxFreq();

		String inputString = "globant india is hiring";
		charWithMaxFreq_2.getMaxCharater(inputString);

		System.out.println("Max count Character is : " + charWithMaxFreq_2.maxCountChar);

	}
}
