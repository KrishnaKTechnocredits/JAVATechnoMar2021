/*Java Assignment 17: 10th April 2021

Program 7: From given array return min number.

input : 22, -35, -65, -88, -11, -23, -45
output : -88*/

package vaibhav.Assignment_17;

public class FindMinNum {

	int minNum;

	void toGetMaxNum(int[] numArr) {
		minNum = numArr[0];
		for (int index = 0; index < numArr.length; index++) {
			if (numArr[index] <= minNum)
				minNum = numArr[index];
		}
		System.out.println("Maximum number form given set of numbers is : " + minNum);
	}

	public static void main(String[] args) {
		int[] arr = { 22, -35, -65, -88, -11, -23, -45 };

		FindMinNum findMinNum = new FindMinNum();
		findMinNum.toGetMaxNum(arr);
		

	}
}
