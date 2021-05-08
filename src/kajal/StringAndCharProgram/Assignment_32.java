/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/
package kajal.StringAndCharProgram;

public class Assignment_32 {

	void swapString(String input1, String input2) {
		String temp = "";
		temp = input1;
		input1 = input2;
		input2 = temp;
		System.out.println(input1 + "," + input2);
	}

	public static void main(String[] args) {
		Assignment_32 assign = new Assignment_32();
		assign.swapString("Techno", "Credits");
	}

}
