package ashish_Vyas.Assignment_32;

/*
Assignment - 32 : 4th May'2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
*/

public class SwapTwoString {
	void getStringWithTemp(String str1, String str2) {
		System.out.println("Swapping Using Temporary Variable");
		System.out.println("Before swapping  : Str1= " + str1 + " , " + " Str2 = " + str2);
		String temp;
		temp = str1;
		str1 = str2;
		str2 = temp;
		System.out.println("After swapping  : Str1 = " + str1 + " , " + " Str2 = " + str2);
		System.out.println("");
	}

	void getStringWithoutTemp(String str1, String str2) {
		System.out.println("Swapping Without Using Temporary Variable");
		System.out.println("Before swapping  : Str1 = " + str1 + " , " + " Str2 = " + str2);
		str1 += str2;
		str2 = str1.substring(0, (str1.length() - str2.length()));
		str1 = str1.substring(str2.length());
		System.out.println("After swapping  : Str1 = " + str1 + " , " + " Str2 = " + str2);
	}

	public static void main(String[] args) {
		SwapTwoString swap = new SwapTwoString();
		swap.getStringWithTemp("Techno", "Credits");
		swap.getStringWithoutTemp("Techno", "Credits");
	}

}