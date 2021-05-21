/*Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g*/

package simmi.exam10;

public class FirstNonRepeatedChar {
	void nonRepeating(String input) {
		String output = "";

		for (int index = 0; index < input.length(); index++) {
			boolean isFlag = false;
			if (index == input.indexOf(input.charAt(index))) {

				for (int innerIndex = index + 1; innerIndex < input.length(); innerIndex++) {
					if (input.charAt(index) == input.charAt(innerIndex)) {
						isFlag = true;
						break;
					}
				}
			}
			if (!isFlag) {
				output = output + input.charAt(index);
				break;
			}

		}
		System.out.println("first non-repeated character of String is "+ output);
	}

	public static void main(String[] args) {
		String input = "abcgbca";
		new FirstNonRepeatedChar().nonRepeating(input);
	}
}
