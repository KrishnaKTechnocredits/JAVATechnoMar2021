/*
 Programming Test - 4 : 12th May'2021

String input = "Hi MAM hello NamaN techno";
output : MAM NamaN
 */
package priyanka_Panat.coding_exam_4;

public class PalindromeString {

	boolean isPalinDrome(String input) {
		String strRev = "";
		for (int i=input.length()-1;i>=0;i--) {
			strRev=strRev + input.charAt(i);
		}
		if (input.equalsIgnoreCase(strRev))
			return true;
		else
			return false;

	}

	String getStringWithPalinDrome(String[] inputStr) {
		String temp = " ";
		for (int i = 0; i < inputStr.length; i++) {
			boolean ans = isPalinDrome(inputStr[i]);
			if (ans == true) {
				temp = temp + inputStr[i] + " ";
			}
		}
		return temp;

	}

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		String givenStr = " madam Hi MAM hello NamaN techno Nitin";
		String[] str = givenStr.split(" ");
		String result = palindromeString.getStringWithPalinDrome(str);
		System.out.println(" Palindrome string from a given strings are : " + result);
	}
}
