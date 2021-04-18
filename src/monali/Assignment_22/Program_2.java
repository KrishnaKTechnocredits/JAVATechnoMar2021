package monali.Assignment_22;

public class Program_2 {
	
	void getFrequencyOfCharacter(String str, char targetchar) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == targetchar)
				count++;
		}
		System.out.println("freq of char " + targetchar + " is " + count);
	}

	void freqOfAllChar(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (index == word.indexOf(ch))
				getFrequencyOfCharacter(word, word.charAt(index));
		}
	}

	public static void main(String[] args) {
		Program_2 program = new Program_2();
		String word = "completelockdownonweekend";
		program.freqOfAllChar(word);
	}

}
