/*Program 1 : 
WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"*/

package ami.Coding_Exam_2;

public class SumOfAllInteger {
	String digit = "";
	int num = 0;
	int sum = 0;

	void IntegrSumString(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isLetter(ch)) {
				if (!digit.equals("")) {
					num = Integer.parseInt(digit);
					sum += num;
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

	public static void main(String[] args) {
		SumOfAllInteger sumOfAllInteger = new SumOfAllInteger();
		String str = "12h14i4w8sdc15";
		sumOfAllInteger.IntegrSumString(str);

	}

}
