package aashay.Assignment_31;
/*
 * 
Assignment - 31 : 4th May'2021

program 2: swap 2 numbers without using temporary variable.
input : x = 10 , y = 20;
output : x = 20, y = 10
 */

public class SwapNumbersWithoutTempVariable {
	
	void swapNumWithoutTempVar(int num1, int num2) {
		System.out.println("Numbers before swaping without using temporary variable: num1:"+num1+" num2: "+num2);
		num1 = num1+ num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("Numbers after swaping without using temporary variable: num1:"+num1+" num2: "+num2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbersWithoutTempVariable swapNumbersWithoutTempVariable = new SwapNumbersWithoutTempVariable();
		swapNumbersWithoutTempVariable.swapNumWithoutTempVar(10,20);
	}

}
