/*
Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
 */
package radha.Codingtest5;

public class StringReverse {

	String getRevWordString(String input) {
		String temp = "";
		String[] inputArr = input.split(" ");
		for (int index = 0; index < inputArr.length; index++) {
			temp = temp + " " + findRevWord(inputArr[index]);
		}
		temp = temp.trim();
		return temp;
	}

	private StringBuffer findRevWord(String word) {
		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		return sb;
	}

	public static void main(String[] args) {
		StringReverse reverseStr = new StringReverse();
		String input = "hi hello how are you";
		String rev = reverseStr.getRevWordString(input);
		System.out.println("Reverse string is : " + rev);
	}
}
