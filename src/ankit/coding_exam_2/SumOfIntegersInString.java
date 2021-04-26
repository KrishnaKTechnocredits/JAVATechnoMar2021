/*
Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
 */

package ankit.coding_exam_2;

public class SumOfIntegersInString {

	void getIntegerFromString(String str) {
		int finalSum = 0;
		for(int index = 0 ; index <str.length() ; index++) {
			if(Character.isDigit(str.charAt(index))) {
				if(index < (str.length()-1) && Character.isDigit(str.charAt(index+1))) {
					finalSum = finalSum + Character.getNumericValue(str.charAt(index))*10 + Character.getNumericValue(str.charAt(index+1));
					index= index + 1;
				}else {
					finalSum = finalSum + Character.getNumericValue(str.charAt(index));
				}
			}
		} System.out.println(finalSum);// Code is working only when number is less than 100.
	}

	public static void main(String[] args) {
		SumOfIntegersInString sumOfIntegersInString = new SumOfIntegersInString();
		sumOfIntegersInString.getIntegerFromString("12h14i4w8sdc15");
	}
}
