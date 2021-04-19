package monika.Assignment17_Array;

import java.util.Scanner;

/*Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 5*/
public class FreqOfTargetNumUsingArray {
	
	int getFreqOfTargetNum(int[] arr, int targetNum) {
		int count = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index]== targetNum)
				count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,23,23,44,23,10,23,4,23};
		FreqOfTargetNumUsingArray obj = new FreqOfTargetNumUsingArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide target no. ");
		System.out.println("Count of target no : "+obj.getFreqOfTargetNum(arr, sc.nextInt()));
		
	}

}
