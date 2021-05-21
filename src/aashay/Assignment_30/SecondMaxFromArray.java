package aashay.Assignment_30;

import java.util.Arrays;

/*
 * Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 

Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation.
 */

public class SecondMaxFromArray {
	
	void secondMax(int [] arr) {
		int secondMax=arr[1];
		int firstMax=arr[0];
		int temp=0; 
		 
		for(int index=2; index < arr.length;index++) {
			if(firstMax < arr[index]) {
				secondMax = firstMax;
				firstMax=arr[index];
				
			}else if(secondMax < arr[index] && firstMax!= arr[index] ) {
				secondMax = arr[index];
				
			}
		}
		System.out.println("First max:"+firstMax+"Second max: "+secondMax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondMaxFromArray secondMaxFromArray = new SecondMaxFromArray();
		int [] arr = new int[] {100,33,430,55,97,11,30};
		secondMaxFromArray.secondMax(arr);
		
	}

}
