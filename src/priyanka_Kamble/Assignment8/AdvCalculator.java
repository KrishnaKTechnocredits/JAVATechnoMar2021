package priyanka_Kamble.Assignment8;

/*
 * Assignment 8
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