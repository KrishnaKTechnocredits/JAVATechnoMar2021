/*/*Assignment - 25 : 18th April'2021
 * Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 * 
 */
package aparna.stringExample1;

public class AddNumbersInString {

	int[] sumDigitsInString(String[] inputNames) {

		int[] outputArray = new int[inputNames.length];
		for (int index = 0; index < inputNames.length; index++) {
			String target = inputNames[index];
			int sum = 0;
			for (int innerIndex = 0; innerIndex < target.length(); innerIndex++) {
				if (target.charAt(innerIndex) >= 48 && target.charAt(innerIndex) <= 57) {
					sum = sum + target.charAt(innerIndex) - 48;
					outputArray[index] = sum;
				}

			}
		}
		return outputArray;
	}

	public static void main(String[] args) {
		AddNumbersInString addNumbersInString = new AddNumbersInString();
		String[] input = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] outputArray = addNumbersInString.sumDigitsInString(input);
		for (int index = 0; index < outputArray.length; index++) {
			if (outputArray[index] != 0)
				System.out.println(outputArray[index]);
		}
	}

}