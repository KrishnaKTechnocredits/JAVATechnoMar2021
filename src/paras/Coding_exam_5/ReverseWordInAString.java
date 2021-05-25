/*
Program : 2 [ Medium Complexity]

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
 */
package paras.Coding_exam_5;

import mayur.assignment18.getAsciiValueOfChar;

public class ReverseWordInAString {
		
	String getRevWordString(String input){
		String output = "";
		String[] arr = input.split(" ");
		for(int index = 0; index < arr.length; index++) {
			StringBuffer stringB = new StringBuffer(arr[index]);
			stringB.reverse();
			output = output + " " + stringB;
		}
		return output.trim();
	}
	
	public static void main(String[] args) {
		ReverseWordInAString reverseWordInAString = new ReverseWordInAString();
		String output = reverseWordInAString.getRevWordString("hi hello how are you");
		System.out.println(output);
		
	}
}
