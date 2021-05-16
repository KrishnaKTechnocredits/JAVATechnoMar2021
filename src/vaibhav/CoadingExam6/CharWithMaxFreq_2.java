/*Coding Exam -  : 14th May'2021 [Complexity : Easy]

Test -6 : 
Find a Character having a maximum frequency.

input : globant india is hiring

output : i
*/

//***************************************//
//******* Maulik's Logic ****************//
//***************************************//

package vaibhav.CoadingExam6;

public class CharWithMaxFreq_2 {

	char getMaxFreqChar(String input) {
		int maxFreq = 0;
		char maxChar = input.charAt(0);

		while (input.length() > 0) {
			char ch = input.charAt(0);
			int origianlLength = input.length();
			input = input.replaceFirst(input.valueOf(ch), "");
			int newLength = input.length();
			int charFreq = origianlLength - newLength;

			if (charFreq > maxFreq) {
				maxFreq = charFreq;
				maxChar = ch;
			}
		}
		return maxChar;
	}

	public static void main(String[] args) {
		CharWithMaxFreq_2 charWithMaxFreq_2 = new CharWithMaxFreq_2();

		String input = "globant india is hiring";
		char charWithMaxFreq = charWithMaxFreq_2.getMaxFreqChar(input);
		System.out.println("Max count Character is : " + charWithMaxFreq);
	}

}
