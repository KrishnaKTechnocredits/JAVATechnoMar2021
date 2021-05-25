/*Coding Exam - 7 : 16th May 2021 : [30 mins]

1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8

*/

package vaibhav.CoadingExam7;

public class MissingNumber {

	static int outputArr[];

	int[] getMissingNumArr(int[] inputArr) {
		int outputArrIndex = 0;
		for (int number = 1; number <= 10; number++) {
			boolean flag = false;

			for (int index = 0; index < inputArr.length; index++) {

				if (number == inputArr[index]) {
					flag = true;
					break;
				} 
			}

			if (flag == false) {
				outputArr[outputArrIndex] = number;
				outputArrIndex++;
			}
		}
		return outputArr;
	}
	
	
	int getSum(int[] arr) {
		int sum=0;
		
		for (int index=0; index<arr.length; index++) {
			sum = sum + arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		MissingNumber missingNumber = new MissingNumber();

		int inputArr[] = { 1, 3, 4, 7, 9, 10 };
		int range = 10;
		outputArr = new int[range - inputArr.length];

		outputArr = missingNumber.getMissingNumArr(inputArr);
		
		System.out.println("Missing number sum is : " + missingNumber.getSum(outputArr));
		System.out.println("Highest missing number : " + outputArr[outputArr.length-1]);
		
	}

}
