package kangan.Coding.Exam7;

/*2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8*/

public class ReturnHighestNum {

	int getHighestNum(int[] input) {
		int max = 0;
		for (int num = 1; num <= 10; num++) {
			boolean flag = false;
			for (int index = 0; index < input.length; index++) {
				if (num == input[index]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				if (num > max) {
					max = num;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		ReturnHighestNum returnHighestNum = new ReturnHighestNum();
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		int output = returnHighestNum.getHighestNum(arr);
		System.out.println(output);
	}
}
