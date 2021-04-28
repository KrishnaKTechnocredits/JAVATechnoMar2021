/*Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)-- 161/ 68*/

package monika.Assignment29_Tricky;

public class PrintInSequence {
	String s = "";
	int n = 0;
	int sumEven = 0;
	int sumOdd = 0;

	void getSequence(String input) {
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
		}
		
		sumOdd+""+sumEven;
	}

	String getLetters(String input) {
		String s = "", d = "";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				s += input.charAt(index);
			} else if (Character.isLowerCase(input.charAt(index)))
				d += input.charAt(index);
		}
		System.out.println(s + d);
		return s + d;

	}

	public static void main(String[] args) {
		PrintInSequence obj = new PrintInSequence();
		obj.getSequence("F12TT45ERT5cc56de111");
		// obj.getLetters("F12TT45ERT5cc56de111");
	}

}
