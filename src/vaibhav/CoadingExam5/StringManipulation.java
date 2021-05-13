/*Coding Exam - 5 [ Medium Complexity] : 13th May'2021

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy

*/


package vaibhav.CoadingExam5;

public class StringManipulation {
	
	String getReveresString(String input) { // Hi
		String revString = "";
		
		for (int index = input.length() - 1; index >= 0; index--) {
			
			char ch = input.charAt(index);			
			revString = revString + ch;
		}

		return revString;
	}

	void getOutput(String[] arr) {
		
		for (int index = 0; index <= arr.length - 1; index++) {
			String temp = getReveresString(arr[index]);
			arr[index] = temp;
		}

		String output = "";
		for (int index = 0; index <= arr.length - 1; index++) {
			output = output + " " + arr[index];
		}
		
		System.out.println(output.trim());
	}

	public static void main(String[] args) {
		StringManipulation stringManipulation = new StringManipulation();
		
		String inputString = "hi hello how are you";
		String arr[] = inputString.split(" ");
		stringManipulation.getOutput(arr);

	}
}
