//Assignment24 middle char in String Array
package neha_Rathi.assignment24;

public class MiddleChar {

	void findMiddleChar(String input) {
		int index1 = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.length() % 2 == 0)
				index1 = (input.length() / 2 - 1);
			else
				index1 = input.length() / 2;
		}
		System.out.println(input.charAt(index1));
	}

	void findMiddleCharInArray(String[] input) {
		for (int index = 0; index < input.length; index++) {
			String input1 = input[index];
			findMiddleChar(input1);
		}
	}

	public static void main(String[] args) {
		MiddleChar middleChar = new MiddleChar();
		String[] input = { "Techno", "Hello", "Credits" };
		middleChar.findMiddleCharInArray(input);
	}
}
