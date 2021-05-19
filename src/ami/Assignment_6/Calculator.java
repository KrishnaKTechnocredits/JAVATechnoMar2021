/*
1. On user define range print all even numbers.
2.On user define range print all numbers which is divisible by 5.
3. On user define range print all numbers which is divisible by 5 and divisible by 3.
4. On user define range print all numbers which is divisible by 7 or 13.
*/

package ami.Assignment_6;

public class Calculator {
	void evenNum(int strindex , int endindex) {		
		System.out.println("Even numbers: ");
		for(int num = strindex ; num <= endindex ; num++ ) {
			if (num % 2 ==0)
				System.out.println(num);
		}
	}
		
		void divNum(int strindex ,int endindex) {
			System.out.println("Divisible by 5 numbers are: ");
			for(int num = strindex ; num <= endindex ; num++ ) {
				if (num % 5 ==0)
					System.out.println(num);
		}
	}
	
		void divBy3_5(int strindex ,int endindex) {
			System.out.println("Divisible by 5 & 3, numbers are: ");
			for(int num = strindex ; num <= endindex ; num++ ) {
				if (num % 5 ==0 && num % 3 ==0)
					System.out.println(num);
			}
		}
		
		void divBy7_13(int strindex ,int endindex) {
			System.out.println("Divisible by 7 or 13, numbers are: ");
			for(int num = strindex ; num <= endindex ; num++ ) {
				if (num % 7 ==0) {
					System.out.println(num + " is divisible by 7");
				}
				if (num % 13 == 0) {
					System.out.println(num + " is divisible by 13");
				}
			}
		}
		
		
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.evenNum(10, 15);
		System.out.println("***************");
		calculator.divNum(10, 30);
		System.out.println("***************");
		calculator.divBy3_5(5, 18);
		System.out.println("***************");
		calculator.divBy7_13(5, 40);
	}
}
