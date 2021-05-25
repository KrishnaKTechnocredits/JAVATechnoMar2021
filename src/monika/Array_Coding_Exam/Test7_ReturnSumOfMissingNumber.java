package monika.Array_Coding_Exam;

/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};2+5+6+8
output : 21
2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10}; 
output : 8
*/public class Test7_ReturnSumOfMissingNumber {

	public int returnSumOfMisisngNo(int[] arr) {
		int sum = 0;
		boolean flag = false;
		for (int num = 1; num < 11; num++) {
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					flag = true;
					break;
				} else
					flag = false;

			}
			if (flag == false) {
				sum += num;
			}
		}
		return sum;

	}

	public int returnHighestNumInArr(int[] arr) {
		int maxMissingNum = 0;
		boolean flag = false;
		for (int num = 1; num < 11; num++) {
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					flag = true;
					break;
				} else
					flag = false;

			}
			if (flag == false) {
				if (num > maxMissingNum)
					maxMissingNum = num;
			}
		}
		return maxMissingNum;

	}

	public static void main(String[] args) {
		Test7_ReturnSumOfMissingNumber obj = new Test7_ReturnSumOfMissingNumber();
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		int sum = obj.returnSumOfMisisngNo(arr);
		System.out.println(sum);
		int i = obj.returnHighestNumInArr(arr);
		System.out.println(i);
	}
}
