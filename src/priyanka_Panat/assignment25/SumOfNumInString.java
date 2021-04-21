/*
 Assignment - 25 : 18th April'2021
 
 Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 */

package priyanka_Panat.assignment25;

public class SumOfNumInString {
	int[] printSum(String[] str) {
		int[] sumNum = new int[str.length];
		for (int index = 0; index < str.length; index++) {
			int sum = 0;
			for (int innnerIndex = 0; innnerIndex < str[index].length(); innnerIndex++) {
				char ch = str[index].charAt(innnerIndex);
				if (Character.isDigit(ch)) {
					int num = Character.getNumericValue(ch);
					sum = sum + num;
				}
			}

			sumNum[index] = sum;
		}
		return sumNum;
	}

	public static void main(String[] args) {

		SumOfNumInString sumOfNumInString = new SumOfNumInString();
		String[] str = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] arr = sumOfNumInString.printSum(str);
		System.out.println("Sum of numbers for each string in a given array is : ");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index]);

		}
	}
}
