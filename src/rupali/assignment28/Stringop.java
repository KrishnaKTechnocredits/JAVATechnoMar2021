/*
 * Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis
 */

package rupali.assignment28;

public class Stringop {

	String getString(String str) {
		String digitstr = "";
		String upperstring = "";
		String lowerstring = "";
		for (int index = 0; index < str.length(); index++) {

			if (Character.isDigit(str.charAt(index)))
				digitstr = digitstr + str.charAt(index);
			else if (Character.isUpperCase(str.charAt(index)))
				upperstring = upperstring + str.charAt(index);
			else if (Character.isLowerCase(str.charAt(index)))
				lowerstring = lowerstring + str.charAt(index);
		}
		String output = digitstr + upperstring + lowerstring;
		return output;
	}

	String[] getstring(String[] strArray) {
		String[] output = new String[strArray.length];
		for (int index = 0; index < strArray.length; index++) {
			String arrStringItem = getString(strArray[index]);
			output[index] = arrStringItem;
		}
		return output;
	}

	public static void main(String[] args) {
		Stringop stringop = new Stringop();
		String str = "Te1Ch2noCr4e_%$d8iTs9";
		String[] strArray = { "123LeaRN567", "C3o4D6iN8g", "686F99rom0", "67Te8Chno6r8dIts" };
		System.out.println("Output 1 :" + stringop.getString(str));
		String outputFromArrayString[] = stringop.getstring(strArray);
		for (int index = 0; index < outputFromArrayString.length; index++) {
			System.out.print(outputFromArrayString[index] + " ");
		}
	}
}