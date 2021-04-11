package monika.Assignment8_WhileLoop;

//My question is how to handle start > end exception using while

/*
Assignment 8 same as Assmt6 : 1st april 2021

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
public class Assignment8_WhileLoop {

	void evenNumbersPrint(int start, int end){
		while( start <= end ){
			if(start % 2 == 0){
				System.out.println(start);
			}start++;
		}
	}

	void divisibleBy5Print(int start, int end){
		while(start <= end){
			if (start % 5 == 0){
				System.out.println(start);
			}start++;
		}
	}

	void divisibleBy7And13Print(int start, int end){
		while (start <= end){
			if(start %7 ==0 || start % 13 == 0){
					System.out.println(start);
			}start++;
		}
	}
	
	void divisibleBy5And3Print(int start, int end){
		while (start <= end){
			if(start %3 ==0 && start % 5 == 0){
					System.out.println(start+"\n");
			}start++;
		}
	}

	public static void main(String[] args) {
		Assignment8_WhileLoop whileLoopObject = new Assignment8_WhileLoop();
		whileLoopObject.evenNumbersPrint(10, 15);
		whileLoopObject.divisibleBy5Print(10, 30);
		whileLoopObject.divisibleBy5And3Print(5, 18);
		whileLoopObject.divisibleBy7And13Print(5, 40);
	}
}
