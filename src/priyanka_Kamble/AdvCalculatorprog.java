package priyanka_Kamble;

/*
 * Assignment 6 : 30th March 2021

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
public class AdvCalculatorprog {
	void evenNumbers(int startIndex, int endIndex) {
		System.out.println("Even number in range of " +startIndex+ " to " +endIndex+ " are");
		for(;startIndex<=endIndex;startIndex++) 
			if(startIndex % 2 == 0)
				System.out.println("\t" +startIndex);
	}
		
	void divisibleBy(int startIndex, int endIndex) {
		System.out.println("\n Number Divisible by 5 in range of " +startIndex+ " to " +endIndex+ " are");
		for(;startIndex<=endIndex;startIndex++) {
			if(startIndex % 5 == 0)
				System.out.println("\t" +startIndex);
			}
	}
	
	void multidivide3And5(int startIndex, int endIndex) {
		System.out.println("\n  Number Divisible by 3 & 5 in range of " +startIndex+ " to " +endIndex+ " are");
		for(;startIndex<=endIndex;startIndex++) 
			if(startIndex % 3 == 0 && startIndex % 5 == 0)
				System.out.println("\t" +startIndex);
	}
	
	void multidivide7And13(int startIndex, int endIndex) {
		System.out.println("\n  Number Divisible by 7 & 13 in range of " +startIndex+ " to " +endIndex+ " are");
		for(;startIndex<=endIndex;startIndex++) 
			if(startIndex%7 == 0)
				System.out.println("\t" +startIndex+ " number is Divisible by 7 " );
			else if(startIndex%13 == 0)
				System.out.println("\t" +startIndex+ " number is Divisible by 13");
				
	}

public static void main(String[] args) {
	AdvCalculatorprog advCalculator = new AdvCalculatorprog();
	advCalculator.evenNumbers(10,15);
	advCalculator.divisibleBy(10,30);
	advCalculator.multidivide3And5(5,18);
	advCalculator.multidivide7And13(5,40);
	}
}
