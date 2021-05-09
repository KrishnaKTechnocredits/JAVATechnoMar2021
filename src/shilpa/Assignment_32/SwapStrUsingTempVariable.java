/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
*/
package shilpa.Assignment_32;

public class SwapStrUsingTempVariable {
	void getSwapStr(String str1, String str2) {
		String tempStr;
		tempStr = str1;
		str1 = str2;
		str2 = tempStr;
		System.out.println("Swapped Strings are\n" + "str1 = " + str1 + "  str2 = " + str2);

	}

	public static void main(String[] args) {
		SwapStrUsingTempVariable swapStrUsingTempVariable = new SwapStrUsingTempVariable();
		System.out.println("input Strings are \n" + "str1 = Techno  str2 = Credits");
		swapStrUsingTempVariable.getSwapStr("Techno", "Credits");

	}

}
