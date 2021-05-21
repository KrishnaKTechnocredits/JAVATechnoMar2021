/*
Assignment - 32 : 4th May'2021

program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

Hint : you can use subString method.
 */
package paras.Assignment_32;

public class SwapStringWithoutTempVariable {
	
	void swapStringwithoutTempVar() {
		
		String input1 = "Techno";
		String input2 = "Credits";
		
		input1 = input1 + input2;
		input2 = input1.substring(0, input1.length() - input2.length());
		input1 = input1.substring(input2.length());
		
		System.out.println("Value of Input1 is: " + input1);
		System.out.println("Value of Input2 is: " + input2);
	}
	
	public static void main(String[] args) {
		SwapStringWithoutTempVariable swapStringWithoutTempVariable = new SwapStringWithoutTempVariable();
		swapStringWithoutTempVariable.swapStringwithoutTempVar();
	}
}

