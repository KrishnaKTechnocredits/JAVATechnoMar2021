package milind.Assignment_17;

import java.util.Scanner;

public class MaxNumArray {
	int maxNumFound(int[] inputNumber) {
		int maxNum=inputNumber[0];
		for(int index=1;index < inputNumber.length;index++) {
			if(maxNum < inputNumber[index]);
			maxNum=inputNumber[index];
		}
		return maxNum;
	}

	public static void main(String[] args) {
		MaxNumArray maxNumArray=new MaxNumArray();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How Many Numbers Enter: ");
		int size=scanner.nextInt();
		int[]inputNumber=new int[size];
		
		for(int index=1;index < inputNumber.length;index++) {
			System.out.println("Enter Number " +(index+1));
			inputNumber[index]=scanner.nextInt();
		}

	int maxNum = maxNumArray.maxNumFound(inputNumber);
		System.out.println("Maximum Number in Array is "+maxNum);
		scanner.close();
	}
}
