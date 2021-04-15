/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}
 */

package radha.ArrayOperations.Assignment17;

import java.util.Scanner;

public class NumPresenceArray {
	
	boolean isNumberPresent(int[] arr,int target){
		int count =0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index] == target)
				count ++;	
		}
		if(count>0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		NumPresenceArray presence = new NumPresenceArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Values to be inserted in an Array :");
		int size =sc.nextInt();	
		int[] arr = new int[size];
		for (int index = 0 ; index <arr.length; index++) {
				System.out.print("Enter value to add in an array :");
				arr[index] = sc.nextInt();
		}
		System.out.print("Enter a target number to find its frequency: ");
		int targetNum = sc.nextInt();
		boolean isPresent = presence.isNumberPresent(arr, targetNum);
		System.out.println("=========================================");
		if(isPresent == true)
			System.out.println("Number "+targetNum+" is found in the array.");
		else
			System.out.println("Number "+targetNum+" is not found in the array.");
		sc.close();
	}
}

/*
 Output:
 
Enter number of Values to be inserted in an Array :
6
Enter value to add in an array :10
Enter value to add in an array :23
Enter value to add in an array :41
Enter value to add in an array :10
Enter value to add in an array :17
Enter value to add in an array :10
Enter a target number to find its frequency: 10
=========================================
Number 10 is found in the array.
 
 */
