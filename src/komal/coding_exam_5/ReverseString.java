package komal.coding_exam_5;

import java.util.Scanner;

/*Write a java program to reverse each word of a given string
input : hi hello how are you
output : ih olleh woh era uoy*/

public class ReverseString {
	String getReverseWordString(String str) {
		StringBuffer sb1 = new StringBuffer(str);
		StringBuffer sb2 = new StringBuffer(str);
		sb2.reverse();
		return sb2.toString();
	}

	public static void main(String[] args) {
		ReverseString reversestring = new ReverseString();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your input string :");
		String str = scanner.nextLine();
		String[] input = str.split(" ");
		String output = "";
		for (int index = 0; index < input.length; index++) {
			String returnString = reversestring.getReverseWordString(input[index]);
			output = output + " " + returnString;
		}
		System.out.println("Output String is :" + output);
		scanner.close();
	}
}
