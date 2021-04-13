/*
 Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
 */

package upasana.assignment_17;

import java.util.Scanner;
public class Frequency {
	
	int freq(int target) {
		int freq=0;
		int[] arr= {10,23,23,44,23,10,23,4,23};
		for(int index=0;index<arr.length;index++){
			if(arr[index]==target)
			freq++;
		}
		return freq;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter target number ");
		int tar=sc.nextInt();
		int count=new Frequency().freq(tar);
		System.out.println("Frequency of "+tar + " is " + count);
		sc.close();
	}

}
