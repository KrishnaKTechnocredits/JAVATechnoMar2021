/*
 Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
 */

package ami.Assignment_26;

public class ReturnStringWithMaxDigits {
	int maxIndex;

	int calcDigitCountInString(String str) {
		int digitCount = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				digitCount++;
			}
		}
		System.out.println("Digit count for " + str + " is " + digitCount);
		return digitCount;
	}

	int[] getCountsInArray(String[] stringArr) {
		int[] counterArray = new int[stringArr.length];
		for (int index = 0; index < stringArr.length; index++) {
			counterArray[index] = calcDigitCountInString(stringArr[index]);
		}
		return counterArray;
	}

	int getMaxIndexfromCountArray(int[] counterArray) {
		int maxValue = counterArray[0];
		int positionOfMax = 0;
		for (int index = 1; index < counterArray.length; index++) {
			if (maxValue < counterArray[index]) {
				maxValue = counterArray[index];
				positionOfMax = index;
			}
		}
		return positionOfMax;
	}

	void displayStringWithMaxDigits(int maxIndex, String[] str) {
		System.out.println("*****STRING WITH MAX DIGITS*****");
		System.out.println("Display method MaxDigit :" + str[maxIndex]);
	}

	public static void main(String[] args) {
		ReturnStringWithMaxDigits returnStringWithMaxDigits = new ReturnStringWithMaxDigits();
		String[] stringArray = { "P1u2r2v88888888a", "1K29999omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		int[] countArray = returnStringWithMaxDigits.getCountsInArray(stringArray);
		int posOfMax = returnStringWithMaxDigits.getMaxIndexfromCountArray(countArray);
		returnStringWithMaxDigits.displayStringWithMaxDigits(posOfMax, stringArray);
	}

}
