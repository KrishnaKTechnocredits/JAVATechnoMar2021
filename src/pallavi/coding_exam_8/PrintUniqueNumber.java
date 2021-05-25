package pallavi.coding_exam_8;
/*
Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}*/

public class PrintUniqueNumber {

	int[] findUniqueNumber(int[] arr) {
		int[] output = new int[arr.length];
		int index1 = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean flag = true;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				output[index1] = arr[index];
				index1++;
			}
		}
		return output;

	}

	public static void main(String[] args) {
		int[] input = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] output = new PrintUniqueNumber().findUniqueNumber(input);
		for (int index = 0; index < output.length; index++) {
			if (output[index] != 0) {
				System.out.print(output[index] + " ");
			}

		}

	}

}
