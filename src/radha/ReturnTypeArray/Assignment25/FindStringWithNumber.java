/*
Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 */
package radha.ReturnTypeArray.Assignment25;

public class FindStringWithNumber {

	String[] findStringWithNumber(String[] str) {
		String[] output = new String[str.length];
		for (int index = 0; index < str.length; index++) {
			for (int strIndex = 0; strIndex < str[index].length(); strIndex++) {
				char letter = str[index].charAt(strIndex);
				if (Character.isDigit(letter)) {
					output[index] = str[index];
					break;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		FindStringWithNumber stringWithNumber = new FindStringWithNumber();
		String[] words = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] arr = stringWithNumber.findStringWithNumber(words);
		System.out.println("Strings having numbers are ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null)
				System.out.print(arr[i] + " ");
		}
	}
}
