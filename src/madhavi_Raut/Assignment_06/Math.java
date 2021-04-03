/*Assignment 06
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
39 is divisible by 13*/
package madhavi_Raut.Assignment_06;

public class Math {
	void displayEvenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
	}

	void displayDivisibleBy5(int startIndex, int endIndex) {
		System.out.println("Divisble by 5, numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void displayDivisibleBy5and3(int startIndex, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if ((index % 3 == 0) && (index % 5 == 0))
				System.out.println(index);
		}
	}

	void displayDivisibleBy7or13(int startIndex, int endIndex) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (int index = startIndex; index <= endIndex; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by " + 7);
			if (index % 13 == 0)
				System.out.println(index + " is divisible by " + 13);
		}
	}

	public static void main(String[] args) {
		Math math = new Math();
		math.displayEvenNumbers(10, 15);
		math.displayDivisibleBy5(10, 30);
		math.displayDivisibleBy5and3(5, 18);
		math.displayDivisibleBy7or13(5, 40);
	}
}
