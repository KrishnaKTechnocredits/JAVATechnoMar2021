package komal.Assignment_17;

import java.util.Scanner;

/*Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  */
public class TargetNumberFromArray {
	static boolean isTargetNumberPresent(int[] inputNumber, int targetNum) {

		for (int index = 0; index < inputNumber.length; index++) {
			if (inputNumber[index] == targetNum) {
				return true;
			}
		}
		return false;
	}

	void scannerOperation(){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You want to Enter:-");
		int size = scanner.nextInt();
		int[] inputNumber = new int[size];

		for (int index = 0; index < inputNumber.length; index++) {
			System.out.println("Enter Number " + (index + 1));
			inputNumber[index] = scanner.nextInt();
		}
		System.out.println("Enter Target Number: ");
		int targetNumber = scanner.nextInt();

		boolean bool = isTargetNumberPresent(inputNumber, targetNumber);
		System.out.println("Target Number is : " + targetNumber);
		if (bool) {
			System.out.println("Target Number " + targetNumber + " is present in the given Array");
		} else
			System.out.println("Target Number " + targetNumber + " is not present in the given Array");

	}

	public static void main(String[] args) {

		TargetNumberFromArray targetNumberFromArray = new TargetNumberFromArray();
		targetNumberFromArray.scannerOperation();
	}
}
