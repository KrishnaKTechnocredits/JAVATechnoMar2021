/*
Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88

Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/

package radha.ArrayOperations.Assignment17;

import java.util.Scanner;

public class MaxMinNum {

	int getMaxNum(int[] arr) {
		int max = arr[0];
		for(int index=1; index < arr.length;index++) {
			if(max < arr[index]) 
				max=arr[index];
		}
		return max;
	}
	
	int getMinNum(int[] arr) {
		int min = arr[0];
		for(int index=1; index < arr.length;index++) {
			if(min > arr[index]) 
				min=arr[index];
		}
		return min;
	}
	
	public static void main(String[] args) {
		MaxMinNum maxMin = new MaxMinNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Values to be inserted in an Array :");
		int size =sc.nextInt();	
		int[] arr = new int[size];
		for (int index = 0 ; index <arr.length; index++) {
				System.out.println("Enter value to add in an array :");
				arr[index] = sc.nextInt();
		}
		System.out.println("=================================================");
		int max = maxMin.getMaxNum(arr);
		System.out.println("Maximum number in the array is "+max);
		System.out.println("=================================================");
		int min = maxMin.getMinNum(arr);
		System.out.println("Maximum number in the array is "+min);
		sc.close();
	}
}
/*Output:
Enter number of Values to be inserted in an Array :
7
Enter value to add in an array :
22
Enter value to add in an array :
35
Enter value to add in an array :
65
Enter value to add in an array :
88
Enter value to add in an array :
11
Enter value to add in an array :
23
Enter value to add in an array :
45
=================================================
Maximum number in the array is 88
=================================================
Maximum number in the array is 11
*/