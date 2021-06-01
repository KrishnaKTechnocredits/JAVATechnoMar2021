/*Java Assignment 17: 10th April 2021

Program 6: From given array return max number.

input : 22, -35, -65, -88, -11, -23, -45
output : 22*/

package vaibhav.Assignment_17;

public class FindMaxNum {

	int maxNum;

	void toGetMaxNum(int[] numArr) {
		maxNum = numArr[0];
		for (int index = 0; index < numArr.length; index++) {
			if (numArr[index] >= maxNum)
				maxNum = numArr[index];
		}
		System.out.println("Maximum number form given set of numbers is : " + maxNum);
	}

	public static void main(String[] args) {
		int[] arr = { 22, -35, -65, -88, -11, -23, -45 };

		FindMinNum findMaxNum = new FindMinNum();
		findMaxNum.toGetMaxNum(arr);

	}
}
