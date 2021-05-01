package milind.Assignment_17;

import java.util.Scanner;

public class DiffBetweenEvenAndOdd {
	int evenOddNum(int[] inputNumber) {
		int evensum=0;
		int oddsum=0;
		for(int index=0;index < inputNumber.length;index++) {
			if(inputNumber[index]% 2==0) {
				evensum=evensum + inputNumber[index];
			}else
				oddsum=oddsum + inputNumber[index];
		}
		System.out.println("Even Number is : " +evensum+ "\nodd Number sum is :" +oddsum+ "\nso difference of Both is = " +(evensum-oddsum));
		return (evensum-oddsum);
	}
	public static void main(String[] args) {
		 DiffBetweenEvenAndOdd  diffBetweenEvenAndOdd=new  DiffBetweenEvenAndOdd();
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("How many Numbers Enter :  ");
		 int size=scanner.nextInt();
		 int[] inputNumber=new int[size];
		 
		 for(int index=0;index < inputNumber.length;index++) {
			 System.out.println("Enter Numbers "+(index+1));
			 inputNumber[index]=scanner.nextInt();
		 }
		 diffBetweenEvenAndOdd.evenOddNum(inputNumber);
		 scanner.close();
	}
}
