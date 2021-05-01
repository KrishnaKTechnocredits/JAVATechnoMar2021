/*Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
*/
package simmi.exam2;

public class SumOfInteger {
	int getSumInteger(String str) {
		int sum = 0;
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				output = output + ch;
			} else if (output != "") {
				sum = sum + Integer.parseInt(output);
				output = "";
			}
		}
		if (output != "")
			sum = sum + Integer.parseInt(output);
		return sum;
	}

	public static void main(String[] args) {
		String msg = "12h14i4w8sdc15";
		SumOfInteger sumOfInteger = new SumOfInteger();
		int output = sumOfInteger.getSumInteger(msg);
		System.out.println("Sum of integer in the given string is " + output);
	}
}
