/*
Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount

Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}
*/

package radha.ArrayOperations.Assignment17;

import java.util.Scanner;

public class EvenOddCount {
	
	void printEvenOddCount(int[] arr) {
		int evenCount=0;
		for(int index=0; index < arr.length;index++) {
			if(arr[index]%2==0)
				evenCount++;
		}
		System.out.println("Even numbers count is "+evenCount);
		int oddCount = arr.length - evenCount;
		System.out.println("Odd numbers count is "+oddCount);
	}
	
	int getDifference(int[] arr) {
		int evenSum=0, oddSum=0;
		for(int index=0; index < arr.length;index++) {
			if(arr[index]%2==0) {
				System.out.println(arr[index]+" is an Even number");
				evenSum = evenSum + arr[index];
			}
			else {
				System.out.println(arr[index]+" is Odd number.");
				oddSum = oddSum + arr[index];
			}
		}
		System.out.println("\nSum of even numbers is: "+evenSum);
		System.out.println("\nSum of odd numbers is: "+oddSum);
		return evenSum-oddSum;
	}
	
	public static void main(String[] args) {
		EvenOddCount evenOdd = new EvenOddCount();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Values to be inserted in an Array :");
		int size =sc.nextInt();	
		int[] arr = new int[size];
		for (int index = 0 ; index <arr.length; index++) {
				System.out.println("Enter value to add in an array :");
				arr[index] = sc.nextInt();
		}
		System.out.println("=============================================");
		evenOdd.printEvenOddCount(arr);
		System.out.println("=============================================");
		int diff = evenOdd.getDifference(arr);
		System.out.println("\nDifference between sum of Even numbers and Odd numbers is: "+diff);
		sc.close();
	}
}
/*
Output:
Enter number of Values to be inserted in an Array :
6
Enter value to add in an array :
12
Enter value to add in an array :
7
Enter value to add in an array :
30
Enter value to add in an array :
29
Enter value to add in an array :
13
Enter value to add in an array :
52
=============================================
Even numbers count is 3
Odd numbers count is 3
=============================================
12 is an Even number
7 is Odd number.
30 is an Even number
29 is Odd number.
13 is Odd number.
52 is an Even number

Sum of even numbers is: 94

Sum of odd numbers is: 49

Difference between sum of Even numbers and Odd numbers is: 45
 */
