package monika.Assignment28_StringPrograms;

/*Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/
public class SequenceOfString {

	String getSequenceOfString(String input) {
		String digit = "", upperCase = "", lowerCase = "";

		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				digit += input.charAt(index);
			else if (Character.isUpperCase(input.charAt(index)))
				upperCase += input.charAt(index);
			else if (Character.isLowerCase(input.charAt(index)))
				lowerCase += input.charAt(index);
		} /*
			 * System.out.println(digit); System.out.println(upperCase);
			 * System.out.println(lowerCase);
			 */
		digit = digit + upperCase + lowerCase;
		return digit;
	}

	public static void main(String[] args) {
		SequenceOfString obj = new SequenceOfString();
		System.out.println(obj.getSequenceOfString("Te1Ch2noCr4e_%$d8iTs9"));
	}

}
