package komal.Assignment_26;

/*Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93*/

public class StringMaximumNumber {
	void getStringMaxNum(String[] input) {
		int num = 0;
		int[] arrNum = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			int digit = 0;
			for (int innerindex = 0; innerindex < input[index].length(); innerindex++) {
				char chartoCheck = input[index].charAt(innerindex);
				if (Character.isDigit(chartoCheck)) {
					digit++;
				}
			}
			if (digit != 0) {
				arrNum[num] = digit;
				num++;
			} else
				num++;

		}
		int temp = arrNum[0];
		int strArr = getStrMaxNum(arrNum);
		System.out.println(
				"String containing maximum digits is : '" + input[strArr] + "'having'" + arrNum[strArr] + "'digits");
	}

	int getStrMaxNum(int[] arrWithNums) {
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

	public static void main(String[] args) {
		StringMaximumNumber stringMaximumNumber = new StringMaximumNumber();
		String[] inputStr = { "Plu2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1vli93" };
		stringMaximumNumber.getStringMaxNum(inputStr);
	}

}
