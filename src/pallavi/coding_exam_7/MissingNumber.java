package pallavi.coding_exam_7;

/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};  2 5 6 8
output : 21

2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
*/

public class MissingNumber {

	int sumOfMissingNumber(int arr[]) {
		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false)
				sum = sum + num;
		}
		return sum;
	}

	int highestMissingNumber(int arr[]) {
		int max = 0;
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				if (max < num)
					max = num;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int input[] = { 1, 3, 4, 7, 9, 10 };
		MissingNumber missingNumber = new MissingNumber();
		int sum = missingNumber.sumOfMissingNumber(input);
		System.out.println("sum of missing number is " + sum);
		int max = missingNumber.highestMissingNumber(input);
		System.out.println("Hishest maximum num is : " + max);
	}

}
