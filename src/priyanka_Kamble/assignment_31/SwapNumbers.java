package priyanka_Kamble.assignment_31;

/*
Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10

Hint : think on some arithmetic calculation. */
public class SwapNumbers {

	int swapWithoutTemp(int number1, int number2) {
		number1 = number1 + number2;// 30
		number2 = number1 - number2;// 10
		number1 = number1 - number2;
		//System.out.println(number1 + " " + number2);
		return number1;
	}

	int swapWithTemp(int number1, int number2) {
		int temp;
		temp = number1 + number2;
		number1 = temp - number1;
		return number1;
	}

	public static void main(String[] args) {
		int number1 = 10, number2 = 20;
		 System.out.println("Swapping with TempNumber \nnumber 1 = "+number1 +" & number2 = "+number2+"\nnumber1 = " + new SwapNumbers().swapWithTemp(number1,
		 number2));
		System.out.println("\nSwapping Without Temp Number \nnumber 1 = " + number1 + " & number2 = " + number2
				+ "\nnumber1 = " + new SwapNumbers().swapWithoutTemp(number1, number2));
	}
}
