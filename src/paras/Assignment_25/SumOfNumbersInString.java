/*
Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 */

package paras.Assignment_25;

public class SumOfNumbersInString {
	
	int[] getStringWithNum(String[] str) {
		int sumIndex = 0;
		int[] output = new int[str.length];
		for (int index = 0; index < str.length; index++) {
			int sum = 0;
			for (int innnerindex = 0; innnerindex < str[index].length(); innnerindex++) {
				char ch = str[index].charAt(innnerindex);
				if (Character.isDigit(ch)) {
					int num = ch - '0';
					sum += num;
				}
			}
			if (sum != 0) {
				output[sumIndex] = sum;
				sumIndex++;
			} else
				sumIndex++;
		}
		return output;
	}
	
	public static void main(String[] args) {

		SumOfNumbersInString sumOfNumbersInString = new SumOfNumbersInString();
		String[] str = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] arrOfSum = sumOfNumbersInString.getStringWithNum(str);
		for (int index = 0; index < arrOfSum.length; index++) {
			System.out.println("Sum of all numbers in string " + str[index] + " is " + arrOfSum[index]);

		}
	}
}


