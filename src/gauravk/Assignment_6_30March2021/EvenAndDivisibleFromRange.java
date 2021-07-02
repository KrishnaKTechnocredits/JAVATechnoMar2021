package gauravk.Assignment_6_30March2021;

import java.util.Scanner;

/*
 * *Assignment 6* : *30th March 2021*
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
public class EvenAndDivisibleFromRange {
	
	int startNum = 0;
	int endNum = 0;
	Scanner sc = new Scanner(System.in);
	
	void userInput() {
		System.out.println("Enter starting number of the raange ");
		startNum = sc.nextInt();
		System.out.println("Enter last number of the raange ");
		endNum = sc.nextInt();
		validateSequence(startNum,endNum);
	}
	
	void validateSequence(int sN, int eN) {
		if(sN<eN) {
			System.out.println("Range created successfully.");
			pickingEvenNumbers(sN, eN);
			pickingDivisible5(sN, eN);
			pickingDivisible5And3(sN, eN);
			pickingDivisible7Or13(sN, eN);
		}
		else System.out.println("Sorry Range of arrays cannot be created. Starting number must be greater than last number.");
	}
	
	void pickingEvenNumbers(int sN, int eN) {
		System.out.println("Even numbers are:");
		for(int index=sN; index<=eN; index++) {
			if(index%2==0)
				System.out.println(index);
		}
	}
	
	void pickingDivisible5(int sN, int eN) {
		System.out.println("Divisible by 5, numbers are:");
		for(int index=sN; index<=eN; index++) {
			if(index%5==0)
				System.out.println(index);
		}
	}
	
	void pickingDivisible5And3(int sN, int eN) {
		System.out.println("Divisible by 5 and 3, numbers are:");
		for(int index=sN; index<=eN; index++) {
			if(index%5==0 && index%3==0)
				System.out.println(index);
		}
	}
	
	void pickingDivisible7Or13(int sN, int eN) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for(int index=sN; index<=eN; index++) {
			if(index%7==0)
				System.out.println(index+" is divisible by "+7);
			else if(index%13==0)
				System.out.println(index+" is divisible by "+13);
			else continue;
		}
	}
	
	public static void main(String[] a) {
		EvenAndDivisibleFromRange evenAndDivisibleFromRange1 = new EvenAndDivisibleFromRange();
		evenAndDivisibleFromRange1.userInput();
	}

}