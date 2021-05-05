/*
 Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 
 */

package ankit.assignment_30;

import java.util.Arrays;

public class SecondBiggestNumber {
	void biggestNum(int[] intArr) {
		int max = intArr[0];
		for(int index = 0 ; index < intArr.length ; index++) {
			for(int innerIndex = 1; innerIndex < intArr.length ; innerIndex++) {
				if (max < intArr[innerIndex]) {
					max = intArr[innerIndex];
				}
			}
		}System.out.println(max);	
	}

	void secondBigNumber(int[] intArr) {
		Arrays.sort(intArr); // array by default sorted in ascending order
		int intArrLength = intArr.length;
		//System.out.println(intArr[intArrLength-1]);// Largest number
		System.out.println(intArr[intArrLength-2]); // Second largest number
	}

	int secondBigNumberWithoutPreDefinedFunction(int[] intArr) {
		int temp ;
		for(int i = 0 ; i < intArr.length ; i++) {
			for(int j = i+1; j < intArr.length ; j++) {
				if (intArr[i] > intArr[j]) {
					temp = intArr[i];
					intArr[i]= intArr[j];
					intArr[j] = temp;	
				}
			}
		}
		System.out.println("Required number is :"+intArr[intArr.length-2]);
		return intArr[intArr.length-2];// This will provide second largest number -Change value of N as per required biggest no
	}

	public static void main(String[] args) {
		SecondBiggestNumber secondBiggestNumber = new SecondBiggestNumber();
		int[] intArr = {40,20,30,60,80,45};
		//secondBiggestNumber.biggestNum(intArr);
		secondBiggestNumber.secondBigNumber(intArr);
		secondBiggestNumber.secondBigNumberWithoutPreDefinedFunction(intArr);
	}
}
