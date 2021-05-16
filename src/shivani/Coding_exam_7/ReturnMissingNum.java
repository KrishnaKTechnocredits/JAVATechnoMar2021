package shivani.Coding_exam_7;
/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8*/

public class ReturnMissingNum {

	int sumOfMissingNum(int[] inputArr) {
		int sum = 0;
		boolean isNumNotPresent = true;
		;
		for (int index = 1; index <= 10; index++) {
			isNumNotPresent = true;
			for (int index1 = 0; index1 < inputArr.length; index1++) {
				if (index == inputArr[index1]) {
					isNumNotPresent = false;
					break;
				}
			}
			if (isNumNotPresent == true) {
				sum = sum + index;
			}
		}
		return sum;
	}

	int higestMissingNum(int[] inputArr) {
		int maxNum = 0;
		boolean isNumNotPresent = true;
		for (int index = 1; index <= 10; index++) {
			isNumNotPresent = true;
			for (int index1 = 0; index1 < inputArr.length; index1++) {
				if (inputArr[index1] == index) {
					isNumNotPresent = false;

				}
			}
			if (isNumNotPresent == true) {
				if (maxNum > index) {
					maxNum = index;
				}
				maxNum = index;

			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		ReturnMissingNum returnMissingNum = new ReturnMissingNum();
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		System.out.println("Sum of all missing number in given array is:" + returnMissingNum.sumOfMissingNum(arr));
		System.out.println("Highest of missing number in given array is:" + returnMissingNum.higestMissingNum(arr));
	}

}
