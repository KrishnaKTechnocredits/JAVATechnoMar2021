package monika.Assignment17_Array;

import java.util.Scanner;

/*Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  */
public class ReturnBooleanIfHitTargetNum {

	boolean isTargetNum(int[] arr,int targetNum) {
		boolean result = false;
		for(int index=0;index<arr.length;index++) {
			if(arr[index] == targetNum) {
				result = true;
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {10,23,23,44,23,10,23,4,23};
		ReturnBooleanIfHitTargetNum obj = new ReturnBooleanIfHitTargetNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Provid target no.");
		int targetNum = sc.nextInt();
		boolean result = obj.isTargetNum(arr, targetNum);
		if(result)
			System.out.println("Number "+targetNum+" is in the array");
		else
			System.out.println("Number "+targetNum+" doesn't found in given array");
	}
	
}
