/*
 Assignment - 17 : 10th April'2021
Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.
 */

package priyanka_Panat.assignment17;

import java.util.Scanner;

public class FindTargetNumInArray {
	boolean isNumberPresent(int[] input,int target){
		boolean isNumPresent=false;
		for(int index=0;index<input.length;index++) {
		if(input[index] == target) {
			isNumPresent=true;
		}
		}
	return isNumPresent;
			
	}   
	void printNumber(boolean isNumPresent,int targetnum) {
		if(isNumPresent) {
			System.out.println(targetnum + " is present in given array");
		}
		else
			System.out.println(targetnum + " is not present in given array");
			
	}

	public static void main(String[] args) {
		FindTargetNumInArray findTargetNumInArray=new FindTargetNumInArray();
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in an array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to find frequency from given string : ");
		int number=sc.nextInt();
		boolean isNumFound=findTargetNumInArray.isNumberPresent(arr, number);
		findTargetNumInArray.printNumber(isNumFound, number);
		sc.close();
		
	}
}

