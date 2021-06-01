package surabhi.assignment16_25;

import java.util.Scanner;

/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/

public class ArrayFrequency {
	
	int getFrequency(int[] input, int target) {
		int frequency=0;
		for(int index=0;index<input.length;index++) {
			if(input[index]==target) {
				frequency++;
			}
		}
		return frequency;
	}
	
	void printFrequency(int freq, int targetNumber) {
		System.out.println("Frequency of target number "+targetNumber+" is :"+freq);
	}

	public static void main(String[] args) {
		ArrayFrequency arrayFrequency=new ArrayFrequency();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the number of elements in array :");
		int size=scanner.nextInt();
		int[] arr=new int[size];
		for (int index=0;index<size;index++) {
			System.out.println("Enter the Array element number at "+index);
			arr[index]=scanner.nextInt();
		}
		System.out.println("Please enter the target number :");
		int targetNumber=scanner.nextInt();
		int frequency=arrayFrequency.getFrequency(arr, targetNumber);
		arrayFrequency.printFrequency(frequency, targetNumber);
	}

}
