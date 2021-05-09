package trupti.String.Swap;
/*program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"


Hint : you can use subString method.*/

public class SwapStringWithoutTempVar {
	void getSwapString() {
		String input1="Techno";
		String input2="Credits";
		input1=input1+input2;
		input2=input1.substring(0,6 );
		input1=input1.substring(6, 13);
		
		System.out.println("First String after swapping is:"+input1);
		System.out.println("Second String after swapping is:"+input2);
	}
	public static void main(String[] args) {
		SwapStringWithoutTempVar swapstringwithouttempVar=new SwapStringWithoutTempVar();
		swapstringwithouttempVar.getSwapString();
	}

}
