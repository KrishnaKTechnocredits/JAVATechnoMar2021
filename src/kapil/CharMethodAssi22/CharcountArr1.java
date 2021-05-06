/*b) Find all character frequency from given name.
Input: name - aakanksha
Output : a -> 4
k -> 2
n -> 1
s -> 1
h -> 1
*/
package kapil.CharMethodAssi22;

public class CharcountArr1 {
	void getCharFreq(String str, char Targetchar) {
		int count = 0;

		int length = str.length();
		for (int index = 0; index < length; index++) {
			if (str.charAt(index) == Targetchar)
				count++;
		}
		System.out.println(" frequency of char  " + Targetchar + " is " + count);
	}

	void getFreqCnts(String word) {
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			if (index == word.indexOf(ch)) {
				getCharFreq(word, word.charAt(index));
			}

		}

	}

	public static void main(String[] args) {
		CharcountArr1 charcountarr1 = new CharcountArr1();
		String word = "aakanksha";
		charcountarr1.getFreqCnts(word);
	}

}
