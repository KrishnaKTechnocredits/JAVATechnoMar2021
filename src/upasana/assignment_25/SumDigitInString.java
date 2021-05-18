/*
Program 3: Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 */

package upasana.assignment_25;

public class SumDigitInString {

	int[] numInString(String[] input) {
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			String target = input[index];
			int sum = 0;
			for (int innerIndex = 0; innerIndex < target.length(); innerIndex++) {
				if (target.charAt(innerIndex) >= 48 && target.charAt(innerIndex) <= 57) {
					sum = sum + target.charAt(innerIndex) - 48;
					output[index] = sum;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] output = new SumDigitInString().numInString(input);
		for (int index = 0; index < output.length; index++) {
			if (output[index] != 0)
				System.out.println(output[index]);
		}
	}

}
