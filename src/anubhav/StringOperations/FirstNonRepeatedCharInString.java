package anubhav.StringOperations;

/*Print the first non-repeated character of String.
		Input : abcgbca
		output : g
 */

public class FirstNonRepeatedCharInString {

	void firstUnique(String input) {

		for (int index = 0; index < input.length(); index++) {
			boolean notUniqueChar = false;
			for (int innerIndex = index + 1; innerIndex < input.length(); innerIndex++)
				if (input.charAt(index) == input.charAt(innerIndex)) {
					notUniqueChar = true;
				}
			if (!notUniqueChar) {
				char unique = input.charAt(index);
				System.out.println("First unique character in the string is : " + unique);
				break;
			}
		}
	}

	public static void main(String[] args) {
		FirstNonRepeatedCharInString firstNonRepeatedCharInString = new FirstNonRepeatedCharInString();
		String input = "abcgbca";
		firstNonRepeatedCharInString.firstUnique(input);
	}

}
