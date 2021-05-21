package komal.coding_exam_7;

/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8*/
public class SumOfAllMissingNum {

	int sumofMissingNum(int[] input) {
		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isNumPresent = false;
			for (int index = 0; index < input.length; index++) {
				if (num == input[index])
					isNumPresent = true;
			}
			if (!isNumPresent)
				sum = sum + num;
		}
		return sum;
	}

	int highestMissingNum(int[] input) {
		int highestNum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isNumPresent = false;
			for (int index = 0; index < input.length; index++) {
				if (num == input[index])
					isNumPresent = true;
			}
			if (!isNumPresent) {
				if (highestNum < num) {
					highestNum = num;
				}
			}
		}
		return highestNum;
	}

	public static void main(String[] args) {
		SumOfAllMissingNum sumOfAllMissingNum = new SumOfAllMissingNum();
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		System.out.println("Sum of missing number is: " + sumOfAllMissingNum.sumofMissingNum(arr));
		System.out.println("Highest missing number is: " + sumOfAllMissingNum.highestMissingNum(arr));
	}

}