package aashay.Test_5;
/*
 * Program : 2 [ Medium Complexity]

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy

 */

public class ReverseEachWordOfString {

	void reverseWordsOfString(String input) {
		String finalString = "";
		String[] inputArray = input.split(" ");
		for (int index = 0; index < inputArray.length; index++) {
			StringBuffer sbuffer = new StringBuffer(inputArray[index]);
			sbuffer.reverse();
			finalString += " " + sbuffer;
		}
		System.out.println("String reverese: " + finalString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseEachWordOfString reverseEachWordOfString = new ReverseEachWordOfString();
		String input = "hi hello how are you";
		reverseEachWordOfString.reverseWordsOfString("hi hello how are you");
	}

}
