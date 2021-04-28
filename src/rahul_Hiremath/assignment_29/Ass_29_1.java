/*Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/

package rahul_Hiremath.assignment_29;

public class Ass_29_1 {

	String getDigits(String str) {
		String temp = "";
		int sum = 0;
		int evenNos = 0;
		int even = 0;
		int oddNos = 0;
		String uppercase = "";
		String lowercase = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			else {
				if (!temp.equals(""))
					sum = sum + Integer.parseInt(temp);
				if (sum % 2 == 0) {
					evenNos = evenNos + sum;
					sum = 0;
				} else {
					oddNos = oddNos + sum;
					sum = 0;
				}
				temp = "";
			}
			if (Character.isUpperCase(ch))
				uppercase = uppercase + ch;
			else if (Character.isLowerCase(ch))
				lowercase = lowercase + ch;
		}
		if (!temp.equals(""))
			even = Integer.parseInt(temp);
			if ( even % 2 == 0)
				evenNos = evenNos + even;
			else
				oddNos = oddNos + Integer.parseInt(temp);
		String finalString = oddNos + uppercase + lowercase + evenNos;
		return finalString;
	}

	public static void main(String[] args) {

		Ass_29_1 ass_29_1 = new Ass_29_1();
		String str = "F12TT45ERT5cc56de111r12p9d500";
		String expString = ass_29_1.getDigits(str);
		System.out.println("Expected string is: " + expString);
	}
}
