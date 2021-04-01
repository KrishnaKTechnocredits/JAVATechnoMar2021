/*
Assignment 08
Write only one program having following methods using While Loop. [4 methods in same program]

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
package madhavi_Raut;

public class MathUsingWhileLoop {

	void displayEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are: ");
		int index = startIndex; 
		while (index <= endIndex) {
			if (index % 2 == 0)
				System.out.println(index);
			index++;
		}
	}

	void displayDivisibleBy5(int startIndex, int endIndex) {
		System.out.println("Divisble by 5, numbers are: ");
		int index = startIndex; 
		while (index <= endIndex) {
			if (index % 5 == 0)
				System.out.println(index);
			index++;
		}
	}

	void displayDivisibleBy5and3(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		int index = startIndex; 
		while (index <= endIndex) {
			if ((index % 3 == 0) && (index % 5 == 0))
				System.out.println(index);
			index++;
		}
	}

	void displayDivisibleBy7or13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		int index = startIndex; 
		while (index <= endIndex) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by " + 7);
			if (index % 13 == 0)
				System.out.println(index + " is divisible by " + 13);
			index++;
		}
	}

	public static void main(String[] args) {
		MathUsingWhileLoop mathUsingWhileLoop = new MathUsingWhileLoop();
		mathUsingWhileLoop.displayEvenNumbers(10, 15);
		mathUsingWhileLoop.displayDivisibleBy5(10, 30);
		mathUsingWhileLoop.displayDivisibleBy5and3(5, 18);
		mathUsingWhileLoop.displayDivisibleBy7or13(5, 40);
	}
}
