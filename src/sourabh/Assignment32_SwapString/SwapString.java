/*
Assignment - 32 : 4th May'2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

*/
package sourabh.Assignment32_SwapString;

public class SwapString {
	void getSwapString(String strInput1, String strInput2) {
		String strTemp="";
		strTemp= strInput1;
		strInput1= strInput2;
		strInput2= strTemp;
		System.out.println("input1 = "+strInput1+" , "+"input2 = "+strInput2);
	}
	public static void main(String[] args) {
		SwapString SwapString= new SwapString();
		SwapString.getSwapString("Techno","Credits");
	}

}
