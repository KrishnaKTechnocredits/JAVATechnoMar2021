package kangan.Coding.Exam6;

/*Find a Character having a maximum frequency.
input : globant india is hiring
output : i*/

public class CharMaxFrequency {

	char getCharWithMaxFreq(String input) {
		int maxFreq = 0;
		char maxFreqChar = input.charAt(0);
		
      int length = input.length()-1;
		while (length>=0) {
			char ch = input.charAt(length);
			int initialLength = input.length();
			String input1 = input.replace(String.valueOf(ch),"");
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

	public static void main(String[] args) {
		CharMaxFrequency charMaxFrequency = new CharMaxFrequency();
		char output = charMaxFrequency.getCharWithMaxFreq("ngnlobant india isn hiringi");
		System.out.println(output);
	}
}
