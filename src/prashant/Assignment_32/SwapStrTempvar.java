/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/
package prashant.Assignment_32;

public class SwapStrTempvar {
	void swapStr(String str1, String str2) {
		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("After swap Input string 1 " + str1 + " " + "Input string 2 " + str2);
	}

	public static void main(String[] args) {
		SwapStrTempvar swapstr = new SwapStrTempvar();
		String str1 = "Techno";
		String str2 = "Credits";
		System.out.println("Before swap Input string 1 " + str1 + " " + "Input string 2 " + str2);
		swapstr.swapStr(str1, str2);
	}
}
