package krati_Jain.Assignment_17;

import java.util.Scanner;

public class MaxNumberInArray {
	
	int count = 0;

	public static void main(String[] args) {
		MaxNumberInArray maxNum = new MaxNumberInArray();
		maxNum.setData();
	}
	
	void setData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the length of the array you want to create? (should be whole/positive number)");
		int length = scan.nextInt();
		int[] inputArr = new int[length];
		System.out.println("Provide the elements for your array : ");
		for(int index = 0; index < length ; index ++) {
			inputArr[index]= scan.nextInt();
		}
		
		int MaxNumber = findMaxNum(inputArr);
		if (count==inputArr.length-1)
			System.out.println("All numbers in the array are same : " + MaxNumber);
		else
			System.out.println(MaxNumber + " is the maximum number in our array");
	}
	
	int findMaxNum(int[] inputArr) {
		int tempNum = inputArr[0];
		for (int index = 1; index<inputArr.length; index++ ) {
			if ((inputArr[index]) > tempNum ) {
				tempNum = inputArr[index];
			}
			else if ((inputArr[index]) == tempNum ) {
				count++;
			}
		}
		
		return tempNum;
					
		}
}
