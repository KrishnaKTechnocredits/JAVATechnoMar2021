package monali.Assignment_22;

public class Program_3 {
	
	void getFrequencyOfCharacter(String str, char targetchar) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == targetchar)
				count++;
		}
		System.out.println("frequency of char in String " + targetchar + "->" + count);

	}

	void freqOfAllChar(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (index == word.indexOf(ch))
				getFrequencyOfCharacter(word, word.charAt(index));
		}
	}

	void getFreqOfName(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String name = arr[index];
			freqOfAllChar(name);
		}
	}

	public static void main(String[] args) {
		Program_3 program = new Program_3();
		String arr[] = { "saurav", "vaishali" };
		program.getFreqOfName(arr);
	}

}
