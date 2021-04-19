package aashay.Test_1;
/*
 * Program 2 : 
WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55
 */

public class Program2 {

	void minMaxAgeDiff(int arr[]) {
		int min = 0;
		int max = 0;
		int difference = 0;

		for (int index = 0; index < arr.length; index++) {
			int firstage = arr[index];
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (firstage > arr[innerIndex]) {
					min = arr[innerIndex];
				} else if (firstage < arr[innerIndex])
					max = arr[innerIndex];
			}
		}
		System.out.println("Min number:" + min);
		System.out.println("Max number:" + max);
		difference = max - min;
		System.out.println("Difference between Max & Min number from given array is:" + difference);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program2 program2 = new Program2();
		int arr[] = { 12, 7, 56, 62, 25 };
		program2.minMaxAgeDiff(arr);

	}

}
