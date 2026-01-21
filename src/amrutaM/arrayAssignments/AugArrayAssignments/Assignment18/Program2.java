package amrutaM.arrayAssignments.AugArrayAssignments.Assignment18;

import java.util.Arrays;

/*Program 2 : 
Reverse all elements and place it in a reverse order  
String[] input = {"techno", "credits", "krishna","harsh"} 
output : [hsrah, anhsirk, stiderc, onhcet]  
Note : use sop(Arrays.toString(output)) to print the array content.
*/
public class Program2 {

	String reverseString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		return output;
	}

	String[] reverseAllElements(String[] input) {
		String[] output = new String[input.length];
		int count = 0;
		for (int index = input.length - 1; index >= 0; index--) {
			output[count] = reverseString(input[index]);
			count++;
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "techno", "credits", "krishna", "harsh" };
		System.out.println("Input array elements are --> "+ Arrays.toString(input));
		Program2 program2 = new Program2();
		System.out.println("\nReverse array elements with reverse order --> "+Arrays.toString(program2.reverseAllElements(input)));

	}
}
