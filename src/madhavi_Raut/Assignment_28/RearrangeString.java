package madhavi_Raut.Assignment_28;
/*Assignment - 28 : 24th April'2021

Write a method to return String having all numeric numbers first followed by Capital letter followed by Small letter. 
String msg = "Te1Ch2noCr4e_%$d8iTs9"
output : 12489TCCTehnoredis*/

public class RearrangeString {
	String getRearrangedString(String strMessage) {
		String strNumeric = "", strUpperCases = "", strLowerCases = "";
		for (int index = 0; index < strMessage.length(); index++) {
			char ch = strMessage.charAt(index);
			if (Character.isDigit(ch))
				strNumeric += ch;
			else if (Character.isUpperCase(ch))
				strUpperCases += ch;
			else if (Character.isLowerCase(ch))
				strLowerCases += ch;
		}
		return strNumeric + strUpperCases + strLowerCases;
	}

	public static void main(String[] args) {
		System.out.println("Below is the rearranged string:");
		System.out.println(new RearrangeString().getRearrangedString("Te1Ch2noCr4e_%$d8iTs9"));
	}
}
