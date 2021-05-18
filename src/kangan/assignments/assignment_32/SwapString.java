package kangan.assignments.assignment_32;

/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

public class SwapString {

	void swapString(String input1, String input2) {
		String temp = "";
		temp=input1;
		input1=input2;
		input2 = temp;
		System.out.println(input1 + " " + input2);
	}
	public static void main(String[] args) {
		SwapString swapString  = new SwapString();
		swapString.swapString("Techno" , "Credits");
	}
}
