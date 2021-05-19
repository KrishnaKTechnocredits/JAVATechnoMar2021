/*Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.

input : globant india is hiring

output : i

*/

package ankit.coding_exam_6;

public class FindCharWithMaxFrequency {
	
	private int  getCharacterFrequencey(String str , char ch) {
		int freqOfCharacter = 0;
		for(int index = 0 ; index < str.length(); index++) {
			if(ch == str.charAt(index)) {
				freqOfCharacter++;
			}
		}
		return freqOfCharacter;
	}

	public char maxFrequencyCharacterInString(String str) {
		int freqCount = 0, maxfrequency =0;
		char maxFreqChar = ' ';
		for(int index = 0 ; index < str.length(); index++) {
			freqCount = getCharacterFrequencey(str, str.charAt(index));
			if (freqCount > maxfrequency) {
				maxfrequency = freqCount;
				maxFreqChar = str.charAt(index);
			}
		}
		return maxFreqChar;
	}
	public static void main(String[] args) {
		String str = "globant india is hiring";
		FindCharWithMaxFrequency findCharWithMaxFrequency = new FindCharWithMaxFrequency();
		System.out.println(findCharWithMaxFrequency.maxFrequencyCharacterInString(str));
	}
}
