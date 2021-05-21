/*
Assignment - 32 : 4th May'2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
 */
package paras.Assignment_32;

public class SwapStringWithTempVariable {
	
	void swapStringwithTempVar() {
		String input1 = "Techno";
		String input2 = "Credits";
		String temp = "";
		
		temp = input1;
		input1 = input2;
		input2 = temp;
		System.out.println("Value of input1 is: " + input1);
		System.out.println("Value of input2 is: " + input2);
	}
	
	public static void main(String[] args) {
		SwapStringWithTempVariable swapStringWithTempVariable = new SwapStringWithTempVariable();
		swapStringWithTempVariable.swapStringwithTempVar();
	}
}
