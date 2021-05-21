/*
 * Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65
output : even -> 3
odd -> array.length - evenCount
 */
package purva.Array.Assignment_17;

import java.util.Scanner;

public class EvenOddNumbers {
	  
	void evenOdd(int[] number) {
		 //int[] numbers =new int[7];
		 int evenCount = 0, oddCount = 0;
	     for(int index=0;index< number.length;index++) {
	    	 if(number[index]%2 ==0)
	    		 evenCount++;
	    	 else
	    		 oddCount++;
	     }
	     System.out.println("Even number count is "+evenCount);
	     System.out.println("odd number count is "+oddCount);
	 }
	
	public static void main(String[] args) {
		EvenOddNumbers evenOddNumbers = new EvenOddNumbers();
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter the count of numbers :");
		int size = scanner.nextInt();
		int[] number = new int[size];
		
		for(int index=0;index< number.length;index++) {
			System.out.println("enter Numbers "+(index+1));
		    number [index]=scanner.nextInt();
		}
		
		evenOddNumbers.evenOdd(number);
		
	}
	

}
