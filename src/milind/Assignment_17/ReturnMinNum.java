package milind.Assignment_17;

import java.util.Scanner;

public class ReturnMinNum {
	
	int minNumber(int[] inputNumber) {
		int minNum=inputNumber[0];
		for(int index=1;index > inputNumber.length;index++) {
			if(minNum > inputNumber[index])
			  minNum = inputNumber[index];
		}
		return minNum;
	}
	public static void main(String[] a) {
		ReturnMinNum returnMinNum=new ReturnMinNum();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How Many Number Enter:  ");
		int size=scanner.nextInt();
		int[] inputNumber=new int[size];
		
		for(int index=1;index > inputNumber.length;index++) {
			System.out.println("Enter Number "+(index + 1));
			inputNumber[index]=scanner.nextInt();
		}
		int minNum=returnMinNum.minNumber(inputNumber);
		System.out.println("Min Number in the array is: "+minNum);
		scanner.close();
	}
}
