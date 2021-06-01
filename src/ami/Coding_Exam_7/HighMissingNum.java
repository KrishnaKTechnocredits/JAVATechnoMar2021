/*
 2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
*/

package ami.Coding_Exam_7;

public class HighMissingNum {
	int num ;
	
	int highMissingnum(int[] arr) {
		int highMissingNumber = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isMissing = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index]) {
					isMissing = true;
					break;
				}

			}
			if (isMissing == false) {
				if (highMissingNumber < num) {
					highMissingNumber = num;
				}
			}
		}

		return highMissingNumber;
	}

	public static void main(String[] a) {
		HighMissingNum return1 = new HighMissingNum();
		int[] input = {1, 3, 4, 7, 9, 10};
		int output = return1.highMissingnum(input);
		System.out.println("highest missing number =" + output);
	}
}
