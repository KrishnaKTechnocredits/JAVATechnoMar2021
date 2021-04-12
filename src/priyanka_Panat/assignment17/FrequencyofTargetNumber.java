/*
 Assignment - 17 : 10th April'2021		 
Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
 */

package priyanka_Panat.assignment17;

import java.util.Scanner;

public class FrequencyofTargetNumber {
	int getnumFrequency(int[] num,int targetNum) {
		int count=0;
		for(int index=0;index<num.length;index++) {
		if(num[index]==targetNum) 
			count++;
		}
		return count;
	}
	public static void main(String[] args) {
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter the elements in an array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number to find frequency from given string");
		int number=sc.nextInt();
		int frequency=new FrequencyofTargetNumber().getnumFrequency(arr,number);
		System.out.println("Frequency of entered num is : " + frequency);
		sc.close();
}
}
