/*
 Coding Exam - 2 : 26th April 2021

Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
 */

package upasana.coding_exam_2;

public class StringSumInt {

	void sumInt(String str) {

		String output = "";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index))) {
				//System.out.println(str.charAt(index));
				output = output + str.charAt(index);

			} else if (output != "") {
				sum = sum + Integer.parseInt(output);
				//System.out.println(output);
			output = "";

			}
		}
		if(output!="")
			sum = sum + Integer.parseInt(output);

		System.out.println(sum);

	}

	public static void main(String[] args) {

		String str = "12h14i4w8sdc15";
		new StringSumInt().sumInt(str);
	}

}
