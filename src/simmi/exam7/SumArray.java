/*16th May'2021 : Test - 7 [30 mins]

1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21

2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8*/

package simmi.exam7;

public class SumArray {

	int sum(int[] arr) {
		int temp = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isNumPresent = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					isNumPresent = true;
					break;
				}
			}
			if (isNumPresent == false) {
				temp = temp + num;

			}
		}
		return temp;
	}

	int max(int[] arr) {
		int highest = 0;

		for (int num = 1; num <= 10; num++) {
			boolean isMissing = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					isMissing = true;
					break;
				}
			}
			if (isMissing == false) {
				if (highest < num)
					highest = num;
			}
		}
		return highest;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		SumArray sumArray = new SumArray();
		SumArray maxArray = new SumArray();
		int sumMissing = sumArray.sum(arr);
		System.out.println("Sum of all missing number from given array " + sumMissing);
		System.out.println(" ");
		int highestMissing = maxArray.max(arr);
		System.out.println("Highest missing number from given array " + highestMissing);
	}
}
