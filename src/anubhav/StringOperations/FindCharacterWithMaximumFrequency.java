package anubhav.StringOperations;

public class FindCharacterWithMaximumFrequency {
	int count;

	// find maximum frequency of character
	int maxCharFreq(String input, char ch) {
		count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		// System.out.println(count);
		return count;
	}

	// find character with maximum frequency
	char maxFreqCharInString(String str) {
		int freqCount = 0, maxFreq = 0;
		char maxFreqChar = ' ';
		for (int stringIndex = 0; stringIndex < str.length(); stringIndex++) {
			freqCount = maxCharFreq(str, str.charAt(stringIndex));
			if (freqCount > maxFreq) {
				maxFreq = freqCount;
				maxFreqChar = str.charAt(stringIndex);
			}
		}
		return maxFreqChar;
	}

	public static void main(String[] args) {
		FindCharacterWithMaximumFrequency findCharacterWithMaximumFrequency = new FindCharacterWithMaximumFrequency();
		// findCharacterWithMaximumFrequency.maxCharFreq("globant india is hiring", 'i');
		String str = "globant india is hiring";
		findCharacterWithMaximumFrequency.maxFreqCharInString(str);
		char output = findCharacterWithMaximumFrequency.maxFreqCharInString(str);
		System.out.println("Character with highest frquency in the staring is : " + output);
	}
}
