/*
 Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
 */
package priyanka_Panat.coding_exam_5;

public class ReverseString {
	String getRevWordString(String input) {
		String[] inputStr = input.split(" ");
		String temp = "";
		for (int index = 0; index < inputStr.length; index++) {
			StringBuffer sb = new StringBuffer(inputStr[index]);
			temp = temp + sb.reverse() + " ";
		}
		return temp;
	}

	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String givenStr = "hi hello how are you";
		String output = reverseString.getRevWordString(givenStr);
		System.out.println("Reverse String is : " + output);
	}
}
