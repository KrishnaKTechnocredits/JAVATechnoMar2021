package milind.Assignment_17;

import java.util.Scanner;

public class CountNegavtiveAndPositiveNum {
	void positiveNegavtiveCount(int[] inputNumber) {
		int positivecount=0;
		for(int index=0;index < inputNumber.length;index++) {
			if(inputNumber[index]>=0)
				positivecount++;
		}
		System.out.println("Total count of positive numbers are :" +positivecount);
		System.out.println("Total count of negative numbers are :" +(inputNumber.length - positivecount));
	}
	public static void main(String[] args) {
		CountNegavtiveAndPositiveNum countNegavtiveAndPositiveNum=new CountNegavtiveAndPositiveNum();
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many numbers you want to be entre:  ");
		int size=scanner.nextInt();
		int[]inputNumber=new int[size];
		
		for(int index=0;index<=inputNumber.length-1;index++) {
			System.out.println("Enter Number " +(index + 1));
			inputNumber[index]=scanner.nextInt();
		}
		countNegavtiveAndPositiveNum.positiveNegavtiveCount(inputNumber);
		scanner.close();
	}
}
