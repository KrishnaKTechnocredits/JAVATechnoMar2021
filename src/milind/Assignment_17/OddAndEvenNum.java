package milind.Assignment_17;

import java.util.Scanner;

public class OddAndEvenNum {
	void totalCountEvenOdd(int[] inputNumber) {
		int evenCount=0;
		for(int index=0;index < inputNumber.length;index++) {
			if(inputNumber[index]% 2==0) {
				evenCount++;
			}
		}
		System.out.println("Total Count of Even Number Are: "+ evenCount);
		System.out.println("Total Count of Odd Number Are: "+ ((inputNumber.length)-evenCount));
	}
	public static void main(String[] a) {
		 OddAndEvenNum  oddAndEvenNum=new  OddAndEvenNum();
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		int[] inputNumber=new int[size];
		
		for(int index=0;index < inputNumber.length;index++) {
			System.out.println("Enter Number "+(index + 1));
			inputNumber[index]=scanner.nextInt();
		}
		oddAndEvenNum.totalCountEvenOdd(inputNumber);
		scanner.close();
		
	}
}
