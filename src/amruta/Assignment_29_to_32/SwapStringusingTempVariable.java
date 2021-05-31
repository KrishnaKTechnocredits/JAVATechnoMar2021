/* Assignment 32 - program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";

output : input1 = "Credits", input2 = "Techno"

    */

package amruta.Assignment_29_to_32;

public class SwapStringusingTempVariable {
	
	public static void main(String[] args) {
		
		String input1 = "Techno";
		
		String input2 = "Credits";
		
		String str ="";
		
		str = input1;
		input1= input2;
		input2 = str;
		
		System.out.println("input1 :" +input1);
		System.out.println("input2 :" +input2);
		
	}

}
