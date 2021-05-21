package aashay.Assignment_31;
/*
 * Assignment - 31 : 4th May'2021
program 1: swap 2 numbers using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
 */

public class SwapNumbersUsingTempVariable {
	
	void swapNumbers(int num1, int num2) {
		int temp =0;
		System.out.println("Numbers before swaping: num1:"+num1+" num2: "+num2);
		temp = num1;
		num1= num2;
		num2 = temp;
		System.out.println("Numbers after swaping: num1:"+num1+" num2: "+num2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbersUsingTempVariable swapNumbersUsingTempVariable = new SwapNumbersUsingTempVariable();
		swapNumbersUsingTempVariable.swapNumbers(10, 20);
	}

}
