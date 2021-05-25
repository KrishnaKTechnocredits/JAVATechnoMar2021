/*
16th May'2021 : Test - 7 [30 mins]

1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21

2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
*/
package upasana.coding_exam_7;

public class MissingNumberMax {
	
	int missingNumberMax(int[] input, int numRange) {

		int maxMissingNo = 0;
		for (int index = 1; index <= numRange; index++) {
			boolean flag = false;
			for (int index1 = 0; index1 < input.length; index1++) {
				if (index == input[index1]) {
					flag = true;
					break;
				}
			}

			if (flag == false) {
				if (maxMissingNo < index)
					maxMissingNo = index;
			}
		}
		return maxMissingNo;
	}

	int sumArray(int[] input, int numRange) {

		int sumExpected = 0;
		int sumActual = 0;
		
		sumExpected = numRange * (numRange + 1) / 2;

		for (int index = 0; index < input.length; index++) {
			sumActual += input[index];
		}
		return sumExpected - sumActual;
	}

	public static void main(String[] args) {

		MissingNumberMax obj = new MissingNumberMax();
		int[] input = { 1, 3, 4, 7, 9, 10 };
		int numRange = 10;
		
		int output = obj.missingNumberMax(input, numRange);
		System.out.println("Highest missing no from array is : " + output);
		
		int output1 = obj.sumArray(input, numRange);
		System.out.println("Sum of all missing nos from array is : " + output1);
	}
}
