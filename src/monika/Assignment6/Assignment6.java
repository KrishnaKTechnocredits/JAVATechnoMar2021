package monika.Assignment6;
/*
 Assignment 6 : 30th March 2021

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

public class Assignment6 {

//part A
	void evenNumberPrint(int start, int end) {
		if(start <= end) {
			for(int i = start;i<=end;i++) {
				if(i%2 == 0) {
					System.out.println("No. is even: "+i);
				}
			}
		}else
			System.out.println("In range - always start no. should be greater than end no.");
	}
	
// Part B
	void divisibleBy5Print(int start, int end){
		if(start <= end) {
			for(int j = start;j<=end;j++) {
				if(j%5 == 0)
					System.out.println("No. is divisible by 5: "+j);
			}
		}
		else
			System.out.println("In range - always start no. should be greater than end no.");	
	}

// Part C
	void divisibleBy5And3Print(int start, int end) {
		if(start <= end) {
			for(int k = start;k<=end;k++) {
				if(k%3 ==0 && k%5 == 0)
					System.out.println("\n"+"No. is divisible by 3 and 5: "+k+"\n");
			}
		}
		else
			System.out.println("In range - always start no. should be greater than end no.");	
	}
// Part D
	void divisibleBy7Or13Print(int start, int end){
		if(start <= end) {
			for(int k = start;k<=end;k++) {
				if(k%7 ==0 || k%13 == 0)
					System.out.println("No. is divisible by 7 or 13: "+k);
			}
		}
		else
			System.out.println("In range - always start no. should be greater than end no.");	
	}
	
	public static void main(String[] args) {
		Assignment6 assignment6 = new Assignment6();
		assignment6.evenNumberPrint(10,15);
		assignment6.divisibleBy5Print(10, 30);
		assignment6.divisibleBy5And3Print(5, 18);
		assignment6.divisibleBy7Or13Print(5, 40);

	}
	}