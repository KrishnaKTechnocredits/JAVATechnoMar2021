package sai.Assignment22;

/*
 * a) Find one character frequency from given name.
     Input: name - technocredits
               character - e
     Output : e -> 2 time in technocredits

 */

public class CharFreq {

	public static void main(String[] args) {
		CharFreq charFreq = new CharFreq();
		charFreq.charFrequency("technocredits", 'e');
	}

	void charFrequency(String name, char targetChar) {
		int charCount = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == targetChar) {
				charCount++;
			}
		}
		System.out.println(targetChar + "-->" + charCount + " times in " + name);
	}
}
