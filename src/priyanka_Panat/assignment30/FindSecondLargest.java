/*
Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
output : 55 
 */
package priyanka_Panat.assignment30;

public class FindSecondLargest {
	void getResult(int[] input) {
		int temp;
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] > input[innerIndex]) {
					temp = input[index];
					input[index] = input[innerIndex];
					input[innerIndex] = temp;
				}

			}

		}
		System.out.println("Second largest number from given array is : " + input[input.length - 2]);
	}

	public static void main(String[] args) {
		FindSecondLargest findSecondLargest = new FindSecondLargest();
		int arr[] = { 10, 33, 43, 55, 97, 11, 3, 29, 5, 22 };
		findSecondLargest.getResult(arr);

	}

}
