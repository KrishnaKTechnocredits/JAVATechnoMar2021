package pallavi.Assignment_25;

/*Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/

public class SumOfDigitsInString {

	int countSDigit(String name) {
		int sum = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	int[] nameArray(String[] arr) { 
		int[] output = new int[arr.length];
		int indexOut = 0;
		for (int index = 0; index < arr.length; index++) {
			int sumOfDigit = countSDigit(arr[index]);
			if (sumOfDigit > 0) {
				output[indexOut] = sumOfDigit;
				indexOut++;
			}

		}
		return output;

	}

	public static void main(String[] args) {
		String[] input = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		SumOfDigitsInString sumOfDigitsInString = new SumOfDigitsInString();
		int[] newOutput = sumOfDigitsInString.nameArray(input);
		for (int index = 0; index < newOutput.length; index++) {
			if (newOutput[index] != 0) {
				System.out.print(" " + newOutput[index] + " ");
			}

		}
	}
}
