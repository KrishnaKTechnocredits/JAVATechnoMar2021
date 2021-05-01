/*Assignment - 29 : 27th April'2021

Write the program to generate output in below format.
-> sum of all odd numbers + capital letter + small letter + sum of all even numbers
input : F12TT45ERT5cc56de111
output : 161FTTERTccde68

Hint : (45+5+111)FTTERTccde(12+56)
*/
package sourabh.Assignment29_String;

public class StringModify {
	void getStringModify(String strInput) {
		String strTemp = "";
		int sumEven = 0;
		int sumOdd = 0;
		int number = 0;
		String strUpper="";
		String strLower="";
		for (int index = 0; index < strInput.length(); index++) {
			char checkCh = strInput.charAt(index);
			if (Character.isDigit(checkCh)) {
				strTemp = strTemp + checkCh;// 1
				// number= Integer.parseInt(strTemp);
			} else if (!strTemp.equals("")) {
				number = Integer.parseInt(strTemp);
				if (number % 2 == 0)
					sumEven = sumEven + number;
				else
					sumOdd = sumOdd + number;

				strTemp = "";
			}
			if(Character.isUpperCase(checkCh))
				strUpper= strUpper+checkCh;
			else if(Character.isLowerCase(checkCh))
				strLower= strLower+checkCh;

		}
		if (!strTemp.equals("")) {
			number = Integer.parseInt(strTemp);
			if (number % 2 == 0)
				sumEven = sumEven + number;
			else
				sumOdd = sumOdd + number;
		}
		System.out.println("output : "+sumOdd+strUpper+strLower+sumEven);
	}

	public static void main(String[] args) {
		StringModify stringModify = new StringModify();
		stringModify.getStringModify("F12TT45ERT5cc56de111");
	}
}
