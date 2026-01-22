/*Coding Test : 22 [26th June 2021] 
		
WAP to return the sum of all elements of an array, except ignore sections of numbers
starting with 6 and extending to the next 9. Return 0 for No numbers.

input 1: [1,3,5]
output 1: 9

input 2 : [4,5,6,12,2,9,1,3]
output 2: 13

input 3 : [2,1,6,9,11,6,19,12,9,2]
output 3: 16

input 4 : [6,1,4,5,9]
output 4 : 0

*/

package vaibhav.CodingExam22;

import java.util.Arrays;

public class SumOfElementsWithSection {

	int sumOfNumbers(int[] arr) { // {4,5,6,12,2,9,1,3};
		int sum = 0;
		boolean flag = true;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index]!=6 && flag) {
				sum = sum + arr[index];
			}else if (arr[index] == 6) {
				flag = false;
			}else if (arr[index] == 9) {
				flag = true;
			}		
		}

		return sum;
	}
	
	
	public static void main(String[] args) {

		SumOfElementsWithSection sumOfElementsWithSection = new SumOfElementsWithSection();

		int[] input1 = { 1, 3, 5 };
		int[] input2 = { 4, 5, 6, 12, 2, 9, 1, 3 };
		int[] input3 = { 2, 1, 6, 9, 11, 6, 19, 12, 9, 2 };
		int[] input4 = { 6, 1, 4, 5, 9 };
		
		int sum = sumOfElementsWithSection.sumOfNumbers(input1);
		System.out.println("Expected sum for input "+ Arrays.toString(input1)+  " is ==> "+ sum);
		
		int sum2 = sumOfElementsWithSection.sumOfNumbers(input2);
		System.out.println("Expected sum for input "+ Arrays.toString(input2)+  " is ==> "+ sum2);
		
		int sum3 = sumOfElementsWithSection.sumOfNumbers(input3);
		System.out.println("Expected sum for input "+ Arrays.toString(input3)+  " is ==> "+ sum3);
		
		int sum4 = sumOfElementsWithSection.sumOfNumbers(input4);
		System.out.println("Expected sum for input "+ Arrays.toString(input4)+  " is ==> "+ sum4);
	}

}
 