/*WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */

package krati_Jain.Assignment_30;

public class SecondMaxNumber {

	public static void main(String[] args) {
		int[] inputArr = { 10, 33, 43, 55, 97, 11, 3, 100, 1000, 0};
		SecondMaxNumber secondMaxNum = new SecondMaxNumber();
		secondMaxNum.findSecondMax(inputArr);
	}

	void findSecondMax(int[] intArry) {
		int holder = 0;
		for (int index = 0; index < intArry.length; index++) { // {10,33,43,55,97,11,3, 100, 1000, 0} 10,33
			for (int innerIndex = index + 1; innerIndex < intArry.length; innerIndex++) {// 33
				if (intArry[index] > intArry[innerIndex]) {// 5
					holder = intArry[index]; // 10, 33
					intArry[index] = intArry[innerIndex]; // 3, 11
					intArry[innerIndex] = holder; // 10, 33
				}

			}
		}

		System.out.println("Second Max number in the provided array is : " + intArry[intArry.length - 2]);

	}

}
