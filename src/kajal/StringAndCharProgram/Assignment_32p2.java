/*program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/

package kajal.StringAndCharProgram;

public class Assignment_32p2 {
	String tempStr;

	void swapString(String str1, String str2) {

		tempStr = str1;
		str1 = str2;
		str2 = tempStr;
		System.out.println(str1 + "," + str2);
	}

	public static void main(String[] args) {

		Assignment_32p2 assign = new Assignment_32p2();
		assign.swapString("Techno", "Credits");

	}
}
