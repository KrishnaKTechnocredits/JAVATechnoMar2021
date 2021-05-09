package ashish_Vyas.Assignment_22;

public class FindFrequenciesOfChars {

	void findFrequencyOfCharInString(String name, char ch) {
		int charCount = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch)
				charCount++;
		}
		System.out.println("Frequency of " + ch + " in " + name + " is " + charCount);
	}

	void findFrequencyOfcharsInString(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (name.indexOf(ch) == index)
				findFrequencyOfCharInString(name, ch);
		}
	}

	void findFrequencyOfCharsInStringArray(String[] names) {
		for (int index = 0; index < names.length; index++) {
			findFrequencyOfcharsInString(names[index]);
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		FindFrequenciesOfChars findFrequenciesOfChars = new FindFrequenciesOfChars();
		findFrequenciesOfChars.findFrequencyOfCharInString("technocredits", 'e');
		System.out.println();
		findFrequenciesOfChars.findFrequencyOfcharsInString("ashish");
		System.out.println();
		String[] names = { "raj", "aarya", "aavruti", "shruti" };
		findFrequenciesOfChars.findFrequencyOfCharsInStringArray(names);
	}
}