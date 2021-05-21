package sai.codingexam7;

public class MissNum {

	public static void main(String[] args) {

		MissNum missingNumber = new MissNum();
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		System.out.println("Sum of missing numbers is " + missingNumber.sumOfMissingNumbers(arr));
		System.out.println("Highest Missing number is " + missingNumber.highestNumMissing(arr));

	}

	int sumOfMissingNumbers(int[] arr) {

		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isMissing = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					isMissing = true;
					break;
				}

			}
			if (isMissing == false) {
				sum = sum + num;
			}
		}

		return sum;

	}

	int highestNumMissing(int[] arr) {
		int highestNumber = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isMissing = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					isMissing = true;
					break;
				}

			}
			if (isMissing == false) {
				if (highestNumber < num) {
					highestNumber = num;
				}
			}
		}

		return highestNumber;
	}

}
