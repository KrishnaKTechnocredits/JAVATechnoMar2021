/*program 1: swap 2 String using temporary variable.
	input : input1 = "Techno" , input2 = "Credits";
	output : input1 = "Credits", input2 = "Techno"*/
package ravindra_J.Assignment_No_32_String_Swapping;

public class SwapStringUsingTemp {

	void getSwapStringUsingTemp() {
		String temp = "", str1 = "Techno", str2 = "Credit";
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("String after swapping -> \nstr1=" + str1 + ", str2=" + str2);
	}

	public static void main(String[] args) {
		SwapStringUsingTemp snut = new SwapStringUsingTemp();
		snut.getSwapStringUsingTemp();
	}
}
