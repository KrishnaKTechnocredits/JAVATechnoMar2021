/*Java Assignment 25:  18th April'2021

3.	Program 3: Write a method which will return sum of each all numbers in each String.
Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output: 6 14 12 15 7 4

*/

package vaibhav.Assignment_25;

public class SumOfAllNumInString {

	int getSumOfNum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		return sum;
	}

	int[] getSumArr(String[] inputArr) {

		int[] outputArr = new int[inputArr.length];

		for (int index = 0; index < inputArr.length; index++) {
			outputArr[index] = getSumOfNum(inputArr[index]);
		}
		return outputArr;
	}

	public static void main(String[] args) {
		SumOfAllNumInString sumOfAllNumInString = new SumOfAllNumInString();
		String[] inputStr = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };

		int[] outputSumArr = sumOfAllNumInString.getSumArr(inputStr);

		System.out.println("Sum of each all numbers in each String form given string array : ");
		System.out.println("");
		System.out.println("Output ---> ");
		for (int index = 0; index < inputStr.length; index++) {
			System.out.print(outputSumArr[index] + " ");
		}
	}
}
