package priyanka_Kamble.assignment_32;
/*Assignment - 32 : 4th May'2021

program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
 */
public class SwapString {
	
	String swapStringWithTemp(String input1 , String input2) {
		String temp ="";
		temp= input1;
		input1 =input2;
		input2 = temp;
		return input2;
	}
	
	String swapStringWithOutTemp(String input1 , String input2) {
		if(input1.length()> input2.length()) {
			input2 =input1;
			return input2;
		}
		else 
			return input1;
		//input1;//techno 6
		//input2; //Credits 7
		//return input2;
	}
	
	public static void main(String[] args) {
		String input1 = "Techno" , input2 = "Credits";
		System.out.println("Swaping with Temp Variable :- \nInput1 - "+input1+ " & input2 - "+input2);
		System.out.println("output- input2 - "+new SwapString().swapStringWithTemp(input1, input2));
		//new SwapString().swapStringWithTemp(input1, input2);
		System.out.println("-----------------------------------------------");
		System.out.println("Swaping with out Temp Variable :- \nInput1 - "+input1+ " & input2 - "+input2);
		System.out.println("output- input2 - "+new SwapString().swapStringWithOutTemp(input1, input2));
	}
}
