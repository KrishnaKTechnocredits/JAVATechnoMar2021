package ashwini.arrayAssignment17;

import java.util.Scanner;

/*
 Program 5:  return true if you find a target number from given array else return false.
input : 10,23,23,44,23,10,23,4,23
target number : 45
output : Number 45 doesnt found in given array.

boolean isNumberPresent(int[] arr,int target){
	if(arr[index] == target)
		
}  

 */

public class FindingTargetedNum {
	boolean isTargetNumberPresent(int[] input,int targetNumber) {
		for(int index = 0;index<input.length;index++) {
			System.out.println(input[index]);
			if(input[index]==targetNumber) 
				return true;
		}		
		return false;
	}

	public static void main(String[] args) {
		FindingTargetedNum findingTargetedNum = new FindingTargetedNum();
		int[] array = {10,23,23,44,23,10,23,4,23};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target number:");
		int targetNumber = sc.nextInt();
		boolean flag = findingTargetedNum.isTargetNumberPresent(array,targetNumber);	
        
		if(flag == true)
        	System.out.println(targetNumber+" number is present in the given array");
        else
        	System.out.println(targetNumber+" number is not present in the given array");
	}

}
