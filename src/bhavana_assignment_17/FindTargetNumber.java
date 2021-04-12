package bhavana_assignment_17;

import java.util.Scanner;

public class FindTargetNumber {
	
	boolean isTargetNumberPresent(int[] array,int targetNumber) {
		for(int index = 0;index<array.length;index++) {
			if(array[index]==targetNumber) 
				return true;
		}		
		return false;
	}

	public static void main(String[] args) {
		FindTargetNumber ftn = new FindTargetNumber();
		int[] arr = {10,23,23,44,23,10,23,4,23};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the target number:");
		int targetNumber = sc.nextInt();
		boolean flag = ftn.isTargetNumberPresent(arr,targetNumber);	
        
		if(flag == true)
        	System.out.println(targetNumber+" number is present");
        else
        	System.out.println(targetNumber+" number is not present");
	}

}