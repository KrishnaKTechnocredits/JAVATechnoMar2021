package ashtha.Assignment17;

import java.util.Scanner;

public class IntegersArray {
	static int frequencyOfNumber = 0;

//Method to print the array
	void printArray(int[] num) {
		System.out.println("The numbers in the array are :");
		System.out.println("                               ");
		for (int index=0;index<num.length;index++) {
			System.out.print(num[index]+" ");
		}
	}

/*Method to count odd and even from given numbers
Method to return a difference between sum of even number and odd numbers. */
	
	int differenceBetweenSumOfEvenOdd(int[] num) {
		System.out.println("                                     ");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("The count of even and odd numbers and the difference between even and odd : ");
		int count =0;
		int evenSum =0;
		int oddSum =0;
		for (int index=0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				evenSum += (num[index]);
				count++;
			}else
				oddSum += (num[index]);	
		}
		System.out.println("                                   ");
		System.out.println("The count of even number = "+count);
		System.out.println("The count of odd number = "+(num.length-count));
		/*System.out.println("Even Sum :"+evenSum);
		System.out.println("Odd Sum :"+oddSum);*/
		int difference = evenSum - oddSum;
		return difference;		
	}
	
//Method to count negative and positive number	
	
	void countOfNegativeAndPositive(int[] num) {
		System.out.println("-----------------------------------------------------");
		System.out.println("The count of negative and positive numbers : ");
		System.out.println("            ");
		int positiveCount = 0;
		for (int index=0; index < num.length; index++) {
			if (num[index] > 0)
				positiveCount++;
		}
		System.out.println("The count of positive number = "+positiveCount);
		System.out.println("The count of negative number = "+(num.length-positiveCount));
	}

// Method to check if a number present in the given array 
	
	boolean checkNumberAndFrequency(int[] num, int targetNum) {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("To check whether the number is present in the array and the frequency");
		System.out.println("                            ");
		boolean flag = false;
		for (int index=0; index< num.length; index++) {
			if (num[index]==targetNum) {
				flag = true;
				frequencyOfNumber++;
			}
		}
		return flag;
	}
	
//Method to max number and min number in an array
	
	void maxAndMin(int[] num) {
		System.out.println("-------------------------------------------------");
		System.out.println("The max and the min number in the array : ");
		System.out.println("                                           ");
		int max = num[0];
		int min = num[0];
		for (int index=1; index<num.length; index++) {
			if(num[index]>max)
				max = num[index];
			if(num[index]<min) 
				min = num[index];
		}
		System.out.println("The maximum number in the array is "+max);		
		System.out.println("The minimum number in the array is "+min);
	}
	
	public static void main(String[] args) {
		IntegersArray integersArray = new IntegersArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many values do you want to enter in Array :");
		int arraySize =scanner.nextInt();
		int[] inputNumbers = new int[arraySize];
		if(arraySize<0) {
			System.out.println("Enter a valid value");
		}
		else{	
			for (int index = 0 ; index <arraySize; index++) {
				System.out.println("Enter the "+(index+1)+" value to add in Array");
				inputNumbers[index] = scanner.nextInt();
				}
		}
		System.out.println("Enter the target number to find in the array");
		int targetNumber = scanner.nextInt();
		integersArray.printArray(inputNumbers);
		int diff =integersArray.differenceBetweenSumOfEvenOdd(inputNumbers);
		System.out.println("The difference between even and odd numbers = "+diff);
		integersArray.countOfNegativeAndPositive(inputNumbers);
		boolean flag = integersArray.checkNumberAndFrequency(inputNumbers,targetNumber);
		if (flag)
			System.out.println("The number "+targetNumber+" is present in the array and the frequency of number = "+frequencyOfNumber);
		else
			System.out.println("The number "+targetNumber+" is not found in the array");
		integersArray.maxAndMin(inputNumbers);
		scanner.close();
	}
}
