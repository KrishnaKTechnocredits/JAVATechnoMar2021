package monali.Assignment_17;

import java.util.Scanner;

public class Program_4 {
	
	int count;
	int frequencyOfNumber(int[] arr, int targetNumber) {
		for(int index=0;index<arr.length;index++) {
		 if (arr[index] == targetNumber)
		 count++;
		 }
		  System.out.println("freq of target num is "+count);
		  return count;
	}
	
		  public static void main(String[] a) {
			 Scanner scanner = new Scanner(System.in);
		    System.out.println("Enter size");
			int size = scanner.nextInt();
		    int[] numbers = new int[size];
			for(int index=0;index<numbers.length;index++) {
				 System.out.println("Enter numbers");
                   numbers[index] = scanner.nextInt();
			}
                 System.out.println("enter target number");
                   int num = scanner.nextInt();
                   Program_4 program = new Program_4();
					program.frequencyOfNumber(numbers,num);
				 }
}
		  
		    
					
				 




                   //int size1 = numbers[index];//
					//for(int index2=0;index<numbers.length;index++) {
				     // for(int index3=0;index<numbers.length;index++) {
                         // int targetNumber = scanner.nextInt();
				         //[] numbers1 = new int[targetNumber];//

			

		


