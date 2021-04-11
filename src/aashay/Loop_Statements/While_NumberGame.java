package aashay.Loop_Statements;

/*
 * 
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

public class While_NumberGame {
	
	void evennum(int num1, int num2) {
				
		if(num1 < num2) {
			while(num1<=num2) {
				if(num1%2 == 0) {
					System.out.println("Even number is: "+num1);
				}
				num1++;
			}
		}else {
			while(num2<=num1) {
				if(num2%2 == 0) {
					System.out.println("Even number is: "+num2);
				}
				num2++;
			}			
		}
	}
	void divisibleBy5(int num1, int num2) {
		if(num1 < num2) {
			while(num1<=num2) {
				if(num1%5 == 0) {
					System.out.println("Number divisible by 5 is: "+num1);
				}
				num1++;
			}
		}else {
			while(num2<=num1) {
				if(num2%5 == 0) {
					System.out.println("Number divisible by 5 is: "+num2);
				}
				num2++;
			}			
		}
	}
	void divisibleBy5_3(int num1, int num2) {
		if(num1 < num2) {
			while(num1<=num2) {
				if(num1%5 == 0 && num1%3 == 0) {
					System.out.println("Number divisible by 5 & 3 is: "+num1);
				}
				num1++;
			}
		}else {
			while(num2<=num1) {
				if(num2%5 == 0 && num2%3 == 0) {
					System.out.println("Number divisible by 5 & 3 is: "+num2);
				}
				num2++;
			}			
		}
	}
	void divisibleBy7_13(int num1, int num2) {
		if(num1 < num2) {
			while(num1<=num2) {
				if(num1%7 == 0 && num1%13 == 0) {
					System.out.println("Number divisible by 7 & 13 is: "+num1);
				}
				num1++;
			}
		}else {
			while(num2<=num1) {
				if(num2%7 == 0 && num2%13 == 0) {
					System.out.println("Number divisible by 7 & 13 is: "+num2);
				}
				num2++;
			}			
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		While_NumberGame whileNumberGame = new While_NumberGame();
		whileNumberGame.evennum(1,10);
		System.out.println();
		whileNumberGame.evennum(20,30);
		System.out.println();
		whileNumberGame.divisibleBy5(5,20);
		System.out.println();
		whileNumberGame.divisibleBy5(20,5);
		System.out.println();
		whileNumberGame.divisibleBy5_3(10,50);
		System.out.println();
		whileNumberGame.divisibleBy5_3(50,10);
		System.out.println();
		whileNumberGame.divisibleBy7_13(1,100);
		System.out.println();
		whileNumberGame.divisibleBy7_13(200,300);
	}

}
