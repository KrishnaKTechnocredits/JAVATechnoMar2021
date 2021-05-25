package shashank.coding_exam_7;

/* 
1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8

 */
class MissingElementInArray {
	int sumOfMissingNumber(int array[]) {
		int sum = 0;
		boolean isMissingNum = false;
		for (int num = 1; num <= 10; num++) {
			isMissingNum = false;
			for (int index = 0; index < array.length; index++) {
				if (num == array[index]) {
					isMissingNum = true;
					break;
				}
			}
			if (isMissingNum == false) {
				sum = sum + num;
			}
		}
		return sum;
	}

	int maxOfMissingNumber(int array[]) {
		int max = 0;
		boolean isMissingNum = false;
		for (int num = 1; num <= 10; num++) {
			for (int index = 0; index < array.length; index++) {
				isMissingNum = false;
				if (num == array[index]) {
					isMissingNum = true;
					break;
				}
			}
			if (isMissingNum == false)
				if (num > max)
					max = num;
		}
		return max;
	}

	public static void main(String args[]) {
		MissingElementInArray missingElementInArray = new MissingElementInArray();
		int arr[] = { 1, 3, 4, 7, 9, 10 };
		int sum = missingElementInArray.sumOfMissingNumber(arr);
		int max = missingElementInArray.maxOfMissingNumber(arr);
		System.out.println("Sum of missing elements in array " + sum);
		System.out.println("Maximum number of missing elements in array " + max);
	}
}
