package sandesh.coding_exam_6;

public class MaxFrequencyCharacter {

	int index;

	int getFreqOfEachChar(char eachChar, String str) {
		int countOfChar = 0;
		for (int innerIndex = index; innerIndex < str.length(); innerIndex++) {
			if (str.charAt(innerIndex) == eachChar)
				countOfChar++;
		}
		return countOfChar;
	}

	char getMaxFreq(String input) {
		String normalisedInp = input.trim().toLowerCase();
		int tempMax = 0;
		char maxFreqChar = ' ';
		int[] freqOfChar = new int[normalisedInp.length()];
		for (index = 0; index < normalisedInp.length(); index++) {
			if (index == normalisedInp.indexOf(normalisedInp.charAt(index))) {
				freqOfChar[index] = getFreqOfEachChar(normalisedInp.charAt(index), normalisedInp);
				if (tempMax < freqOfChar[index]) {
					tempMax = freqOfChar[index];
					maxFreqChar = normalisedInp.charAt(index);
				}
			}
		}
		return maxFreqChar;

	}

	public static void main(String[] args) {
		String input = "globant india is hiring";
		char maxCh = new MaxFrequencyCharacter().getMaxFreq(input);
		System.out.print("Maximum Character repeated in given String is -: ");
		System.out.print(maxCh);
	}
}
