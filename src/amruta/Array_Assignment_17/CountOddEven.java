/*  10th April 21 ------ Assignment 17 --- Program No 1
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
*/  

package amruta.Array_Assignment_17;

import madhavi_Raut.Assignment_17.CountOfOddEvenNumbers;

public class CountOddEven {
	int evencount, oddcount;

	void printevenoddnum(int[] input){
		System.out.println("Even numbers are : ");
			for(int index=0; index < input.length ; index++) {
				if(input[index] % 2 == 0)
				System.out.println(input[index]);
			}	
		}
	
	void findCountOfOddEvenNumbers(int[] num) {
		int evenCount = 0;
		for(int index=0; index<num.length; index++) {
			if(num[index] % 2 == 0)
				evenCount++;
		}
		System.out.println("Count of Even numbers in given array is: "+evenCount);
		System.out.println("Count of Odd numbers in given array is: "+(num.length-evenCount));		
	}
	
	public static void main(String[] args) {
		int[] num = {10,23, 26, 27, 88, 87, 65};
		new CountOddEven().printevenoddnum(num);
		new CountOddEven().findCountOfOddEvenNumbers(num);
	}
}
