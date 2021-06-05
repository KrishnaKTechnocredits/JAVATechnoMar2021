/*Given an array of integers nums and an integer target, return indices of the 
 * two numbers such that they add up to the target.

Input: nums = [2,11,15,7,4], target = 9

Output: [0,3]*/

package ami.Coding_Exam_1;

public class SumGet {
	int targetNum = 9;
	int count = 0;

	int[] getSum(int[] num) {
		int[] arr = new int[num.length];
		for (int index = 0; index < num.length; index++) {
			for (int innerIndex = index + 1; innerIndex < num.length; innerIndex++) {
				// if(index!=innerIndex) {
				if (num[index] + num[innerIndex] == targetNum) {
					arr[count] = index;
					arr[++count] = innerIndex;
					count++;
				}
				// }
			}
		}
		return arr;
	}

	void display(int[] num) {
		for (int index = 0; index < count; index++) {
			System.out.println(num[index]);
		}
	}

	public static void main(String[] args) {
		SumGet sumGet = new SumGet();
		int[] arr = { 2, 11, 15, 7, 4 };
		int[] output = sumGet.getSum(arr);
		sumGet.display(output);
	}
}
