package neha_Rathi.codingExam5;

public class MaxCharacterFrequency {

	char MaxFrequencyChar(String input) {
		int tempCount = 1;
		char ch2=input.charAt(0);
		int cnt=0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index) {
				cnt=charFreq(input, ch);
			}if (tempCount < cnt) {
				tempCount = cnt;
				ch2=ch;
			}
		}
		return ch2;
	}

	int charFreq(String input, char ch1) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (ch1 == input.charAt(index))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		MaxCharacterFrequency maxCharacterFrequency = new MaxCharacterFrequency();
		String str1= "globant india is hiring";
		String str=str1.replace(" ", "");
		System.out.println("Given input is: "+str1);
		System.out.println("Character with maximum frequency in above input is -> "+maxCharacterFrequency.MaxFrequencyChar(str));

	}

}
