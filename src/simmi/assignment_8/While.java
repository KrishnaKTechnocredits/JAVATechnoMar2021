/*Assignment 8 : 1st Apr'2021
WAP of Assignment 6 using While loop

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

package simmi.assignment_8;

public class While {
	
	
	void even(int num1, int num2) {
		int num = num1;
		while(num <= num2) {
			if(num % 2 == 0) 
			System.out.println("Number is Even: " + num);
			num++;
		}
	}
	
	void divide(int num1, int num2) {
		int num = num1;
		while(num <= num2) {
			if(num % 5 == 0) 
			System.out.println("The number divisible by 5 is: " + num);
			num++;
		}
	}
	
	void divide1(int num1, int num2){
		int num = num1;
		while(num <= num2) {
			if(num % 5 == 0 && num % 3 == 0) 
			System.out.println("The number divisible by 5 and 3 is: " + num);
			num++;
		}
	}
	
	void divide2(int num1, int num2) {
		int num = num1;
		while(num <= num2) {
			if(num % 7 == 0 || num % 13 == 0) 
			System.out.println("The number divisible by 7 or 13 is: " + num);
			num++;
		}
	}
	
	public static void main(String[] args) {
		While numbers = new While();
		numbers.even(10,15);
		numbers.divide(10,30);
		numbers.divide1(5,18);
		numbers.divide2(5,40);
		
	}	
}
