package komal.Assignment_17;

import java.util.Scanner;

/*Assignment - 17 : 10th April'2021

Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/

public class OddAndEvenNumber {
	
	void totalCountOfEvenNOdd(int[] inputNumber){
		int evenCount = 0;
		for(int index=0;index < inputNumber.length; index++){
			if(inputNumber [index] % 2 == 0) {
				evenCount++;
			}
		}
			System.out.println("total Count of Even Numbers are " + evenCount);
			System.out.println("total Count of Odd numbers are : " + ((inputNumber.length)-evenCount));
		}
	
	public static void main(String[] args){
		OddAndEvenNumber oddAndEvenNumber = new OddAndEvenNumber();
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You Want To Enter:- ");
		int size =scanner.nextInt();
		int[] inputNumber =new int[size];
		
		for (int index = 0;index <= inputNumber.length - 1; index++){
				System.out.println("Enter Numbers " + (index + 1));
				inputNumber[index] = scanner.nextInt();
		}
		oddAndEvenNumber.totalCountOfEvenNOdd(inputNumber);
		scanner.close();
	}
}
