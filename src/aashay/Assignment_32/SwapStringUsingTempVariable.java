package aashay.Assignment_32;
/*
 * 
Assignment - 32 : 4th May'2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
 */

public class SwapStringUsingTempVariable {
	
	void swapString(String input1, String input2) {
		String temp="";
		System.out.println("Before swapping strings are input1: "+input1+" input2: "+input2);
		temp = input1;
		input1=input2;
		input2=temp;
		System.out.println("After swapping strings are input1: "+input1+" input2: "+input2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapStringUsingTempVariable swapStringUsingTempVariable = new SwapStringUsingTempVariable();
		swapStringUsingTempVariable.swapString("Techno", "Credits");
	}

}
