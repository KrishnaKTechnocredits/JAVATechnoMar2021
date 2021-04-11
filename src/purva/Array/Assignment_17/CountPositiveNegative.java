/*Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65
output : negative -> 3
positive -> 4
 * 
 */
package purva.Array.Assignment_17;

import java.util.Scanner;

public class CountPositiveNegative {

	void CountOfPositiveNegative(int[] numbers) {
		int countPositive=0,countNegative=0;
		
		for (int index=0;index<numbers.length;index++) {
			if(numbers[index]<0)
				countNegative++;
			else
				countPositive++;
		}
		System.out.println("Count of positive number is "+countPositive);
		System.out.println("Count of negative number is "+countNegative);
		
	}
	
	public static void main(String[] args) {
		CountPositiveNegative countPositivenegative = new CountPositiveNegative();
		Scanner scanner = new Scanner(System.in);
	    System.out.println("how many number you want to enter? ");
	    int size = scanner.nextInt();
	   
	    int[] numbers = new int [size];
	    
	    for(int index=0; index<numbers.length;index++) {
	    	System.out.println("Enter number"+(index+1));
	    	numbers[index]=scanner.nextInt();
	    }
	    	
	    countPositivenegative.CountOfPositiveNegative(numbers);
		
	}
}
	

