/*
 * Program 2: return a difference between sum of even number and odd numbers.
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : evenSum - oddSum
 */
package purva.Array.Assignment_17;

import java.util.Scanner;

public class DifferenceOfSumOfEvenOdd {
	
      int sumOfEvenOddDifference(int[] number) {
	     int evenSum = 0, oddSum = 0;
		 for(int index=0;index< number.length;index++) {
		    if(number[index]%2 ==0)
		    	evenSum+=number[index];
		    else
		       oddSum+=number[index];
		     }
		  System.out.println("Even number sum "+evenSum+ " and odd number sum "+oddSum+" difference is "+(evenSum-oddSum));
		  return (evenSum - oddSum);
		 }
		
		public static void main(String[] args) {
			DifferenceOfSumOfEvenOdd differenceOfSumOfEvenOdd = new DifferenceOfSumOfEvenOdd();
			Scanner scanner = new Scanner(System.in); 
			System.out.println("Enter the count of numbers :");
			int size = scanner.nextInt();
			int[] number = new int[size];
			
			for(int index=0;index< number.length;index++) {
				System.out.println("enter Numbers "+(index+1));
			    number [index]=scanner.nextInt();
			}
			
			differenceOfSumOfEvenOdd.sumOfEvenOddDifference(number);
			
		}
}

