/*Assignment - 26 : 20th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
*/
package ravindra_J.Assignment_No_26_StringArray;

public class MaxDigitString {
	
	int Count(String str) {
		int Cnt = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				Cnt++;
		}
		return Cnt;
	}

	int[] getEachWordDigitCountArray(String[] str) {
		int[] wordDigitCount = new int[str.length];

		for (int index = 0; index < str.length; index++) {
			wordDigitCount[index] = Count(str[index]);
		}
		return wordDigitCount;
	}

	int getMaxNumIndex(int[] arr) {

		int maxStringIndex = 0;
		int maxNum = arr[0];

		for (int index = 1; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				maxNum = arr[index];
				maxStringIndex = index;
			}
		}
		return maxStringIndex;
	}

	public static void main(String[] args) {
		MaxDigitString maxDigitString = new MaxDigitString();

		String[] inputStr = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };

		int[] count = maxDigitString.getEachWordDigitCountArray(inputStr);
		int maxNumIndex = maxDigitString.getMaxNumIndex(count);

		System.out.println("String with maximum digits : -> \n" + inputStr[maxNumIndex]);
	}

}
