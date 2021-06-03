/*program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"*/
package neha_Rathi.assignment32;

public class SwapString {
	
	static void swapString(String input1,String input2) {
		input1=input1+input2;
		input2=input1.substring(0, input1.length()-input2.length());
		input1=input1.substring(input2.length(), input1.length());
		System.out.println(input1+" : "+input2);
	}
	static void swapStringWithTemp(String input1,String input2) {
		String temp=input1;
		input1=input2;
		input2=temp;
		System.out.println(input1+" : "+input2);
	}

	public static void main(String[] args) {
		swapString("Techno","Credits");
		swapStringWithTemp("Techno","Credits");
	}
}
