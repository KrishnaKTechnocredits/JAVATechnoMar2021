/*
 * Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 4
 */
package purva.Array.Assignment_17;

import java.util.Scanner;

public class FrequencyOfNumber {
	
	int frequency(int[] numbers, int targetNumber) {
		int freTargetNumber=0;
		for (int index=0;index<numbers.length;index++) {
	          if(numbers[index]==targetNumber) 
	        	  freTargetNumber++;
	          
		}
	     System.out.println("frequency of target number "+ targetNumber+" is "+freTargetNumber);
	     return freTargetNumber;
	}
	
	
	public static void main(String[] args) {
		FrequencyOfNumber frequencyOfNumber = new FrequencyOfNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size= scanner.nextInt();
		int[] numbers = new int[size];
		
		for(int index=0;index<numbers.length;index++) {
			System.out.println("enter number"+(index+1));
			numbers[index]= scanner.nextInt();
		}
		System.out.println("Enter targetNumber ");
		int targetNumber =scanner.nextInt();
		int freTargetNumber =frequencyOfNumber.frequency(numbers,targetNumber);
		

	}
}

