/*2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
*/
package shilpa.Assignment_21;

public class SumOfDigitsInstr {

	void getSumOfDIgitsInStr(String str) {
		int sum = 0;
		int num = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 48 && ch <= 57) {
				num = Integer.parseInt(String.valueOf(ch));
				sum = sum + num;
			}
		}
		System.out.println("Sum of all digits in String is: " + sum);
	}

	public static void main(String[] args) {
		SumOfDigitsInstr sum = new SumOfDigitsInstr();
		sum.getSumOfDIgitsInStr("J7yu9y8h1h8j4b7j3jjb6");
	}
}
