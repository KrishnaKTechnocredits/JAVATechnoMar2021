package aashay.Assignment_32;
/*
 * Assignment - 32 : 4th May'2021

program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

Hint : you can use subString method.
 */

public class SwapStringWithoutUsingTempVariable {
	
	void swapStringWithoutTemp(String input1, String input2) {
		System.out.println("Before swap input Strings are:  input1:" + input1 + " input2 " + input2); 
		input1= input1+input2;
		input2= input1.substring(0, input1.length()-input2.length());
		input1=input1.substring(input2.length());
		System.out.println("After swap input Strings are:  input1:" + input1 + " input2 " + input2); 
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapStringWithoutUsingTempVariable swapStringWithoutUsingTempVariable = new SwapStringWithoutUsingTempVariable();
		swapStringWithoutUsingTempVariable.swapStringWithoutTemp("Techno", "Credits");
	}

}
