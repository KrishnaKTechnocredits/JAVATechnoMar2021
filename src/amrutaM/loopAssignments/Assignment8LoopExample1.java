package amrutaM.loopAssignments;

/*WAP with the following 7 methods:
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
			 
	5. Find sum of all the numbers in user define range.
	Input : Range -> 1 to 5
	output : sum is 15

	6. Find difference between sum of odd numbers and even numbers in a given range
	Input : Range -> 3 to 9
	output : 6
	hint : (3+5+7+9) - (4+6+8) = 6
	       
	7. Print only odd numbers in reverse order.
	Input : Range -> 10 to 20
	output : 19
	         17
	         15
	         13
	         11*/
public class Assignment8LoopExample1 {

	void evenNumbersInRange(int startNum, int endNum) {
		System.out.println("Even numbers are: ");
		for (int index = startNum; index <= endNum; index++) {

			if (index % 2 == 0) {
				System.out.println(index);
			}
		}
	}

	void divisibleBy5(int startNum, int endNum) {

		System.out.println("Divisible by 5, numbers are:");
		for (int index = startNum; index <= endNum; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy3And5(int startNum, int endNum) {

		System.out.println("Divisible by 5 & 3, numbers are:");
		for (int index = startNum; index <= endNum; index++) {
			if (index % 3 == 0 && index % 5 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy7Or13(int startNum, int endNum) {

		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (int index = startNum; index <= endNum; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
		}
	}

	void sumOfNumbers(int startNum, int endNum) {
		int sum = 0;
		for (int index = startNum; index <= endNum; index++) {
			sum += index;
		}
		System.out.println("Sum is " + sum);
	}

	void diffEvenOdd(int startNum, int endNum) {
		/*
		 * 6. Find difference between sum of odd numbers and even numbers in a given
		 * range Input : Range -> 3 to 9 output : 6 hint : (3+5+7+9) - (4+6+8) = 6
		 */
		int evenSum = 0, oddSum = 0;
		for (int index = startNum; index <= endNum; index++) {
			if (index % 2 == 0)
				evenSum += index;
			else
				oddSum += index;
		}
		System.out.println(oddSum - evenSum);
	}

	void oddNumbersInReverse(int startNum, int endNum) {
		/*
		 * 7. Print only odd numbers in reverse order. Input : Range -> 10 to 20 output
		 * : 19 17 15 13 11
		 */

		for (int index = endNum; index >= startNum; index--) {
			if (index % 2 != 0)
				System.out.println(index);
		}
	}

	public static void main(String[] args) {
		Assignment8LoopExample1 assignment8LoopExample1 = new Assignment8LoopExample1();
		assignment8LoopExample1.evenNumbersInRange(10, 15);
		assignment8LoopExample1.divisibleBy5(10, 30);
		assignment8LoopExample1.divisibleBy3And5(5, 18);
		assignment8LoopExample1.divisibleBy7Or13(5, 40);
		assignment8LoopExample1.sumOfNumbers(1, 5);
		assignment8LoopExample1.diffEvenOdd(3, 9);
		assignment8LoopExample1.oddNumbersInReverse(10, 20);
	}

}
