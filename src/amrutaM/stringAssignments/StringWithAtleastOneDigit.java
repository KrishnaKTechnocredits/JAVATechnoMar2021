package amrutaM.stringAssignments;

/*Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
*/
public class StringWithAtleastOneDigit {

	static String[] getStringwithAtleatOneDigit(String[] input) {
		String[] output = new String[5];
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = 0; innerIndex < input[index].length(); innerIndex++) {
				char ch = input[innerIndex].charAt(innerIndex);
				if (Character.isDigit(ch)) {
					output[innerIndex] = input[index];
					break;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] output = getStringwithAtleatOneDigit(input);
		for (String s : output) {
			System.out.println(s);
		}
	}
}
