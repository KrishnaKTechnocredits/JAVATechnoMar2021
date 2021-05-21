/*
1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
input : {1,2,3,4,7,9,10};
output : 21

2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
*/
package kajal.Codingexam;

public class ReturnMissingSumAndMax {

	int missingNoSum(int[] input) {
		int Sum = 0;

		for (int index = 1; index <= 10; index++) {
			boolean isNumPresent = false;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (index == input[innerIndex])
					isNumPresent = true;

			}
			if (isNumPresent == false)
				Sum += index;

		}
		return Sum;

	}

	int highestMissing(int[] input) {
		int maxNumber = 0;
		for (int index = 1; index <= 10; index++) {

			boolean isNumPresent = false;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (index == input[innerIndex])
					isNumPresent = true;

			}
			if (isNumPresent == false)
				if (maxNumber < index)
					maxNumber = index;

		}
		return maxNumber;

	}

	public static void main(String[] args) {
		ReturnMissingSumAndMax test = new ReturnMissingSumAndMax();
		int[] input = { 1, 3, 4, 7, 9, 10 };
		int sum = test.missingNoSum(input);
		int highMiss = test.highestMissing(input);
		System.out.println("sum of all missing number from given array is :" + sum);
		System.out.println("highest missing number from given array is :" + highMiss);
	}
}
