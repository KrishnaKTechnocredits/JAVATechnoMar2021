package dhanshri.Assignment_18;

public class CharacterValuesOfAscii {
	void asciiValues() {
		for (char num = 97; num <= 122; num++) {
			char ch1 = num;
			System.out.println(ch1);
		}
	}

	public static void main(String[] args) {
		new CharacterValuesOfAscii().asciiValues();

	}
}
