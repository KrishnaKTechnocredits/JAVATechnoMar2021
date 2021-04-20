
/*Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23*/

package kajal.returntypeExamples;

import java.util.Scanner;

public class Assignment25p1 {
	
	int[] getPrimeNumbers(int startIndex, int endIndex) {
		int count = 0;
		int primeIndex = 0;
		int[] primeNumArr = new int[5];
		for (int index = startIndex; index < endIndex; index++) {
			boolean primeFlag = true;
			for (int innnerind = 2; innnerind < index / 2; innnerind++) {
				if (index % innnerind == 0) {
					primeFlag = false;
					break;
				}
			}

			if (primeFlag == true) {
				primeNumArr[primeIndex] = index;
				primeIndex++;
			}

			if (primeIndex == 5)
				break;

		}
		return primeNumArr;
	}
	public static void main(String[] args) {

		Assignment25p1 assign = new Assignment25p1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Start index of the range for prime numbers: ");
		int startIndex = scanner.nextInt();
		System.out.println("Enter the End index of the range for prime numbers: ");
		int endIndex = scanner.nextInt();

		int[] primeNumArr = assign.getPrimeNumbers(startIndex, endIndex);

		System.out.println("First 5 Prime numbers between " + startIndex + " and " + endIndex + " are : ");

		for (int index = 0; index < primeNumArr.length; index++) {
			if (primeNumArr[index] != 0)
				System.out.println(primeNumArr[index]);
		}

	}
}