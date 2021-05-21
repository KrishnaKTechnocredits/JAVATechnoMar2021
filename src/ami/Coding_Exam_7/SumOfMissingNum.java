/*
1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21
*/

package ami.Coding_Exam_7;

public class SumOfMissingNum {
	int num = 0;

	int ReturnSumOfMissingNum(int[] arr) {
		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isNumPresent = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					isNumPresent = true;
					break;
				}
			}
			if (isNumPresent == false) {
				sum = sum + num;
			}
		}
	return sum;
	}

	public static void main(String[] a) {
		SumOfMissingNum sumOfMissingNum = new SumOfMissingNum();
		int[] input = { 1, 3, 4, 7, 9, 10 };
		int output = sumOfMissingNum.ReturnSumOfMissingNum(input);
		System.out.println("missing num = " + output);
	}
}
