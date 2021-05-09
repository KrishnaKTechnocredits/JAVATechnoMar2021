package aashay.Test_2;
/*
 * Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
 */

public class SumOfAllIntegers {

	void sumOfInteger(String str) {
		int sum = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			String tempStr = "";
			if (Character.isDigit(ch)) {
				tempStr = Character.toString(ch);
				for (int innerIndex = index + 1; innerIndex < str.length(); innerIndex++) {
					ch = str.charAt(innerIndex);
					if (Character.isDigit(ch)) {
						tempStr += ch;
						index++;

					}
					sum += Integer.parseInt(tempStr);
					tempStr = "";
					index++;
					break;

				}

			}

		}
		System.out.println("Total integer sum is: "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfAllIntegers sumOfAllIntegers = new SumOfAllIntegers();
		String str = "12h14i4w8sdc15";
		sumOfAllIntegers.sumOfInteger(str);
	}

}
