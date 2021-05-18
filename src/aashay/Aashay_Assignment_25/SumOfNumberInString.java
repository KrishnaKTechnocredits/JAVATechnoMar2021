package aashay.Aashay_Assignment_25;
/*
 * Program 3: Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 */

public class SumOfNumberInString {

	int[] sumOfDigit(String[] name) {

		int[] sumDigit = new int[name.length];

		for (int index = 0; index < name.length; index++) {
			int sum = 0;
			for (int innerIndex = 0; innerIndex < name[index].length(); innerIndex++) {
				char ch = name[index].charAt(innerIndex);
				if (Character.isDigit(ch)) {
					// System.out.println(name[index]);
					sum += Character.getNumericValue(ch);
				}
			}
			sumDigit[index] = sum;

		}
		return sumDigit;

	}

	void display(int[] digitString) {
		for (int index = 0; index < digitString.length; index++) {
			if (digitString[index] != 0) {
				System.out.println(digitString[index]);
			} else {
				continue;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfNumberInString sumOfNumberInString = new SumOfNumberInString();
		String[] name = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] sumDigit = sumOfNumberInString.sumOfDigit(name);
		sumOfNumberInString.display(sumDigit);

	}

}
