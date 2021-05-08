package kangan.assignments.assignment_32;

/*program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

public class SwapStringWithoutTemp {

	void swapStringWithoutTemp(String input1, String input2) {
		input1 = input1+input2;
		input2 = input1.substring(1, (input1.length()-input2.length()));
		input1= input1.substring(input2.length(),input1.length());
		System.out.println(input1 + " " + input2);
	}
	public static void main(String[] args) {
		SwapStringWithoutTemp swapStringWithoutTemp = new SwapStringWithoutTemp();
		swapStringWithoutTemp.swapStringWithoutTemp("Kangan", "Gautam");
	}
}
