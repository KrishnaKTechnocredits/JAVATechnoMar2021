/*Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"*/

package krati_Jain.codingExam2;

public class StringCodingExam2 {public static void main(String[] args) {

	StringCodingExam2 extraStringCodingExam2 = new StringCodingExam2();
	String inputStr = "12h14i4w8sdc15";
	extraStringCodingExam2.getStringWithNum(inputStr);

}

void getStringWithNum(String inputStr) {
	int index = 0;
	String digit = "";
	int num = 0;
	int sum = 0;
	int count = 0;
	for (; index < inputStr.length(); index++) { // 12h14i4w8sdc15
		char charCheck = inputStr.charAt(index);
		if (Character.isDigit(charCheck)) {//1
			digit += charCheck; // 1
			//System.out.println("Digit is : " + digit);
		} else if (Character.isLetter(charCheck)) {
			if (!digit.equals("")) {
				num = Integer.parseInt(digit);
				sum += num;
				// System.out.println("Sum is: " + sum);
			}
			digit = "";
		}
	}
	if (!digit.equals("")) {
		num = Integer.parseInt(digit);
		sum += num;
		System.out.println("Sum of all the numbers in the String is: " + sum);
	}
}

}
