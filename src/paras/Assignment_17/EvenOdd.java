/*
Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
	  
Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}
   
Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
		 
		 
Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4

Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  

Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88

Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/
package paras.Assignment_17;

import java.util.Scanner;

public class EvenOdd {
	
	void evenNumbers(int[] number) {
		int evenCount = 0;
		for(int index = 0; index<number.length; index++){
	//	System.out.println(number[index]);
			if(number[index] % 2 == 0){
				evenCount++;
		}
	}
		System.out.println("\nEven number count is - " + evenCount);
		
		System.out.println("\nOdd number Count is -  " + (number.length - evenCount));
}
	int getDifference(int[] input) {
		int sumEven = 0;
		int sumOdd = 0;
		for(int index = 0; index<input.length; index++){
		//	System.out.println(input[index]);
				if(input[index] % 2 == 0){
					sumEven = input[index] + sumEven;
			}else {
					sumOdd = input[index] + sumOdd;
			}
		}
		return sumEven - sumOdd;
	}
	
	void targetNumberFrequency(int[] number, int target) {
		int targetFrequency = 0;
		for(int index = 0; index < number.length; index++) {
			if (number[index] == target) {
				targetFrequency++;
			}
		}
		System.out.println("\nFrequency of Entered Target number " + target + " is " + " - " + targetFrequency);
		
}
	
	boolean findTargetNumber(int[] number, int Target) {
		for (int index = 0; index < number.length; index++) {
			if(number[index] == Target) {
				return true;
			}
		}return false;
}
	
	int maxNumber(int[] number) {
		int max = number[0];
		for(int index = 1; index < number.length; index++) {
			if(number[index] > max) {
				max = number[index];
			}
		}return max;
		
	}
	
	int minNumber(int[] number) {
		int min = number[0];
		for(int index = 1; index < number.length; index++) {
			if(number[index] < min) {
				min = number[index];
			}
		}return min;
		
	}
	
	void positiveAndNegativeCount(int[] number) {
		int positiveCount = 0;
		int negativeCount = 0;
		for(int index = 0; index < number.length; index++) {
			if(number[index] > 0) {
				positiveCount++;
			}else
				negativeCount++;
		}
		System.out.println("\nPositive Number from Given Array is - " + positiveCount);
		System.out.println("\nNegative Number from Given Array is - " + negativeCount);
	}
	
	public static void main(String[] args) {
		EvenOdd evenOdd = new EvenOdd();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Vaue of Array Size: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		for(int index = 0; index < arr.length; index++) {
			System.out.println("Please Enter Number in array: ");
			arr[index] = scanner.nextInt();
		}
		System.out.println("Please enter target number: ");
		int targetNumber = scanner.nextInt();
		evenOdd.evenNumbers(arr);
		int difference = evenOdd.getDifference(arr);
		System.out.println("\nDifference between sum of Even and Odd number is " + difference);
		evenOdd.targetNumberFrequency(arr, targetNumber);
		boolean istargetAvailable = evenOdd.findTargetNumber(arr, targetNumber);
		System.out.println("\nEntered Target number is Available? " + " - " + istargetAvailable);
		int maxNumber = evenOdd.maxNumber(arr);
		System.out.println("\nMax Number from above entered array is - " + maxNumber);
		int minNumber = evenOdd.minNumber(arr);
		System.out.println("\nMin Number from above entered array is - " + minNumber);
		evenOdd.positiveAndNegativeCount(arr);
	}
}
