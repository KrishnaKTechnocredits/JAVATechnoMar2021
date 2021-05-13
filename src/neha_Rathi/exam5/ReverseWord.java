package neha_Rathi.exam5;

public class ReverseWord {
	StringBuffer finalstr = new StringBuffer();

	void calcReverseWord(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char tempChar = input.charAt(index);
			temp += tempChar;
			if (tempChar == ' ') {
				finalstr.append(reverStr(temp));
				temp = "";
			}
		}
		System.out.print(finalstr.toString().trim());
	}

	StringBuffer reverStr(String temp) {
		StringBuffer sb1 = new StringBuffer(temp);
		return sb1.reverse();
	}

	public static void main(String[] args) {
		ReverseWord reverseWord = new ReverseWord();
		reverseWord.calcReverseWord("hi hello how are you");
	}
}
