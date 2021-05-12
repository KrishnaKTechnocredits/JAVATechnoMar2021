/*Assignment - 29 : 27th April'2021


Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)-- 161/ 68*/

package monika.Assignment29_Tricky;

public class PrintInSequence {
	int sumEven = 0;
	int sumOdd = 0;

	void getSequence(String input) {
		String s = "";
		int n = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				s += input.charAt(index);
			} else {
				if (!s.equals("")) {
					n = Integer.parseInt(s);
					if (n % 2 == 0) {
						sumEven += n;
						s = "";
					} else
						sumOdd += n;
					s = "";
				}
			}
			if (index == input.length() - 1) {
				n = Integer.parseInt(s);
				if (n % 2 == 0) {
					sumEven += n;
				} else
					sumOdd += n;
			}
		}
	}

	String getLetters(String input) {
		String s = "", d = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				s += input.charAt(index);
			} else if (Character.isLowerCase(input.charAt(index)))
				d += input.charAt(index);
		}
		return s + d;
	}
	public static void main(String[] args) {
		PrintInSequence obj = new PrintInSequence();
		String d = "";
		obj.getSequence("F12TT45ERT5cc56de111");
		d = obj.getLetters("F12TT45ERT5cc56de111");
		System.out.println(obj.sumOdd + d + obj.sumEven);
	}
}
