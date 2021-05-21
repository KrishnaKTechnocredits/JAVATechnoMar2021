package priyanka_Kamble.assignment_29;

/*Assignment - 29 : 27th April'2021
.
Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)*/
public class SumOFOddEvenCapSmall {

	void sum(String str) {
		int oddNum = 0, evenNum = 0, tempNumber = 0;
		String upperCaseLetter = "", loweCaseLetter = "", temp = "";

		for (int index = 0; index < str.length(); index++) {
				
			if (Character.isUpperCase(str.charAt(index))) {
				upperCaseLetter += str.charAt(index);
				// System.out.println("upperCaseLetter" +upperCaseLetter);
			} else if (Character.isLowerCase(str.charAt(index))) {
				loweCaseLetter += str.charAt(index);
				// System.out.println("Lowercase"+loweCaseLetter);
			}
			//char ch = str.charAt(index);
			if (Character.isDigit(str.charAt(index))) {
				temp += str.charAt(index);
			} else {
				if (!temp.equals("")) {
					tempNumber = Integer.parseInt(temp);
					if (tempNumber % 2 == 0) {
						evenNum += tempNumber;
					} else {
						oddNum += tempNumber;
					}
					temp = "";

				}
			}

		}
		if (!temp.equals("")) {
			tempNumber = Integer.parseInt(temp);
			if (tempNumber % 2 == 0) {
				evenNum += tempNumber;
			} else {
				oddNum += tempNumber;

			}

		}
		System.out.println("OUTPUT - " + oddNum + upperCaseLetter + loweCaseLetter + evenNum);

	}

	public static void main(String[] args) {
		String str = "F12TT45ERT5cc56de111";
		new SumOFOddEvenCapSmall().sum(str);
	}
}
