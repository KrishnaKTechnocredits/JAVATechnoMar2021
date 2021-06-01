/* Assignment 6 : 30th March 2021

Write only one program having following methods. [4 methods in same program]

1. On user define range print all even numbers.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	

2. On user define range print all numbers which is divisible by 5.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all numbers which is divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user define range print all numbers which is divisible by 7 or 13.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
*/

package aparna.assignment7;

public class NumberCalculationWithWhileLoop {

	void printEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even Numbers are:- ");

		while (startIndex <= endIndex) {
			if (startIndex % 2 == 0) {
				System.out.println(startIndex);
			}
			startIndex++;
		}

	}

	void divisibleByFive(int startIndex, int endIndex) {

		System.out.println("Divisible by 5, numbers are: ");

		while (startIndex <= endIndex) {
			if (startIndex % 5 == 0) {
				System.out.println(startIndex);
			}
			startIndex++;
		}
	}

	void divisibleByFiveAndThree(int startIndex, int endIndex) {

		System.out.println("Divisible by 5 & 3, numbers are: ");

		while (startIndex <= endIndex) {
			if (startIndex % 5 == 0 && startIndex % 3 == 0) {
				System.out.println(startIndex);

			}
			startIndex++;
		}
	}

	void divisibleBySevenOrThree(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are: ");

		while (startIndex <= endIndex) {
			if (startIndex % 7 == 0) {
				System.out.println(startIndex + " is divisible by 7");
			} else if (startIndex % 13 == 0) {
				System.out.println(startIndex + " is divisible by 13");
			}
			startIndex++;
		}
	}

	public static void main(String[] args) {
		NumberCalculationWithWhileLoop numberCalculationWithWhileLoop = new NumberCalculationWithWhileLoop();
		numberCalculationWithWhileLoop.printEvenNumbers(10, 15);
		numberCalculationWithWhileLoop.divisibleByFive(10, 30);
		numberCalculationWithWhileLoop.divisibleByFiveAndThree(5, 18);
		numberCalculationWithWhileLoop.divisibleBySevenOrThree(5, 40);
	}

}
