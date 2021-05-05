package shivani.Assignment_32;
/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

public class SwapTwoStringwithTempVar {
	String tempStr;

	void swapString(String str1, String str2) {

		tempStr = str1;
		str1 = str2;
		str2 = tempStr;
		System.out.println("input1 = " + str1 + " , " + "input2 = " + str2);
	}

	public static void main(String[] args) {

		SwapTwoStringwithTempVar swapTwoStringwithTempVar = new SwapTwoStringwithTempVar();
		swapTwoStringwithTempVar.swapString("Techno", "Credits");

	}
}
