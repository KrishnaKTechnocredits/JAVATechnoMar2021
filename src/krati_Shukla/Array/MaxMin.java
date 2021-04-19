//Program 6: From given array return max & min number.

package krati_Shukla.Array;

import java.util.Scanner;

public class MaxMin {
	
	int maximum(int[] input) {
		int max = input[0];
		for(int index =1; index<input.length; index++) {
			if (max < input[index])
				max = input[index];				
		}
		return max;
	}
	
	int minimum(int[] input) {
		int min = input[0];
		for(int index =1; index<input.length; index++) {
			if (min > input[index])
				min = input[index];				
		}
		return min;
	}
	
	public static void main(String[] a) {
		MaxMin maxMin = new MaxMin();
		int[] input = new int[5];
		for (int index=0; index<input.length; index++)
		{
			System.out.println("Enter number : "+index);
			Scanner scanner = new Scanner(System.in);
			input[index] = scanner.nextInt();
		}
		int max = maxMin.maximum(input);
		System.out.println("Maximum number is :"+max);
		int min = maxMin.minimum(input);		
		System.out.println("Minimum number is :"+min);
	}

}
