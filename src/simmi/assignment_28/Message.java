/*Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/

package simmi.assignment_28;

import java.util.Scanner;

public class Message {
	String getString(String str) {
		String digit = "";
		String upper = "";
		String lower = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				digit = digit + str.charAt(index);
			else if (Character.isUpperCase(str.charAt(index)))
				upper = upper + str.charAt(index);
			else if (Character.isLowerCase(str.charAt(index)))
				lower = lower + str.charAt(index);
		}
		String output = digit + upper + lower;
		return output;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String to check");
		String msg = scanner.next();
		Message message = new Message();
		String output = message.getString(msg);
		System.out.println("The output is " + output);
		scanner.close();
	}
}
