package prachi.Assignment_17;

import java.util.Scanner;

/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)

}*/

public class ArrBoolean {
	boolean isNumberPresent(int[] numberArr, int target) {
		int targetCnt = 0;
		for (int index = 0; index < numberArr.length; index++) {
			if(numberArr[index] == target) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ArrBoolean arrB=new ArrBoolean();
		int[] numberArr = {10,23,23,44,23,10,23,4,23};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter target number");
		int targetNumber = scanner.nextInt();
		System.out.println("========================================");
		System.out.println("Is target number present in the array?");

		boolean value = arrB.isNumberPresent(numberArr,targetNumber);	
		if(value == true)
			System.out.println("Ans: Target Number "+targetNumber+" is present in array.");
		else
			System.out.println("Ans: Target Number "+targetNumber+" is not present in array.");
	}
}