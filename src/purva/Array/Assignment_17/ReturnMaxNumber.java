/*
 * Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
 */
package purva.Array.Assignment_17;

import java.util.Scanner;

public class ReturnMaxNumber {

	int maximumNumber(int[] inputnumbers) {
		int maxNumber = inputnumbers[0];
		for(int index=0;index<inputnumbers.length;index++) {
			 if(maxNumber<inputnumbers[index]) 
				 maxNumber = inputnumbers[index];	
			}
		System.out.println("Maximum number from array is :"+maxNumber);
		return maxNumber;
		}
	
	public static void main(String[] arg) {
		ReturnMaxNumber returnMaxNumber = new ReturnMaxNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size= scanner.nextInt();
		int[] inputnumbers = new int[size];
		
		for(int index=0;index<inputnumbers.length;index++) {
			System.out.println("enter number"+(index+1));
			inputnumbers[index]= scanner.nextInt();
		}
		
		returnMaxNumber.maximumNumber(inputnumbers);
	}
}
