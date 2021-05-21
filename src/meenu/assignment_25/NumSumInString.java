package meenu.assignment_25;

import java.util.Arrays;

/*Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
*/

public class NumSumInString {

	int[] calculateSumOfNumbersInString(String[] stringArray) {
		int[] sumArray = new int[stringArray.length];
		for (int index = 0; index < stringArray.length; index++) {
			int sum = 0;
			for (int stringIndex = 0; stringIndex < stringArray[index].length(); stringIndex++) {
				if (Character.isDigit(stringArray[index].charAt(stringIndex))) {
					sum = sum + Character.getNumericValue(stringArray[index].charAt(stringIndex));
				}
			}
			sumArray[index] = sum;
		}
		return sumArray;
	}

	public static void main(String[] args) {
		NumSumInString numSumInString = new NumSumInString();
		String[] stringArray = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		System.out.println(Arrays.toString(numSumInString.calculateSumOfNumbersInString(stringArray)));
	}
}
