/*
WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55
 */

package upasana.assignment_30;

public class SecondMaxArray {

	void secondMax(int[] arr) {

		int num = 0;
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] > arr[innerIndex]) {
					num = arr[innerIndex];
					arr[innerIndex] = arr[index];
					arr[index] = num;

				}
			}

		}

		System.out.println(arr[arr.length - 2]);
	}

	public static void main(String[] args) {

		int[] arr = { 10, 33, 43, 55, 97, 11, 3 };
		new SecondMaxArray().secondMax(arr);
	}

}
