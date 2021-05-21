package krishna_CodingTest_7;

public class FindMissingNumber {

	int findMissingNumbersSum(int[] inputArr, int startRange, int endRange) {
		int sum = 0;
		for (int number = startRange; number <= endRange; number++) {
			boolean isNumPresent = false;
			for (int arrIndex = 0; arrIndex < inputArr.length; arrIndex++) {
				if (number == inputArr[arrIndex])
					isNumPresent = true;
			}
			if (isNumPresent == false)
				sum = sum + number;
		}
		return sum;
	}

	int findHighestMissingNum(int[] inputArr, int startRange, int endRange) {
		int highestNumber = 0;
		for (int number = startRange; number <= endRange; number++) {
			boolean isNumPresent = false;
			for (int arrIndex = 0; arrIndex < inputArr.length; arrIndex++) {
				if (number == inputArr[arrIndex])
					isNumPresent = true;
			}
			if (isNumPresent == false)
				if (number > highestNumber)
					highestNumber = number;
		}
		return highestNumber;
	}

	public static void main(String[] args) {
		FindMissingNumber missingNum = new FindMissingNumber();
		int[] givenArr = { 1, 3, 4, 7, 9, 10 };
		int sum = missingNum.findMissingNumbersSum(givenArr, 1, 10);
		System.out.println("Sum of the missing numbers from given array is : " + sum);
		int highest = missingNum.findHighestMissingNum(givenArr, 1, 10);
		System.out.println("Highest missing number in the given array is : " + highest);
	}
}