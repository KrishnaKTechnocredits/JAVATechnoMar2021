package amrutaM.arrayAssignments.AugArrayAssignments.Assignment18;

import java.util.Arrays;

/*Program 1 : 
Reverse all elements of an array at same position   
String[] input = {"madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav"}; 
output : [ivhdam, ihbrus, ahen, hsednas, tikna, vahbiav]  
Note : you can print array content directly using sop(Arrays.toString(output)); 
toString() method of Arrays class return String.   
Method should take String array and return String array. 
*/
public class Program1 {

	String getRevString(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output += input.charAt(index);
		}
		return output;
	}

	String[] getReverseOfAllArrayElements(String[] input) {
		for (int index = 0; index < input.length; index++) {
			input[index] = getRevString(input[index]);
		}
		return input;
	}

	public static void main(String[] args) {
		String[] input = { "madhvi", "surbhi", "neha", "sandesh", "ankit", "vaibhav" };
		System.out.println("Input array is --> " + Arrays.toString(input));
		Program1 program1 = new Program1();
		String[] ans = program1.getReverseOfAllArrayElements(input);
		System.out.println("Reverse array is --> " + Arrays.toString(ans));

	}
}
