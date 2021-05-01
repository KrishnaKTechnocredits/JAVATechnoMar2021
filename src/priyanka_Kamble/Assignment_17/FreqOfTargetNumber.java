package priyanka_Kamble.Assignment_17;

import java.util.Scanner;

/*Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 4*/

/*Program 5: return true if you find a target number from given array else 
return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
if(arr[index] == target)
}*/

public class FreqOfTargetNumber {
	int count=0;boolean flag;
	void findTargetCount(int[] array, int target) {
		for (int index=0; index<array.length;index++) {
			if(array[index] == target)
				count++;
				flag=true;
		}
		System.out.println(target +" appears " +count+ " times in given array");
		if(!flag)
			System.out.println("Target number is not in an given array");
	}
	
	
	
	public static void main(String[] args) {
		int[] array = {10,23,23,44,23,10,23,4,23};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Target Value" );
		new FreqOfTargetNumber().findTargetCount(array,+scanner.nextInt());
		scanner.close();
	}
}
