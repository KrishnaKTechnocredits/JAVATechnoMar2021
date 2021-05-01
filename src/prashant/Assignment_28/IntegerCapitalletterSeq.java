/*Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/
package prashant.Assignment_28;

public class IntegerCapitalletterSeq {
	String getstr(String str) {
		String num = "";
		String upperCase = "";
		String lowercase = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				num = num + ch;
			} else if (Character.isUpperCase(ch)) {
				upperCase = upperCase + ch;
			} else if (Character.isLowerCase(ch)) {
				lowercase = lowercase + ch;
			}
		}
		return num + upperCase + lowercase;
	}

	public static void main(String[] args) {
		IntegerCapitalletterSeq test = new IntegerCapitalletterSeq();
		String str = "Te1Ch2noCr4e_%$d8iTs9";
		String s = test.getstr(str);
		System.out.println("Numeric Numbers followed by Capital Letter followed by small letters of given string " + s);
	}
}
