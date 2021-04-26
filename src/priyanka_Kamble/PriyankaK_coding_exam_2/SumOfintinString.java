package priyanka_Kamble.PriyankaK_coding_exam_2;
/*Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53  */

public class SumOfintinString {

	int findInt(String str) {
		int sum = 0;
		String str1 = "";
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit((str.charAt(index)))) {
				if (index < str.length() - 1 && Character.isDigit((str.charAt(index + 1)))) {
					str1 += str.charAt(index);
					//System.out.println("" + str1);//1
				} else {
					str1 += str.charAt(index);//2
					//System.out.println("" + str1);
					sum = sum + Integer.parseInt(str1);
					str1 = "";// null keli String
				}
			}
		}
		System.out.println("Sum of Integer = " + sum);
		return sum;
	}

	public static void main(String[] args) {
		String str = "12h14i4w8sdc15";
		new SumOfintinString().findInt(str);
		// int resultSum = new SumOfintinString().findInt(str);
		// System.out.println("Sum of Integer = " +resultSum);

	}
}
