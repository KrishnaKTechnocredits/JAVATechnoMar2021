//Assignment - 22 :  16th April'2021
//
//Create a class with following functionality. [Estimated time: 40 mins]
//a) Find one character frequency from given name.
//     Input: name - technocredits
//               character - e
//     Output : e -> 2 time in technocredits

package neha_Rathi.assignment22;

public class FrequencyOfChar {

	void frequencyOfChar(String input, char ch1) {
		int cnt = 0;
		for (int index = 0; index < input.length(); index++) {
			if (ch1 == input.charAt(index))
				cnt++;
		}
		System.out.println(ch1 + " -> " + cnt + " time in " + input);
	}

	void validateAllString(String[] input, char ch) {
		for (int index = 0; index < input.length; index++) {
			frequencyOfChar(input[index], ch);
		}
	}

	public static void main(String[] args) {
		FrequencyOfChar frequencyOfChar = new FrequencyOfChar();
		String[] input1 = { "technocredits" };
		char ch = 'e';
		frequencyOfChar.validateAllString(input1, ch);
	}
}
