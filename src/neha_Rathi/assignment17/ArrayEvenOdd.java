/*Assignment - 17
From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
*/
package neha_Rathi.assignment17;

import java.util.Scanner;

public class ArrayEvenOdd {

	void evenOdd(int[] num) {
		int evenCount = 0;
		int oddCount = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] % 2 == 0) {
				evenCount++;
			}
		}
		oddCount = num.length - evenCount;
		System.out.println("event count is: " + evenCount + " & odd count is: " + oddCount);
	}

	public static void main(String[] args) {
		ArrayEvenOdd arrayEvenOdd = new ArrayEvenOdd();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You want to Enter:- ");
		int size = scanner.nextInt();
		int[] inputNumber = new int[size];
		for (int index = 0; index < inputNumber.length; index++) {
			System.out.println("Enter Number " + (index));
			inputNumber[index] = scanner.nextInt();
		}
		arrayEvenOdd.evenOdd(inputNumber);
	}
}
