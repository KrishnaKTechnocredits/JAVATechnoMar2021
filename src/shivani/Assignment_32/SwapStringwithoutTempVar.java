package shivani.Assignment_32;
/*program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

public class SwapStringwithoutTempVar {

	void swapStringWithOutTemp(String str1, String str2) {
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		str1 = str1.substring(str2.length());
		System.out.println("output : input1 = " + str1 + " , " + "input2 = " + str2);
	}

	public static void main(String[] args) {
		SwapStringwithoutTempVar swapStringwithoutTempVar = new SwapStringwithoutTempVar();
		swapStringwithoutTempVar.swapStringWithOutTemp("Techno", "Credits");
	}
}
