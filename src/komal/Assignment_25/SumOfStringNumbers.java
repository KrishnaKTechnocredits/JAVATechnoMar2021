package komal.Assignment_25;
/* 
Program 3: Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/

public class SumOfStringNumbers {

	public static void main(String[] args) {
		SumOfStringNumbers SumOfStringNumbers = new SumOfStringNumbers();
		String[] inputStr = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] arrOfSum = SumOfStringNumbers.getStringWithNum(inputStr);
		System.out.println("Sum of each all the numbers in each String is :");
		for (int index = 0; index < arrOfSum.length; index++) {
			System.out.println(arrOfSum[index]);

		}
	}

	int[] getStringWithNum(String[] inputStr) {
		int indexSum = 0;
		int[] arrWithNums = new int[inputStr.length];
		for (int index = 0; index < inputStr.length; index++) {
			int digitSum = 0;
			for (int innnerindex = 0; innnerindex < inputStr[index].length(); innnerindex++) {
				char chartoCheck = inputStr[index].charAt(innnerindex);
				if (Character.isDigit(chartoCheck)) {
					int charToNum = chartoCheck - '0';
					digitSum += charToNum;
				}
			}
			if (digitSum != 0) {
				arrWithNums[indexSum] = digitSum;
				indexSum++;
			} else
				indexSum++;
		}
		return arrWithNums;
	}
}
