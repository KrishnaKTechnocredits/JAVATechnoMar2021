package madhavi_Khasbage.ArrayPrograms;

import java.util.Scanner;

/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  
*/

public class FrequencyTargetNumScannerTF {

	int cntTarget;

	boolean isNumberPresent(int[] arr, int numTarget) {
		boolean isPresent = false;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == numTarget) {
				cntTarget++;
				isPresent = true;
			}
		}
		return isPresent;
	}

	public static void main(String[] args) {
		FrequencyTargetNumScannerTF frqNum = new FrequencyTargetNumScannerTF();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in an array:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Please enter " + size + " elements, seperated by space only (eg. 12 3 4):");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}

		System.out.println("Enter target number:");
		int tNum = scanner.nextInt();

		if (frqNum.isNumberPresent(array, tNum))
			System.out.println("Frequency of " + tNum + " is " + frqNum.cntTarget);
		else
			System.out.println(tNum + " doesn't found in given array.");

		scanner.close();
	}

}
