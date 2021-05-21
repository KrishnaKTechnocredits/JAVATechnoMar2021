package trupti.String.Swap;
/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

public class SwapStringWithTempVar {
	void getSwapString() {
		String input1="Techno";
		String input2="Credits";
		String temp;
		temp=input1;
		input1=input2;
		input2=temp;
		System.out.println("First String after Swapping is "+input1);
		System.out.println("Second String after Swapping is "+input2);
	}

	public static void main(String[] args) {
		SwapStringWithTempVar swapstringwithtempvar =new SwapStringWithTempVar();
		swapstringwithtempvar.getSwapString();

	}

}
