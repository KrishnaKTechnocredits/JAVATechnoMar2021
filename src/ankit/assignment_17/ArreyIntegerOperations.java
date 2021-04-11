package ankit.assignment_17;

import java.util.Scanner;

public class ArreyIntegerOperations {

	void valuesInArray(int[] num) {
		System.out.println("*****VALUES IN ARRAY*****");
		for(int index = 0; index<num.length;index++) {
			System.out.println(num[index]+ " ");
		}
	}

	void printEvenOddCount(int[] num) {
		System.out.println("*****PRINT ODD AND EVEN COUNTS IN ARRAY*****");
		int evenCount = 0;
		for(int index = 0; index<num.length;index++) {
			if(num[index] % 2 == 0) {
				evenCount++;
			}
		}
		System.out.println("Count of even numbers in array :" +evenCount);
		System.out.println("Count of Odd numbers in array : " +(num.length-evenCount));
	}
	int getevenNumberOddNumberDiff(int[] num) {
		System.out.println("*****DIFF BETWEEN ODD AND EVEN SUM IN ARRAY*****");
		int evenSum = 0, oddSum = 0;
		for(int index = 0; index<num.length;index++) {
			if(num[index] % 2 == 0) {
				evenSum = evenSum+num[index];
			}
			else {
				oddSum = oddSum + num[index];
			}
		}
		System.out.println("Even number Summation :" +evenSum+ " Odd Numbers summation :"+oddSum);
		return ((evenSum-oddSum));
	}

	void countNegPost(int[] num) {
		System.out.println("*****POSITIVE/NEGATIVE VALUES COUNT IN ARRAY*****");
		int positiveCount = 0, negativeCount = 0;
		for(int index = 0; index<num.length;index++) {
			if(num[index] > 0) {
				positiveCount++;
			}
			else {
				negativeCount++;	
			}
		}
		System.out.println("Positive values count "+positiveCount);
		System.out.println("Negative values count "+negativeCount);
	}

	int getTargetNumFrequency(int[] num, int targetNum) {
		System.out.println("*****TARGET NUMBER FREQUENCY IN ARRAY*****");
		int targetCount = 0;
		for(int index = 0; index<num.length;index++) {
			if(num[index] == targetNum) {
				targetCount++;
			}			
		}return targetCount;
	}

	boolean istargetavailable(int[] num, int targetNum) {
		System.out.println("*****TARGET NUMBER AVAILABLE IN ARRAY*****");
		for(int index = 0; index<num.length;index++) {
			if(num[index] == targetNum) {
				return true;
			}
		}
		return false;
	}

	int maxNumberFromArray(int[] num) {
		System.out.println("*****MAXIMUM NUMBER FROM ARRAY*****");
		int maxNum = num[0];
		for(int index = 1; index<num.length;index++) {
			if(num[index] > maxNum) {
				maxNum = num[index];
			}			
		}return maxNum;
	}

	int minNumberFromArray(int[] num) {
		System.out.println("*****MINIMUM NUMBER FROM ARRAY*****");
		int minNum = num[0];
		for(int index = 1; index<num.length;index++) {
			if(num[index] < minNum) {
				minNum = num[index];
			}			
		}return minNum;
	}
	public static void main(String[] args) {
		ArreyIntegerOperations arreyIntegerOperations = new ArreyIntegerOperations();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Values required in Array :");
		int size =scanner.nextInt();
		if(size<0) {
			System.out.println("Enter valid value for array size");
		}
		else {	
			int[] arr = new int[size];
			for (int index = 0 ; index <arr.length; index++) {
				System.out.println("Enter "+(index+1)+ " Value to add in array :");
				arr[index] = scanner.nextInt();
			}
			arreyIntegerOperations.valuesInArray(arr);
			System.out.println("Enter Target Number :");
			int tagretNum = scanner.nextInt();
			arreyIntegerOperations.printEvenOddCount(arr);
			int diffEvenOdd = arreyIntegerOperations.getevenNumberOddNumberDiff(arr);
			System.out.println("Difference of Even and Odd sums : " +diffEvenOdd);
			arreyIntegerOperations.countNegPost(arr);
			int targetCnt = arreyIntegerOperations.getTargetNumFrequency(arr, tagretNum);	
			System.out.println("Frequency of target integer is :"+targetCnt);
			boolean istrgtavailable = arreyIntegerOperations.istargetavailable(arr, tagretNum);
			System.out.println("Target Integer available in array : "+istrgtavailable);
			int maximumNum = arreyIntegerOperations.maxNumberFromArray(arr);
			System.out.println("Maximum number from Array is : "+maximumNum);
			int minimunNum = arreyIntegerOperations.minNumberFromArray(arr);
			System.out.println("Minimum number from Array is : "+minimunNum);
			scanner.close();
		}
	}
}

/*
Assignment - 17 : 10th April'2021

Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : even -> 3
odd -> array.length - evenCount

Program 2: return a difference between sum of even number and odd numbers.
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : evenSum - oddSum

int getDifference(int[] input){

}

Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65
output : negative -> 3
positive -> 4


Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 4

Program 5: return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
if(arr[index] == target)

}

Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88

Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11

 */