/*
 * Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
 */
package purva.Array.Assignment_17;

import java.util.Scanner;

public class ReturnMinNumber {

	int minimumNumber(int[] inputnumbers) {
		int minNumber = inputnumbers[0];
		for(int index=0;index<inputnumbers.length;index++) {
			 if(minNumber>inputnumbers[index]) 
				 minNumber = inputnumbers[index];	
			}
		System.out.println("Minimum number from array is :"+minNumber);
		return minNumber;
		}
	
	public static void main(String[] arg) {
		ReturnMinNumber returnMinNumber = new ReturnMinNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size= scanner.nextInt();
		int[] inputnumbers = new int[size];
		
		for(int index=0;index<inputnumbers.length;index++) {
			System.out.println("enter number"+(index+1));
			inputnumbers[index]= scanner.nextInt();
		}
		
		returnMinNumber.minimumNumber(inputnumbers);
	}
	

}
