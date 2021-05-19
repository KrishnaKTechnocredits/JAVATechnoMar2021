package kangan.Coding.Exam6;

/*Find a Character having a maximum frequency.
input : globant india is hiring
output : i*/

public class MaxFreqChar {

	int getMaxFreqCount(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch1 = input.charAt(index);
			if (ch1 == ch) {
				count++;
			}
		}
		return count;
	}

	char getMaxFreqChar(String input) {
		int maxCharCount = 0;
		char maxFreqChar = input.charAt(0);
		for (int index = 0; index < input.length(); index++) {
			 char ch = input.charAt(index);
			int temp = getMaxFreqCount(input, ch);
			if (temp > maxCharCount) {
				maxCharCount = temp;
				maxFreqChar = ch;
			}
		}
		return maxFreqChar;
	}

	public static void main(String[] args) {
		MaxFreqChar maxFreqChar = new MaxFreqChar();
		char output = maxFreqChar.getMaxFreqChar("globant india is hiring");
		System.out.println(output);
	}
}
