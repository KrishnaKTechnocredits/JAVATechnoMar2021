/*Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68
Hint : (45+5+111)FTTERTccde(12+56)
*/
package krati_Jain.Assignment_29;

import java.util.Scanner;

public class StringParsing {

	public static void main(String[] args) {
		StringParsing strgParsing = new StringParsing();
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string of your choice: ");
		String inputStr = scn.next(); // Te1Ch2noCr4e_%$d8iTs9
		strgParsing.getStringChar(inputStr);
	}

	void getStringChar(String inputStr) {
		int index = 0;
		String nums = "";
		String smallLetters = "";
		String capLetters = "";
		int evenSum = 0;
		int oddSum = 0;
		int tempNum = 0;
		int even = 0;
		int odd = 0;
		for (; index < inputStr.length(); index++) { // F12TT45ERT5cc56de111
			char charCheck = inputStr.charAt(index);
			if (Character.isDigit(charCheck))// 12T
				nums += charCheck; // 12

			else { // T
				if (!nums.equals("")) {
					tempNum = Integer.parseInt(nums);
					if (tempNum % 2 == 0) {
						even = tempNum;// 12
						evenSum += even;// 12
						// System.out.println("Even Numbers are : " + tempNum);
						// System.out.println("Even sum is : " + evenSum);
					} else {
						odd = tempNum;
						oddSum += odd;
						// System.out.println("Odd Numbers are : " + tempNum);
						// System.out.println("Odd sum is : " + oddSum);
					}
					if (Character.isLowerCase(charCheck)) // F
						smallLetters += charCheck;
					else if (Character.isUpperCase(charCheck)) //
						capLetters += charCheck;
					nums = "";

				} else {
					if (Character.isLowerCase(charCheck)) // F
						smallLetters += charCheck;
					else if (Character.isUpperCase(charCheck)) //
						capLetters += charCheck;
					if (!nums.equals("")) {
						tempNum = Integer.parseInt(nums);
						// nums = "";
					}
				}
			}
		}
		if (!nums.equals("")) { // F12TT45ERT5cc56de111 tempNum =
			tempNum = Integer.parseInt(nums);// 1
			if (tempNum % 2 == 0) {
				even = tempNum;
				evenSum += even;
			} else {
				odd = tempNum;
				oddSum += odd;
			}
		}

		System.out.println(
				"Sum of Odd numbers followed by Upper Case characters then Lower Case & sum of Even numbers\nat the end in a String: "
						+ oddSum + capLetters + smallLetters + evenSum);
	}

}
