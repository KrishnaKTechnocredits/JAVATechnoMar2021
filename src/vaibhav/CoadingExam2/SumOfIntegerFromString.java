/*Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53

*/

package vaibhav.CoadingExam2;

public class SumOfIntegerFromString {

	static String numStr = "";

	int getSum(String str) {
		int sum = 0;
		String tempNumStr = "";

		int num = 0;

		for (int index = 0; index < str.length(); index++) {
			
			char ch;
			ch = str.charAt(index);

			if (Character.isDigit(ch))	
				tempNumStr = tempNumStr + ch;
			else{
				num = Integer.parseInt(tempNumStr);
				numStr = numStr + "+" + tempNumStr;
				sum = sum + num;
				tempNumStr = "0";
			}
			
			if(index == str.length()-1) {
				num = Integer.parseInt(tempNumStr);
				numStr = numStr + "+" + tempNumStr;
				sum = sum + num;
			}
			
		}

		return sum;
	}

	public static void main(String[] args) {
		SumOfIntegerFromString sumOfIntegerFromString = new SumOfIntegerFromString();

		String str = "12h14i4w8sdc15";

		int outputSum = sumOfIntegerFromString.getSum(str);
		System.out.println(numStr + "=" + outputSum);
	}

}
