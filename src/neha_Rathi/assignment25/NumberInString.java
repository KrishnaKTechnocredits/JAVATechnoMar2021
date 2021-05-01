//Assignment25 Write a method which will return all String from given array which contains atleast one number. Main method should print the output.

package neha_Rathi.assignment25;

public class NumberInString {
	static int cnt = 0;

	boolean calNumString(String input) {
		boolean isDigit = false;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				isDigit = true;
				break;
			}
		}
		return isDigit;
	}

	String[] numString(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			if (calNumString(input[index])) {
				output[cnt] = input[index];
				cnt++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		NumberInString numberInString = new NumberInString();
		String[] input = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String[] res = numberInString.numString(input);
		System.out.println("List of names having number are: ");
		for (int index = 0; index < cnt; index++) {
			System.out.println(res[index]);
		}
	}
}
