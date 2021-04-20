/*Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93*/

package krati_Jain.Assignment_26;

public class MaxDigitsInString {

	public static void main(String[] args) {
		MaxDigitsInString maxDigitsInString = new MaxDigitsInString();
		String[] inputStr = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		maxDigitsInString.getStringWithNum(inputStr);
	}

	void getStringWithNum(String[] inputStr) {
		int indexDigCnt = 0;
		int[] arrWithNums = new int[inputStr.length];
		for (int index = 0; index < inputStr.length; index++) { // 1
			int digitcount = 0;
			for (int innnerindex = 0; innnerindex < inputStr[index].length(); innnerindex++) {
				char chartoCheck = inputStr[index].charAt(innnerindex); // Tech1No2Credits3
				if (Character.isDigit(chartoCheck)) {
					digitcount++;
				}
			}
			if (digitcount != 0) {
				arrWithNums[indexDigCnt] = digitcount;
				indexDigCnt++;
			} else
				indexDigCnt++;
		}
		int tempElement = arrWithNums[0];
		int indexOfStrArr = getStrWithMaxNums(arrWithNums);
		System.out.println("String containing maximum digits is : '" + inputStr[indexOfStrArr] + "' having '"
				+ arrWithNums[indexOfStrArr] + "' digits");
	}

	int getStrWithMaxNums(int[] arrWithNums) {
		int tempElement = arrWithNums[0];
		int storeIndex = 0;
		for (int index = 1; index < arrWithNums.length; index++) {
			if (arrWithNums[index] > tempElement) {
				tempElement = arrWithNums[index];
				storeIndex = index;
			}
		}
		return storeIndex;
	}

}
