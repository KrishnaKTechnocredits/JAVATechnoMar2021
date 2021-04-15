/*return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)*/

package sangeeta.ArrayPrograms;

import java.util.Scanner;

public class TargetNumberWithBooleanReturn {

	int TargetNumber;
	int Number;
	void isNumberPresentInArray(int[] arr, int TargetNumber) {
		for (int index = 0; index < arr.length; index++) {
			if(arr[index]==TargetNumber){
				Number = TargetNumber;
			}
		}
	}
		
	void displayPresentedNumber() {
		System.out.println("Number " + Number + " found in a given array");
		System.out.println("Number " + Number + " not found in a given array");
		
		}
	public static void main(String[] a) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for (int index = 0; index < arr.length; index++) {
			System.out.println("Enter elements of  an Array: ");
			arr[index] = scanner.nextInt();
		}
		System.out.println("Enter Target number");
		int TargetNumber = scanner.nextInt();
		new TargetNumberWithBooleanReturn().isNumberPresentInArray(arr, TargetNumber);

	}
}
