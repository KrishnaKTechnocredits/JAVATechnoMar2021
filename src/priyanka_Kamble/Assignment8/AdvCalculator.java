package priyanka_Kamble.Assignment8;

/*
 * Assignment 12 : 5th April 2021

Design to test static, non static, return type concepts.

1) Method sum() - non static method, accept 3 parameters of type double & return answer

2) Method average()- non static method, accept 3 parameters of type double & return answer

3) Method isAnswerAboveExpecation() - non static method, take one parameter (answer which you received from average method) and return true if value is more then 50 else false.

4) Method isEligible() - static method,take one parameter (answer which you received from average method) return true if value is more then 50 or divisible by 2. Eligibility will be printed in main method. 

5) Method getYourGrade() - static method, take one parameter (answer which you received from average method) return "A Grade" if average is more then 80 else "B grade", main method will print grade received from getYourGrade() method.

 */
public class AdvCalculator {
	
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
	AdvCalculator advCalculator = new AdvCalculator();
	advCalculator.evenNumbers(10,15);
	advCalculator.divisibleBy(10,30);
	advCalculator.multidivide3And5(5,18);
	advCalculator.multidivide7And13(5,40);
	}
}