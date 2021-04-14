/*
Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4

 */
package ravindra_J.Assignment_No_17_Array_Operations;

import java.util.Scanner;

public class CountPositveNegativeNumbers {
	public static void main(String[] args) {
		int negativeNumCount=0,positiveNumCount=0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of an Array");
		int size = scanner.nextInt();
		int[] input = new int[size];

		System.out.println("Enter the "+size+" elements of an array");
		for(int index=0;index<size;index++) {
			input[index]= scanner.nextInt();
			if(input[index]<0) 
				negativeNumCount++;
			else
				positiveNumCount++;
		}
		System.out.println("Negative number count in given array elements are : "+negativeNumCount+
				"\nPositive number count in given array elements are : "+positiveNumCount);

	}
}
