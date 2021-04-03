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
		 39 is divisible by 13
*/

package simmi.assignment_6;

public class Numbers {
	
	int num;
	
	void even(int num1, int num2) {
		for(int i = num1; i<= num2; i++) {
			if(i % 2 == 0) {
			num = i;
			System.out.println("Number is Even: " + num);
			}
		}
	}
	
	void divide(int num1, int num2) {
		for(int i = num1; i<= num2; i++) {
			if(i % 5 == 0) {
			num = i;
			System.out.println("The number divisible by 5 is: " + num);
			}
		}
	}
	
	void divide1(int num1, int num2){
		for(int i = num1; i<= num2; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
			num = i;
			System.out.println("The number divisible by 5 and 3 is: " + num);
			}
		}
	}
	
	void divide2(int num1, int num2) {
		for(int i = num1; i<= num2; i++) {
			if(i % 7 == 0 || i % 13 == 0) {
			num = i;
			System.out.println("The number divisible by 7 or 13 is: " + num);
			}
		}
	}
	
	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		numbers.even(10, 15);
		numbers.divide(10, 30);
		numbers.divide1(5, 18);
		numbers.divide2(5, 40);
		
	}	
}
