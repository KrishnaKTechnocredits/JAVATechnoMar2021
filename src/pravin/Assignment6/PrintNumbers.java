/*Assignment 6
 *Write only one program having following methods. [4 methods in same program]

 *1. On user define range print all even numbers.
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


package pravin.Assignment6;

public class PrintNumbers {
	int numbers;

	void evenNumbers(int startNum,int endNum) {

		for(numbers=startNum; numbers<=endNum; numbers++)
		{
			if (numbers %2 == 0)
			{
				System.out.println("Even numbers are "+numbers);

			}

		}

	}
	void divisableby5(int startNum,int endNum) {


		for(numbers=startNum; numbers<=endNum; numbers++)
		{
			if (numbers %5 == 0)
			{
				System.out.println("Divisableby5 numbers are "+numbers);
			}

		}

	}
	void divisableby5n3(int startNum,int endNum) {


		for(numbers=startNum; numbers<=endNum; numbers++)
		{
			if (numbers %5 == 0 && numbers %3 == 0)
			{
				System.out.println("Divisableby5n3 numbers are "+numbers);
			}

		}

	}
	void divisableby7n13(int startNum,int endNum) {


		for(numbers=startNum; numbers<=endNum; numbers++)
		{
			if (numbers %7 == 0)
			{
				System.out.println(numbers+" Divisableby 7");
			}else
				if (numbers %13 == 0)
					System.out.println(numbers+" Divisableby 13");

		}

	}

	public static void main(String[] args) {
		PrintNumbers printNumbers = new PrintNumbers();
		printNumbers.evenNumbers(10,15);
		printNumbers.divisableby5(10,30);
		printNumbers.divisableby5n3(5,18);
		printNumbers.divisableby7n13(5,40);
	}

}




