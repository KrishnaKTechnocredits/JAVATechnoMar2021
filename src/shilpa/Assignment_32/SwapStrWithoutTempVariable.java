/*program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
Hint : you can use subString method.
*/
package shilpa.Assignment_32;

public class SwapStrWithoutTempVariable {
	void getSwapString(String str1, String str2) {
		str1 = str1 + str2;
		str2 = str1.substring(0, 6);
		str1 = str1.substring(6);
		System.out.println("Swaped Strings are \n" + "str1 = " + str1 + "  str2 = " + str2);

	}

	public static void main(String[] args) {
		SwapStrWithoutTempVariable swapStrWithoutTempVariable = new SwapStrWithoutTempVariable();
		System.out.println("Input Strings are \n" + "str1 = Techno  str2 = Ctrdits");
		swapStrWithoutTempVariable.getSwapString("Techno", "Credits");
	}

}
