/*
Program 2: Write a method which will return all String from given array which contains atleast 
one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
 */

package upasana.assignment_25;

public class PrintDigitInString {

	String[] numInString(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			String target = input[index];
			for (int innerIndex = 0; innerIndex < target.length(); innerIndex++) {
				if (target.charAt(innerIndex) >= 48 && target.charAt(innerIndex) <= 57) {
					output[index] = target;
				}
			}

		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] output = new PrintDigitInString().numInString(input);
		for (int index = 0; index < output.length; index++) {
			if (output[index] != null)
				System.out.println(output[index]);
		}
	}

}
