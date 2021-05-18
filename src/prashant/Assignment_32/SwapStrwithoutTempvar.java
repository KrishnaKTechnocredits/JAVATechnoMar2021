/*program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/
package prashant.Assignment_32;

public class SwapStrwithoutTempvar {
	void swapStr(String str1, String str2) {
		String str3 = str1 + str2;
		str2 = str3.substring(0, str3.length() - str2.length());
		str1 = str3.substring(str1.length());
		System.out.println("After swap Input string 1 " + str1 + " " + "Input string 2 " + str2);
	}

	public static void main(String[] args) {
		SwapStrwithoutTempvar swapstr = new SwapStrwithoutTempvar();
		String str1 = "Techno";
		String str2 = "Credits";
		System.out.println("Before swap Input string 1 " + str1 + " " + "Input string 2 " + str2);
		swapstr.swapStr(str1, str2);
	}
}
