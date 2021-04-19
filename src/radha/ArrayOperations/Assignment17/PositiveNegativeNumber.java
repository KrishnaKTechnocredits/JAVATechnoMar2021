/*Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
 */

package radha.ArrayOperations.Assignment17;

import java.util.Scanner;

public class PositiveNegativeNumber {
	
	void positiveNegativeCount(int[] arr) {
		int positiveCount=0;
		for(int index=0; index < arr.length;index++) {
		if(arr[index]>0)
			positiveCount++;
		}
		System.out.println("Positive numbers count in the array is: "+positiveCount);
		int negativeCount = arr.length - positiveCount;
		System.out.println("Negative numbers count in the array is: "+negativeCount);
	}
	
	public static void main(String[] args) {
		PositiveNegativeNumber number = new PositiveNegativeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Values to be inserted in an Array :");
		int size =sc.nextInt();	
		int[] arr = new int[size];
		for (int index = 0 ; index <arr.length; index++) {
				System.out.print("Enter value to add in an array :");
				arr[index] = sc.nextInt();
		}
		System.out.println("==============================================");
		number.positiveNegativeCount(arr);
		sc.close();
	}
}

/*
Output:
Enter number of Values to be inserted in an Array :
5
Enter value to add in an array :-78
Enter value to add in an array :-5
Enter value to add in an array :56
Enter value to add in an array :-60
Enter value to add in an array :-29
==============================================
Positive numbers count in the array is: 1
Negative numbers count in the array is: 4
 */
