/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/

package krati_Jain.Assignment_17;

import java.util.Scanner;

public class FrequencyTargetNumber {
		
	public static void main(String[] args) {
		FrequencyTargetNumber numberFrequency = new FrequencyTargetNumber();
		Scanner scan = new Scanner(System.in);
		System.out.println("Provide the length of the array you want to create? (should be a whole number) : ");
		int arrLeng = scan.nextInt();
		int[] inputArr = new int[arrLeng];
		System.out.println("Enter the elements of array");
		
		for (int index =0; index <arrLeng ; index++) {
			inputArr[index]=scan.nextInt();
			}
				
		System.out.println("Provide a number who's frequency you want to check in your array : ");
		int numToCheck=scan.nextInt();
		int numFrequency = numberFrequency.checkingNumFrequency(inputArr, numToCheck);
		if (numFrequency == 0)
			System.out.println("Number you want to check is not present in the array");
		else
			System.out.println("Frequency of number '"+ numToCheck + "' is : " + numFrequency );
	}	
		
	int checkingNumFrequency(int[] inputArr, int numToCheck) {
		int count = 0;
		
		for(int index = 0; index < inputArr.length ; index++) {
			
			if(inputArr[index] == numToCheck)
				count++;
		}
		
		return count;
			
	}
	

}
