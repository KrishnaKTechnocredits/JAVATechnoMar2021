package surabhi.assignment16_25;

import java.util.Scanner;

public class BooleanArray {
	
	boolean isFound(int[] input, int targetNumber) {
		boolean isFound=false;
		for(int index=0;index<input.length;index++) {
			if(input[index]==targetNumber) {
				isFound=true;
			}
		}
		return isFound;
	}
	
	void printFound(boolean isNumberFound, int targetNumber) {
		if(isNumberFound) {
			System.out.println(targetNumber+" is found in the array");
		}else
			System.out.println(targetNumber+" is not found in the array");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BooleanArray booleanArray=new BooleanArray();
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
		boolean isNumberFound=booleanArray.isFound(arr, targetNumber);
		booleanArray.printFound(isNumberFound, targetNumber);
	}

}
