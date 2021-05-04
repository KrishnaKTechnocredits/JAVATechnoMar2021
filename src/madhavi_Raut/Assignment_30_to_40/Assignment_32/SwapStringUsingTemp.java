package madhavi_Raut.Assignment_30_to_40.Assignment_32;
/*Assignment - 32 : 4th May'2021
program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

public class SwapStringUsingTemp {

	void getSwappedString(String str1, String str2) {
		System.out.println("Original Strings: " + str1 + " " + str2);
		String temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("Swapped Strings: " + str1 + " " + str2);
	}

	public static void main(String[] args) {
		new SwapStringUsingTemp().getSwappedString("Techno", "Credits");
	}
}
