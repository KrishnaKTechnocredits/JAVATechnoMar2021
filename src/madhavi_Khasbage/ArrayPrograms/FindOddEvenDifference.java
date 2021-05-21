package madhavi_Khasbage.ArrayPrograms;

import java.util.Scanner;

/*Program 2:  return a difference between sum of even number and odd numbers.	
	From given numbers, count the odd and even numbers.
	input : 10,23,26,27,88,87,65 
    output : evenSum - oddSum
	
	int getDifference(int[] input){
	
	}*/

public class FindOddEvenDifference {
	int evenCount, oddCount, sumEven, sumOdd;

	void findCount(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 2 == 0) {
				evenCount++;
				sumEven += arr[index];
			} else {
				oddCount++;
				sumOdd += arr[index];
			}
		}
	}

	public static void main(String[] args) {
		FindOddEvenDifference oddEvenDiff = new FindOddEvenDifference();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in an array:");
		int size = scanner.nextInt();

		int[] array = new int[size];
		System.out.println("Please enter " + size + " elements, seperated by space only (eg. 12 3 4):");
		for (int index = 0; index < size; index++) {
			array[index] = scanner.nextInt();
		}
		oddEvenDiff.findCount(array);
		System.out.println("Even : " + oddEvenDiff.evenCount + "\nOdd : " + oddEvenDiff.oddCount);
		System.out.println("Sum of even numbers=" + oddEvenDiff.sumEven + " Sum of odd numbers=" + oddEvenDiff.sumOdd);
		System.out.println("Difference of Odd and even number is=" + (oddEvenDiff.sumEven - oddEvenDiff.sumOdd));
		scanner.close();
	}
}
