/*
 program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
 */

package upasana.assignment_32;

public class SwapStringsTemp {

	void swapTemp(String input1, String input2) {

		String temp = "";

		temp = input1;
		input1 = input2;
		input2 = temp;
		
		System.out.println("input1 = "+input1 + " , "+ "input2 = "+input2);
	}

	public static void main(String[] args) {

		new SwapStringsTemp().swapTemp("Techno", "Credits");
	}
}
