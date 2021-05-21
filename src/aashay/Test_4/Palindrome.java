package aashay.Test_4;

import java.util.Arrays;

/*
 * Programming Test - 4 : 12th May'2021

String input = "Hi MAM hello NamaN techno";
output : MAM NamaN
 */
public class Palindrome {

	void palindromefromString(String input) {
		String palindrome = "";
		String[] inputString = input.split(" ");
		System.out.println("Array" + Arrays.toString(inputString));

		for (int index = 0; index < inputString.length; index++) {
			String indexValue = inputString[index];
			String reverse = "";
			int indexLength = indexValue.length();
			for (int innerIndex = indexLength - 1; innerIndex >= 0; innerIndex--) {
				reverse = reverse + indexValue.charAt(innerIndex);
			}
			if (reverse.equalsIgnoreCase(indexValue))
				palindrome += " " + reverse;
			
		}
		System.out.println("String is Palindrome : " + palindrome);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		String input = "Hi MAM hello NamaN techno";
		palindrome.palindromefromString(input);

	}

}
