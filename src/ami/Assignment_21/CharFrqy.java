/*
 * a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits
 */

package ami.Assignment_21;

public class CharFrqy {
	int count = 0;

	void feqOfChar(String input, char ch) {
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequence of Character :" + count);
	}

	public static void main(String[] a) {
		CharFrqy freqofchar = new CharFrqy();
		String input = "technocredits";
		freqofchar.feqOfChar(input, 'e');
	}

}
