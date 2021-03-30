/*Assignment 6 : 30th March 2021

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
		 
package anubhav;

class NumberActions {
	int number1;
	int number2;
	int number3;
	int number4;
	
	void evenNumbers() {
		System.out.println("The even Numbers are:");
		for(int number1 = 10; number1 <=15 ; number1++ ) { //Range -> 10 to 15
			if((number1%2) == 0)
				System.out.println(number1);
		}
	}
	
	void divisibleBy5() {
		System.out.println("The numbers divisible by 5 are:");
		for(int number2 = 10; number2 <=30; number2++ ) { //Range -> 10 to 15
			if((number2%5) == 0)
				System.out.println(number2);
		}
	}
	
	void divisibleBy5And3() {
		System.out.println("The numbers divisible by 5 & 3 are:");
		for(int number3 = 5; number3 <=18; number3++ ) { //Range -> 5 to 18
			if((number3%5) == 0 && (number3%3) == 0)
				System.out.println(number3);
		}
	}
	
	void divisibleBy7Or13() {
		System.out.println("The numbers divisible by 7 or 13 are:");
		for(int number4 = 5; number4 <=40; number4++ ) { //Range -> 5 to 40
			if((number4%7) == 0 || (number4%13) == 0) {
				if ((number4%7) == 0)
					System.out.println(number4 + " is divisible by 7");
				else
					System.out.println(number4 + " is divisible by 13");
			}
		}
	}
	
	public static void main(String[] a){
		NumberActions numberActions = new NumberActions();
		numberActions.evenNumbers();
		numberActions.divisibleBy5();
		numberActions.divisibleBy5And3();
		numberActions.divisibleBy7Or13();
	}
} 