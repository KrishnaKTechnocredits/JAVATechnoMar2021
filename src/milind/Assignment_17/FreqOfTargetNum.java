package milind.Assignment_17;

import java.util.Scanner;

public class FreqOfTargetNum {
	int numFreq(int[] inputNumber,int targetNum) {
	int targetNumCount=0;
	for(int index=0;index < inputNumber.length;index++) {
		if(inputNumber[index]==targetNum) {
			targetNumCount++;
		}
	}
	return targetNumCount;
 }
	public static void main(String[] args) {
		 FreqOfTargetNum  freqOfTargetNum=new  FreqOfTargetNum();
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("How Many Numbers Enter: ");
		 int size=scanner.nextInt();
		 int[] inputNumber=new int[size];
		 
		 for(int index=0;index < inputNumber.length;index++) {
			 System.out.println("Enter Numbers "+(index+1));
			 inputNumber[index]=scanner.nextInt();
	}
		 System.out.println("Enter Target Number : ");
		 int targetNum = scanner.nextInt();
		 int targetNumCount=freqOfTargetNum.numFreq(inputNumber, targetNum);
		 System.out.println("Target number is "+targetNum+ "\nfrequency of Target Number is :" +targetNumCount);
		 scanner.close();
}
}
