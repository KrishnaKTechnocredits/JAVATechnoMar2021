package kangan.Coding.Exam6;

/*Find a Character having a maximum frequency.
input : globant india is hiring
output : i*/

public class CharMaxFrequency {

	char getCharWithMaxFreq(String input) {
		int maxFreq = 0;
		char maxFreqChar = input.charAt(0);

		int length = input.length() - 1;
		while (length >= 0) {
			char ch = input.charAt(length);
			int initialLength = input.length();
			String input1 = input.replace(String.valueOf(ch), "");
			int newLength = input1.length();
			int temp = initialLength - newLength;
			if (temp > maxFreq) {
				maxFreq = temp;
				maxFreqChar = ch;
			}
			length--;
		}
		return maxFreqChar;
	}

	char getCharWithMaxFreq1(String input) {
		int maxFreq = 0;
		char maxFreqChar = input.charAt(0);

		int length = input.length() - 1;
		do {
			char ch = input.charAt(length);
			int initialLength = input.length();
			String input1 = input.replace(String.valueOf(ch), "");
			int newLength = input1.length();
			int temp = initialLength - newLength;
			if (temp > maxFreq) {
				maxFreq = temp;
				maxFreqChar = ch;
			}

			length--;
		} while (length >= 0);
		return maxFreqChar;
	}

	public static void main(String[] args) {
		CharMaxFrequency charMaxFrequency = new CharMaxFrequency();
		char output = charMaxFrequency.getCharWithMaxFreq1("nngnlobant india isn hiringi");
		System.out.println(output);
	}
}
