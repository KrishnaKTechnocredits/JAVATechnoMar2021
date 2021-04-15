/*Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)*/

package krati_Jain.Assignment_17;

import java.util.Scanner;

public class NumberPresenceInArray {

	public static void main(String[] args) {
		NumberPresenceInArray numPres = new NumberPresenceInArray();
		numPres.setData();
	}
	
	void setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of the array you want to create? (should be whole/positive number");
		int length = scan.nextInt();
		int[] inputArr = new int[length];
		System.out.println("Provide the elements for your array : ");
		for(int index = 0; index < length ; index ++) {
			inputArr[index]= scan.nextInt();
		}
		System.out.println("Provide a number which you want to verify in your array : ");
		int numToVerify = scan.nextInt();
		//verifyingNumber(numToVerify, inputArr);
		System.out.println(verifyingNumber(numToVerify, inputArr));
	}
	
	boolean verifyingNumber(int numToVerify, int[] inputArr) {
		boolean verifyFlag = false;
		for (int index = 0; index < inputArr.length; index++) {
			if ((inputArr[index] == numToVerify))
				verifyFlag = true;
			else
				verifyFlag = false;
				}
		return verifyFlag;
		
	}
	
}
