/*Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55*/

package simmi.assignment_30;

public class SecondMaxNumber {
	void secondLargest(int[] arr) {
		int temp = 0;
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] > arr[innerIndex]) {
					temp = arr[innerIndex];
					arr[innerIndex] = arr[index];
					arr[index] = temp;
				}
			}
		}
		System.out.println(arr[arr.length - 2]);
	}

	public static void main(String[] args) {
		SecondMaxNumber secondMaxNumber = new SecondMaxNumber();
		int[] arr = { 10, 33, 43, 55, 97, 11, 3 };
		secondMaxNumber.secondLargest(arr);
	}

}
