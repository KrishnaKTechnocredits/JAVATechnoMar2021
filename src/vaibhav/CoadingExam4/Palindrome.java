/*Coding Exam - 4 : 12th May'2021

Programming Test - 

String input = "Hi MAM hello NamaN techno";
output : MAM NamaN

*/

package vaibhav.CoadingExam4;

public class Palindrome {

	static boolean isPalindrome(String str) {

		String givenString = str;
		String reverseString = "";

		for (int index = givenString.length() - 1; index >= 0; index--) {
			char ch = givenString.charAt(index);
			reverseString = reverseString + ch;
		}

		if (givenString.equals(reverseString))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

		// Palindrome palindrome = new Palindrome();

		String input = "Hi MAM hello NamaN techno";
		String wordArr[] = input.split(" "); // [Hi, MAM, hello, NamaN, techno]
		String outputString = "";

		for (int index = 0; index < wordArr.length; index++) {
			if (isPalindrome(wordArr[index]))
				outputString = outputString + " " +wordArr[index];
		}

		System.out.println("output = " + outputString);

	}

}
