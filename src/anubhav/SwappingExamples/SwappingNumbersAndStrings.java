package anubhav.SwappingExamples;

/*Assignment - 31 : 4th May'2021
	program 1: swap 2 numbers using temporary variable.
		input : x = 10 , y = 20;
		output : x = 20, y = 10

	program 2: swap 2 numbers without using temporary variable.
		input : x = 10 , y = 20;
		output : x = 20, y = 10
		
Assignment - 32 : 4th May'2021
	program 1: swap 2 String using temporary variable.
		input : input1 = "Techno" , input2 = "Credits";
		output : input1 = "Credits", input2 = "Techno"

	program 2: swap 2 String without using temporary variable.
		input : input1 = "Techno" , input2 = "Credits";
		output : input1 = "Credits", input2 = "Techno"
*/

public class SwappingNumbersAndStrings {

	void swapNumUsingTempVariable(int x, int y) {
		System.out.println("-----------Program-1-------------");
		System.out.println("input  : x = " + x + ", y = " + y);
		int temp = 0;
		temp = x;
		x = y;
		y = temp;
		System.out.println("output : x = " + x + ", y = " + y);
	}

	void swapNumUsingArithmatic(int x, int y) {
		System.out.println("-----------Program-2-------------");
		System.out.println("input  : x = " + x + ", y = " + y);
		int sum = x + y;
		y = x;
		x = sum - y;
		System.out.println("output : x = " + x + ", y = " + y);
	}

	void swapStringsUsingTempVariable(String input1, String input2) {
		System.out.println("-----------Program-3-------------");
		System.out.println("input : input1 = " + input1 + ", input2 = " + input2);
		String temp = "";
		// swapping
		temp = input1;
		input1 = input2;
		input2 = temp;
		System.out.println("output: input1 = " + input1 + ", input2 = " + input2);
	}

	void swapStringsUsingStringMethod(String input1, String input2) {
		System.out.println("-----------Program-4-------------");
		String Concat = input1 + input2;
		System.out.println("input : input1 = " + input1 + ", input2 = " + input2);
		// swapping
		input1 = Concat.substring(6);
		input2 = Concat.substring(0, 6);
		System.out.println("output: input1 = " + input1 + ", input2 = " + input2);
	}

	public static void main(String[] args) {
		SwappingNumbersAndStrings swappingNumbersAndStrings = new SwappingNumbersAndStrings();
		swappingNumbersAndStrings.swapNumUsingTempVariable(10, 20);
		swappingNumbersAndStrings.swapNumUsingArithmatic(10, 20);
		swappingNumbersAndStrings.swapStringsUsingTempVariable("Techno", "Credits");
		swappingNumbersAndStrings.swapStringsUsingStringMethod("Techno", "Credits");
	}
}
