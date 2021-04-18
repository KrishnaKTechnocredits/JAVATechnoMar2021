/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package rahul_Hiremath.assignment_20;

public class Ass_20_2 {

	int sum;
	int digit;

	void sumDigits(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int ascii = (int) ch;
			if (ascii >= 47 && ascii <= 58) {
				char charDigit = (char) ascii;
				digit = Character.getNumericValue(charDigit);
				sum = sum + digit;
			}
		}
		System.out.println("Sum of all digits in String is: " + sum);
	}

	public static void main(String[] args) {

		Ass_20_2 ass_20_2 = new Ass_20_2();
		ass_20_2.sumDigits("J7yu9y8h1h8j4b7j3jjb6");
	}
}
