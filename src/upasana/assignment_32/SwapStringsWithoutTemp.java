/*
 program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"


Hint : you can use subString method.
 */

package upasana.assignment_32;

public class SwapStringsWithoutTemp {
	void swapWithoutTemp(String input1, String input2) {

		input1 = input1 + input2; 
		input2 = input1.substring(0,input2.length()-1); 
		input1 = input1.substring(input1.length()-1 - input2.length());

		System.out.println("input1 = " + input1 + " , " + "input2 = " + input2);
	}

	public static void main(String[] args) {

		new SwapStringsWithoutTemp().swapWithoutTemp("Techno", "Credits");
	}
}
