/*
Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 
 */
package radha.Find2ndMax.Assignment30;

public class Find2ndMaxFromArray {

	int get2ndMaxNum(int[] arr) {
		int maxNum;
		for (int index = 0; index < arr.length; index++) {
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] > arr[innerIndex]) {
					maxNum = arr[index];
					arr[index] = arr[innerIndex];
					arr[innerIndex] = maxNum;
				}
			}
		}
		return arr[arr.length - 2];
	}

	public static void main(String[] args) {
		Find2ndMaxFromArray find2ndMax = new Find2ndMaxFromArray();
		int[] arr = { 10, 33, 43, 55, 97, 11, 3 };
		int secondMax = find2ndMax.get2ndMaxNum(arr);
		System.out.println("Second maximum number in the given array is : " + secondMax);
	}
}
