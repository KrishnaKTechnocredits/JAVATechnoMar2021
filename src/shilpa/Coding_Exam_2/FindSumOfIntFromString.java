/*Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53*/
package shilpa.Coding_Exam_2;

public class FindSumOfIntFromString {
	void getSumOfIntegersFrmStr(String str) {
		int sum = 0;
		for (int index = 0; index < (str.length() - 1); index++) {
			String str2 = "";
			if ((Character.isDigit(str.charAt(index))) && (Character.isDigit(str.charAt(index + 1)))) {
				str2 = (Character.toString(str.charAt(index))) + (Character.toString(str.charAt(index + 1)));
				sum = sum + Integer.parseInt(str2);
				index++;
			} else if (Character.isDigit(str.charAt(index)))
				sum = sum + Integer.parseInt(String.valueOf(str.charAt(index)));

		}
		System.out.println("sum of all the integer from the given string:= " + sum);
	}

	public static void main(String[] args) {
		FindSumOfIntFromString findSumOfIntFromString = new FindSumOfIntFromString();
		findSumOfIntFromString.getSumOfIntegersFrmStr("12h14i4w8sdc15");
	}

}
