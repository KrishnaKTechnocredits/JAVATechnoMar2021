/*Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/

package krati_Jain.Assignment_28;

import java.util.Scanner;

public class ReturnStringNums {

	public static void main(String[] args) {
		ReturnStringNums returnStringNums = new ReturnStringNums();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string of your choice: ");
		String inputStr = scn.next(); // Te1Ch2noCr4e_%$d8iTs9
		returnStringNums.getStringChar(inputStr);
	}

	void getStringChar(String inputStr) {
		int index = 0;
		String nums = "";
		String smallLetters = "";
		String capLetters = "";
		// String spcChars = "";
		for (; index < inputStr.length(); index++) { // Te1Ch2noCr4e_%$d8iTs9
			char charCheck = inputStr.charAt(index);
			if (Character.isDigit(charCheck))
				nums += charCheck;
			else if (Character.isLowerCase(charCheck))
				smallLetters += charCheck;
			else if (Character.isUpperCase(charCheck))
				capLetters += charCheck;
			/*
			 * else spcChars += charCheck;
			 */
		}

		System.out.println(nums + capLetters + smallLetters);
	}

}
