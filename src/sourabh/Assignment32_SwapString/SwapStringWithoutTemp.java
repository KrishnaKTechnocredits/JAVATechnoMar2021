/*
program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
 */

package sourabh.Assignment32_SwapString;

public class SwapStringWithoutTemp {
	void getSwapString(String strInput1, String strInput2) {
		strInput1=strInput1+strInput2;
		strInput2= strInput1.substring(0, strInput1.length()-strInput2.length());
		strInput1= strInput1.substring(strInput2.length());
		System.out.println("input1 = "+strInput1+" , "+"input2 = "+strInput2);
	}
	public static void main(String[] args) {
		SwapString SwapString= new SwapString();
		SwapString.getSwapString("Techno","Credits");
	}
}
