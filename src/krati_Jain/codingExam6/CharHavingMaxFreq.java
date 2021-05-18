/*Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.
input : globant india is hiring
output : i*/

package krati_Jain.codingExam6;

public class CharHavingMaxFreq {

	int count = 0;
	int tempCount = 0;
	char maxFreqChar = ' ';

	public static void main(String[] args) {
		String inputStr = "globant is hiring indiaiiii   ";
		CharHavingMaxFreq charHavingMaxFreq = new CharHavingMaxFreq();
		System.out.println(charHavingMaxFreq.getCharFreq(inputStr));
	}

	String getCharFreq(String inputStr) {
		char charToVerify = ' ';
		for (int index = 0; index < inputStr.length(); index++) { // globant india is hiring
			charToVerify = inputStr.charAt(index); // l
			if (inputStr.indexOf(charToVerify) == index && charToVerify != ' ')
				processChar(inputStr, charToVerify);
		}
		return "Max Freq Char is '" + maxFreqChar + "' with frequency : " + count;
	}

	void processChar(String inputStr, char charToVerify) {
		int tempCount = 0;
		char finalChar = ' ';
		int finalFreq = 0;
		for (int innerIndex = 0; innerIndex < inputStr.length(); innerIndex++) {
			if (charToVerify == inputStr.charAt(innerIndex)) {
				tempCount++;
			}
			if (tempCount > count) {
				count = tempCount;
				maxFreqChar = charToVerify;
			}
		}
		finalChar = maxFreqChar;
		finalFreq = count;
		tempCount = 0;
	}
}
