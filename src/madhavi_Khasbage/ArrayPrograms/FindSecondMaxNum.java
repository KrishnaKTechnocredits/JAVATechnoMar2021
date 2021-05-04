package madhavi_Khasbage.ArrayPrograms;

import java.util.Arrays;

/*WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */

public class FindSecondMaxNum {

	int getSecondMaxNumber(int[] arr) {
		int temp = arr[0];
		for (int index = 0; index < arr.length; index++) {
			for (int inIndex = index + 1; inIndex < arr.length; inIndex++) {
				if (arr[index] > arr[inIndex]) {
					temp = arr[index];
					arr[index] = arr[inIndex];
					arr[inIndex] = temp;
				}
			}
		}
		return arr[arr.length - 2];
	}

	public static void main(String[] args) {
		FindSecondMaxNum findSecondMaxNum1 = new FindSecondMaxNum();
		int[] arr = { 93,10,33,43,111,55,97,11,3,88};
		
		System.out.println("Output:" + findSecondMaxNum1.getSecondMaxNumber(arr));
	}

}
