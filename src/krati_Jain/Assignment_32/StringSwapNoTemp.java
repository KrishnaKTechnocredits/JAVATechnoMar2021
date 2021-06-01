/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

package krati_Jain.Assignment_32;

import java.util.Scanner;

public class StringSwapNoTemp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter First String : ");
		String input1 = scn.next();
		System.out.println("Enter Second String : ");
		String input2 = scn.next();
		StringSwapNoTemp strSwapNoTemp = new StringSwapNoTemp();
		strSwapNoTemp.swapString(input1, input2);
	}

	void swapString(String inp1, String inp2) {

		inp1 = inp1 + inp2; //KratiJain
		inp2 = inp1.substring(0, inp1.length()-inp2.length());
		inp1 = inp1.substring(inp2.length());
		
		System.out.println("Strings After Swap\nFirst String : " + inp1 + "\nSecond String : " + inp2);

	}
}
