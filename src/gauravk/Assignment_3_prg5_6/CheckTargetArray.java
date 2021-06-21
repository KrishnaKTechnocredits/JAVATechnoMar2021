package gauravk.Assignment_3_prg5_6;

import java.util.Scanner;

/*#3
 * Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  
 */

public class CheckTargetArray {
	int countingTarget = 0;
	//int[] arr1;
	int target1;
	
	void isNumberPresent(int[] arr, int target) {
		for(int index=0; index<arr.length; index++) {
			if(arr[index]==target) {
				countingTarget = countingTarget+1;
			}
		}
	}
	
	void display() {
		if(countingTarget==0)
			System.out.println("Target number "+target1+" is not present in the array of numbers.");
		else System.out.println("Target number "+target1+" is present in the array of numbers.");
	}
	
	public static void main(String[] args) {
		CheckTargetArray checkTargetArray = new CheckTargetArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please tell us how many numbers you want to analyse.");
		int a = sc.nextInt();
		int[] arr2 = new int[a];
		for(int index=0; index<a; index++) {
			System.out.println("Enter "+(index+1)+" number");
			arr2[index]=sc.nextInt();
		}
		System.out.println("Enter one random number: ");
		int target2 = sc.nextInt();
		checkTargetArray.target1 = target2;
		checkTargetArray.isNumberPresent(arr2, target2);
		checkTargetArray.display();
	}
}
