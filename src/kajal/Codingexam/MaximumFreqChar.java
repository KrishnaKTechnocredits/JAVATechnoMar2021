/*
 * Test -6 : [Complexity : Easy]
Find a Character having a maximum frequency.
input : globant india is hiring
output : i
 */
package kajal.Codingexam;

public class MaximumFreqChar {

	char maxfreq(String input) {
		int cnt = 0;
		int maxCnt = 0;
		char ch = ' ';

		for (int index = 0; index < input.length(); index++) {
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {

				if (input.charAt(index) == input.charAt(innerIndex))
					cnt++;
			}
			if (maxCnt < cnt) {
				maxCnt = cnt;
				cnt = 0;
				ch = input.charAt(index);
			} else
				cnt = 0;
		}
		return ch;
	}

	public static void main(String[] args) {
		String input = "globant india is hiring";
		char output = new MaximumFreqChar().maxfreq(input);
		System.out.println("Max frequency of character from given string" + output);
	}
}
