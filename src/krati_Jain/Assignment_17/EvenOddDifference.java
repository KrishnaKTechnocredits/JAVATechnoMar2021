/*Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}*/

package krati_Jain.Assignment_17;

import simmi.assignment_17_Array.OddEven;

public class EvenOddDifference {
	
	int countEven;
	int countOdd;
	int evenSum;
	int oddSum;
	int diffSum;
	void operationOnArray(int[] inputArray) {
		for(int index=0; index<inputArray.length; index++) {
			if (inputArray[index]%2==0) {
				countEven++;
				evenSum += inputArray[index];
			} else {
				oddSum += inputArray[index];
				countOdd++;
			}
		}
	System.out.println("Count of Even numbers in the given array : " + countEven);
	System.out.println("Count of Odd numbers in the given array : " + countOdd);
	if (oddSum > evenSum)
	System.out.println("Difference betweem the sum of Even and Odd numbers is : " + (oddSum - evenSum));
	else
	System.out.println("Difference betweem the sum of Even and Odd numbers is : " + (evenSum - oddSum));
	}
	
	public static void main(String[] args) {
		EvenOddDifference evnOddDiff = new EvenOddDifference();
		int[] inputArray = {11,22,33,44,55,66,77,88,99,0,2};
		evnOddDiff.operationOnArray(inputArray);

	}
}
