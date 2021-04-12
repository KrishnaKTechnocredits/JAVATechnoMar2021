/* Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
 */

package radha.ArrayOperations.Assignment17;

import java.util.Scanner;

public class FrequencyInArray {
	
	int findFrequency(int [] arr, int targetNumber) {
		int counter=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index] == targetNumber) 
				counter++;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		FrequencyInArray frequency = new FrequencyInArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Values to be inserted in an Array :");
		int size =sc.nextInt();	
		int[] arr = new int[size];
		for (int index = 0 ; index <arr.length; index++) {
				System.out.print("Enter value to add in an array :");
				arr[index] = sc.nextInt();
		}
		System.out.print("Enter a target number to find its frequency: ");
		int targetNum = sc.nextInt();
		int freq = frequency.findFrequency(arr, targetNum);
		System.out.println("================================================");
		System.out.println("Frequency of a number "+targetNum+" is "+freq);
		sc.close();
	}
}

/*
Output:
 
Enter number of Values to be inserted in an Array :
9
Enter value to add in an array :10
Enter value to add in an array :23
Enter value to add in an array :23
Enter value to add in an array :44
Enter value to add in an array :23
Enter value to add in an array :10
Enter value to add in an array :23
Enter value to add in an array :4
Enter value to add in an array :23
Enter a target number to find its frequency: 23
================================================
Frequency of a number 23 is 5
 */
