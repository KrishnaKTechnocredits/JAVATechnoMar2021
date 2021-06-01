package neha_Rathi.codingExam7;

public class MissingNumber {

	int sumMissingNum(int[] input) {
		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isMissingNum = false;
			for (int index = 0; index < input.length; index++) {
				if (num == input[index]) 
					isMissingNum = true;
			}
			if (!isMissingNum) 
				sum = sum + num;
		}
		return sum;
	}

	int highestMissingNum(int[] input) {
		int highestNum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isMissingNum = false;
			for (int index = 0; index < input.length; index++) {
				if (num == input[index]) 
					isMissingNum = true;
			}
			if (!isMissingNum) {
				if (highestNum < num) {
					highestNum = num;
				}
			}
		}
		return highestNum;
	}

	public static void main(String[] args) {
		MissingNumber missingNumber = new MissingNumber();
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		System.out.println("Sum of missing number is: " + missingNumber.sumMissingNum(arr));
		System.out.println("Maximum missing number is: " + missingNumber.highestMissingNum(arr));
	}

}
