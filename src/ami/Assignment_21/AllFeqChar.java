/*
b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1

 */

package ami.Assignment_21;

public class AllFeqChar {

	int count = 0;

	void feqOfChar(String input, char ch) {
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequence of " + ch + " :" + count);
	}

	void allCharFreq(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch))
				feqOfChar(str, str.charAt(index));
		}
	}

	public static void main(String[] a) {
		AllFeqChar allFeqChar = new AllFeqChar();
		String word = "aakanksha";
		allFeqChar.allCharFreq(word);
	}

}
