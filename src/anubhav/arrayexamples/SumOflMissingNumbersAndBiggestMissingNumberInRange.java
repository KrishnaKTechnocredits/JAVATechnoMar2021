package anubhav.arrayexamples;

/*1. return sum of all missing number from given array.
			Range : 1 to 10
			input : {1,3,4,7,9,10};
			output : 21
2. return highest missing number from given array.
			Range : 1 to 10
			input : {1,3,4,7,9,10};
			output : 8
 */

public class SumOflMissingNumbersAndBiggestMissingNumberInRange {

	int sumOfMissingNumbers(int[] temp) {
		int sum = 0;
		int difference = 0;
		int sumOfIntInRange = (10 * 11 / 2); // sum of all numbers in the range 1 to 10
		for (int index = 0; index < temp.length; index++) {
			sum = sum + temp[index]; // sum of numbers in array
			difference = sumOfIntInRange - sum; // sum of missing numbers in the range
		}
		return difference;
	}

	int biggestMissingNumber(int[] temp) {
		int highMissingNumber = 0;
		for (int range = 1; range <= 10; range++) {
			boolean isMissing = false;
			for (int arrayIndex = 0; arrayIndex < temp.length; arrayIndex++) {
				if (range == temp[arrayIndex])
					isMissing = true;
			}
			if (!isMissing) {
				if (highMissingNumber < range)
					highMissingNumber = range;
			}
		}
		return highMissingNumber;
	}

	public static void main(String[] args) {
		SumOflMissingNumbersAndBiggestMissingNumberInRange sumOflMissingNumbersAndBiggestMissingNumberInRange = new SumOflMissingNumbersAndBiggestMissingNumberInRange();
		int[] temp = { 1, 3, 4, 7, 9, 10 };
		sumOflMissingNumbersAndBiggestMissingNumberInRange.sumOfMissingNumbers(temp);
		System.out.println("Sum of missing numbers is : " + sumOflMissingNumbersAndBiggestMissingNumberInRange.sumOfMissingNumbers(temp));
		sumOflMissingNumbersAndBiggestMissingNumberInRange.biggestMissingNumber(temp);
		System.out.println("Highest numbers amongst missing numbers is : " + sumOflMissingNumbersAndBiggestMissingNumberInRange.biggestMissingNumber(temp));
	}
}
