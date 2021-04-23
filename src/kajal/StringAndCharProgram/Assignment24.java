/*
 Assignment - 24 : 18th April'2021
Create a method which will return middle character of each String. Print output in main method.
String[] arr = {"Techno", "Hello", "Credits"};
output : c l d
Note:  for name having even length, consider length/2-1 index is middle character.
 */

package kajal.StringAndCharProgram;

public class Assignment24 {

	char[] middleChar(String[] input) {
		char[] midChar = new char[input.length];
		
		for(int index=0; index<input.length; index++) {
			if(input[index].length()%2 == 0)
				midChar[index]=input[index].charAt(input[index].length()/2 -1);
			else 
				midChar[index]=input[index].charAt(input[index].length()/2);
		}
			return midChar;
	}
	
	public static void main(String [] args) {
		String[] arr = {"Techno", "Hello", "Credits"};
		
		new Assignment24().middleChar(arr);
		char[] ch = new Assignment24().middleChar(arr);
		for (int index = 0; index < ch.length; index++) {
			System.out.print(ch[index] + " ");
		}
	}
}