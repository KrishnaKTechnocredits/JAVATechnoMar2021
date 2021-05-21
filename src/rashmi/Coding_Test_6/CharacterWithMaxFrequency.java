/*Test -6 : [Complexity : Easy]

Find a Character having a maximum frequency.

input : globant india is hiring

output : i*/

package rashmi.Coding_Test_6;

public class CharacterWithMaxFrequency {

	public void maxFrequencyChar(String str) {

		int maxCount = 0;
		int freqCount = 0;
		char maxCh = '0';

		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);

			if (str.lastIndexOf(ch) != index) {

				for (int innerIndex = index + 1; innerIndex < str.length(); innerIndex++) {

					if (str.charAt(innerIndex) == ch) {
						freqCount++;
					}
				}
				if (freqCount > maxCount) {
					maxCount = freqCount;
					freqCount = 0;
					maxCh = ch;
				}
			}

		}

		System.out.println("Character having maximum frequency : " + maxCh);
	}

	public static void main(String[] args) {
		new CharacterWithMaxFrequency().maxFrequencyChar("globant india is hiring");
	}

}
