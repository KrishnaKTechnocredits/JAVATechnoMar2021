package pallavi.Assignment_32;

/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

public class SwapString {

	void swapString() {
		String input1 = "Techno";
		String input2 = "Credits";

		System.out.println("Before Swaping input1 : " + input1 + " input2  " + input2);
		String temp = "";
		temp = input1;
		input1 = input2;
		input2 = temp;
		System.out.println("After Swaping input1 : " + input1 + " input2  " + input2);
	}

	public static void main(String[] args) {
		new SwapString().swapString();

	}

}
